class Node:
    def __init__(self , val):
        self.data = val
        self.next = None

class SinglyLL:
    def __init__(self):
        self.head = None
        self.count = 0

    def append(self , val):
        newnode = Node(val)

        if self.head == None:
            self.head = newnode

        else:
            current = self.head

            while current.next is not None:
                current = current.next

            current.next = newnode

        self.count+=1

    def traversal(self):
        if self.head == None:
            print("List is empty")
        else:
            current = self.head
            while current is not None:
                print(current.data , end = "-> ")
                current = current.next
            print('null')

    # def 
    def insertAtPos(self , idx , val):
        newnode = Node(val)

        if idx < 1 or idx > self.count + 1:
            print("Invalid idx")
        elif idx == 1:
            current = self.head
            newnode.next = current
            self.head = newnode 
            self.count+=1

        elif idx == self.count+1:
            self.append(val)
        else:    
            current = self.head
            i = 0
            while i != idx-1 and current is not None:
                current = current.next
                i+=1
            newnode.next = current.next
            current.next = newnode
            print("Value inserted successfully")
            self.count+=1

    def deleteNode(self , idx):
            if idx < 1 or idx > self.count:
                print('Invalid index')
            elif idx == 1:
                current = self.head
                self.head = current.next
                del current
                print("Node Delete")
                self.count-=1
            else:
                current = self.head
                previous = None
                i = 0
                while i < idx  and current is not None:
                    previous = current
                    current = current.next
                    i+=1

                if current.next is not None:
                    previous.next = current.next
                else:
                    previous.next = None
                del current
                self.count-=1
        

                 


def main():
    # n = int(input("Enter number of initial elements : "))
    # ll = SinglyLL()
    # for i in range(n):
    #     val = int(input("Enter value = "))
    #     ll.append(val)

    # ll.traversal()

    # print(ll.count)
    # ll.insertAtPos(6, 30)

    # print(ll.count)
    # ll.traversal()

    ll = SinglyLL()
    ll.append(10)
    ll.append(20)
    ll.append(30)
    ll.append(40)

    ll.traversal() # 10 20 30 40
    print(ll.count) #4

    ll.insertAtPos(2 , 25) #10 20 25 30 40
    ll.traversal() 
    print(ll.count) #5

    ll.deleteNode(2)
    ll.traversal()  #10 20 30 40
    print(ll.count) #4
if __name__ == "__main__":
    main()

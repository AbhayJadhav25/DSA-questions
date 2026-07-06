#Dubly Linked List
class Node:
    def __init__(self , val):
        self.val = val
        self.next = None
        self.prev = None

class DoublyLL:
    def __init__(self):
        self.head = None
        self.count = 0

    def append(self , val):
        newnode = Node(val)

        if self.head == None:
            self.head = newnode
            self.count+=1
        else:
            current = self.head
            previous = None
            while current.next is not None:
                current = current.next
                previous = current

            current.next = newnode
            current.prev = previous
            self.count+=1

    def traversal(self):
        if self.head == None:
            print("List is Empty")
        else:
            current = self.head
            while current is not None:
                print(current.val , end = "-> ")
                current = current.next
            print('null')

    def insert_at_begging(self , val):
        newnode = Node(val)
        current = self.head
        
        newnode.next = current
        current.prev = newnode
        self.head = newnode

        self.count+=1
        print('Insert successfully')        

    def insert_at_last(self , val):
        newnode = Node(val)
        if self.head == None:
            self.insert_at_begging(val)
        else:
            current = self.head

            while current.next is not None:
                current = current.next

            current.next = newnode
            newnode.prev = current
            self.count+=1

    def insert_at_position(self , idx , val):
        newnode = Node(val);
        if idx < 1 or idx > self.count + 1:
            print("Invalid index")

        elif idx == 1:
            self.insert_at_begging(val)
        
        elif idx == self.count + 1:
            self.insert_at_last(val)

        else:
            current = self.head
            previous = None
            i = 0
            while i < idx and current.next is not None:
                previous = current
                current = current.next
                i+=1
            previous.next = newnode
            newnode.next = current
            newnode.prev = previous

            self.count+=1

    def delete_at_position(self , idx):
        if idx < 1 or idx > self.count:
            print("Invalid index")

        elif idx == 1:
            current = self.head
            self.head = current.next
            if self.head is not None:
                self.head.prev = None

            del current
            self.count-=1

        else:
            current = self.head 
            previous = None
            i = 0
            while i < idx and current.next is not None:
                previous= current
                current = current.next
                i+=1
            if current.next == None:
                previous.next = None
            else:
                previous.next = current.next
                current.next.prev = previous

            del current

            print("Deleted Successfully")
            self.count-=1

def main():
    dll = DoublyLL()
    dll.append(10);
    dll.append(20);
    dll.append(30);
    dll.append(40);
    dll.traversal()
    print()
    dll.insert_at_begging(5)
    dll.insert_at_begging(1)
    dll.traversal()
    print()
    dll.insert_at_last(50)
    dll.insert_at_last(60)
    dll.traversal()
    print()
    dll.insert_at_position(5 , 35)
    dll.traversal()
    print()
    dll.delete_at_position(1)
    dll.traversal()
    print()
    dll.delete_at_position(7)
    dll.traversal()
    print()
    dll.delete_at_position(4)
    dll.traversal()

if __name__ == "__main__":
    main()
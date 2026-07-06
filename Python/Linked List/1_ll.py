class Node:
    def __init__(self , data):
        self.data = data
        self.next = None

def display(head):
    currentNOde =head
    while currentNOde:
        print(currentNOde.data , end = "->" )
        currentNOde = currentNOde.next

    print("null") 
node1 = Node(10)
node2 = Node(20)
node3 = Node(30)
node4= Node(40)

node1.next = node2
node2.next = node3
node3.next = node4

display(node1)
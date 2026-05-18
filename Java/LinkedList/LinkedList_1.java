public class LinkedList_1{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    static int size = 0;

    public void addFirst(int data){

        //create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }

        //step 2 - newnode -> next = head
        newNode.next = head;

       //step 3 - head = newNode
       head = newNode;

       size+=1;
    }

    public void addLast(int data){
        //create Node
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
        }

        //Step 2 -> tail.next = newNode;
        tail.next = newNode;

        //step 3 -> tail = newNode;
        tail = newNode;

        size+=1;
    }

    public void printLL(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        LinkedList_1 ll = new LinkedList_1();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(40);

        ll.printLL();
    }

}
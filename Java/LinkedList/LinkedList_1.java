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
    public void addMiddle(int data , int idx){

        if(idx < 1 || idx > size+1){
            System.out.println("Invalid index");
            return;
        }

        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        if(idx==1){
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        if(idx == size+1){
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
            size++;
            return;
        }
      
        Node temp = head;
        int i = 1;
        while(i < idx - 1 && temp.next!=null){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return;
    }

    int removeFirst(){
        if(head==null){
            System.out.println("Linked List is empty");
            return -1;
        }
        if(head.next == null){
            int val = head.data;
            head = tail=null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public static void main(String[] args) {
        LinkedList_1 ll = new LinkedList_1();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(40);
        ll.addMiddle(25, 4);
        // System.out.println("Size of LinkedList = "+size);
        int firstDelete = ll.removeFirst();
        System.out.println("Deleted Value = "+firstDelete);
        ll.printLL();
        

    }

}
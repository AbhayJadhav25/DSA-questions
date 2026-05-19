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
        System.out.print("Null\n");
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
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    int removeLast(){
        if(head==null){
            System.out.println("Linked List is empty");
            return -1;
        }
        int val = tail.data;
        if(head==tail){
            head=tail=null;
            size--;
            return val;
        }
        //solution 1 : temp.next!=tail -->stop at second last node.
        
        /*Node temp = head;
        while(temp.next !=tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;*/

        Node temp = head;
        for(int i= 0 ; i<size - 2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
        
    }
    int removeByIndex(int idx){

        if(idx < 1 || idx > size){
            System.out.println("Invalid index");
        }
        if(head==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        if(idx == 1){
            int val = removeFirst();
            return val;
        }
        if(idx == size){
            int val = removeLast();
            return val;
        }
        Node temp = head;
        for(int i = 1 ; i<idx-1; i++){
            temp = temp.next;
        }

        int val = temp.next.data;
        if(temp.next.next == null){
            temp.next = null;
            tail = temp;
        }else{
            temp.next = temp.next.next;
        }
        size--;
        return val;
    }
    void removeByValue(int value){
        if(head==null){
            System.out.println("Linked is Empty");
            return;
        }
        if(value == head.data){
            int val = removeFirst();
            System.out.println("Value Delete");
            size--;
            return;
        }
        if(value==tail.data){
            int val = removeLast();
            System.out.println("Value Delete");
            size--;
            return;
        }
        Node temp = head;
        int i = 1;
        while(temp.data!=value){
            temp = temp.next;
            i++;
        }
        int val = removeByIndex(i);
        System.out.println("Deleted Value = "+val);
        size--;
    }

    int search(int key){
        if(head==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        if(head.data == key){
            return 1;
        }
        if(tail.data == key){
            return size;
        }
        int i = 1;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList_1 ll = new LinkedList_1();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(30);
        ll.addLast(40);
        ll.addMiddle(25, 3);
        // System.out.println("Size of LinkedList = "+size);

        // ll.printLL();
        // int firstDelete = ll.removeFirst();
        // System.out.println("Deleted Value = "+firstDelete);
        // int lastDelete = ll.removeLast();
        // System.out.println("Deleted Value = "+lastDelete);
        // ll.printLL();
        // lastDelete = ll.removeLast();
        // System.out.println("Deleted Value = "+lastDelete);
        // ll.printLL();

        // ll.printLL();
        // int delete = ll.removeByIndex(5);
        // System.out.println("Delete Value = "+delete);

        // ll.printLL();
        // ll.removeByValue(30);

        ll.printLL();
        int ans = ll.search(50);
        if(ans==-1){
            System.out.println("Value not Found");
        }else{
            System.out.println("Value Found at position  =  "+ans);
        }
    }

}
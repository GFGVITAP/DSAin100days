
public class DoubleLL {
    //creating a node
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev= null;
        }}
        //initialising conditions
        public static Node head;
        public static Node tail;
        public static int size;
        //adding a node at ebergenning
        public  void addfirst(int data){
            //creating a new node
            Node newNode= new Node(data);
            //check if dll is empty or not
            if(head== null){
                head= tail=newNode;
                return;
            }
            else{
                head.prev= newNode;
                newNode.next=head;
                head= newNode;
                size++;
            }
        }
        public  void addend(int data){
            Node newNode= new Node(data);
            if(head== null){
                head= tail=newNode;
                return;
            }
            tail.next= newNode;
            newNode.prev= tail;
            tail= newNode;
            newNode.next= null;
            size++;
        }
        public void deletefirst(int data){
           Node newNode= new Node(data);
            //check if dll is empty or not
            if(head== null){
                System.out.println("dll is empty");
                return;
            }
            head.next= head;
            head.prev= null;
             
        }
        public void deletelast(int data){
            Node newNode= new Node(data);
            //check if dll is empty or not
            if(head== null){
                System.out.println("dll is empty");
                return;
            }
            tail.prev= tail;
            tail.next= null;
        }
        //displaying DLL
        public static void displaying(){
            Node temp= head;
            while(temp != null){
                System.out.println(temp.data + "<->");
                temp= temp.next;
            }
            System.out.println("null");
        }
    
    public static void main(String[] args) {
        DoubleLL dl = new DoubleLL();
        dl.addfirst(200);
        dl.addfirst(100);
        dl.addend(300);
        dl.displaying();

    }
}
   


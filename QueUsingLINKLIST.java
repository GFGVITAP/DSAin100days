

public class QueUsingLINKLIST {
    static class node{
        int data;
        node next;
        node(int data){
            this.data= data;
            this.next= null;
        }

    }
    static class que{
        static node head = null;
        static node tail = null;
        public static boolean isempty(int data){
            return head== null&& tail== null;
        }
        //add
        public static void add(int data){
            node newNode = new node(data);
            int front = head.data;
            if(head==null){
                head=tail=newNode;
                return;
            }else{
                head= head.next;
            }
        }
        //remove
        public static void remove(int data){
            node newNode = new node(data);
            if(tail==head){
                head=tail=null;
                return;
            }
            int front = head.data;
            
        }
        //peak
        public static int peek(int data){
            return head.data;

        }
    }
}

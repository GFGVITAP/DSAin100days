class LinkedListStack {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void push(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public int pop(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        int val=head.data;
        head=head.next;
        size--;
        return val;

    }

    public boolean isEmpty(){
        if(head==null){
            System.out.println("Stack is empty");
            return true;
        }
        else
        return false;
    }

    public int size(){
        return size;
    }

    public int peek(){
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack=new LinkedListStack();

        //Testing the functions
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print(head);
        System.out.println("Element at top=>"+stack.peek());
        System.out.println("Size=>"+stack.size());
        stack.pop();
        stack.pop();
        System.out.print("\n");
        stack.print(head);
        System.out.println("Element at top=>"+stack.peek());
        System.out.println("Size=>"+stack.size());

    }
}

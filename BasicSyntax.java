

class BasicSyntax{
    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //stack.display();
        System.out.println(stack.isEmpty());
    }
}
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    class Stack{
        Node head=null;
        public boolean isEmpty(){
            if(head==null){
                return false;
            }
            return true;
        }
        public void push(int val){
            Node newNode =new Node(val);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public void peek(){
            if(head==null){
                System.out.println("The list is empty");
                return;
            }
            System.out.println(head.val);
        }
        public void pop(){
            if(head==null){
                System.out.println("the list is already Empty");
                return;
            }
            head=head.next;
        }
        public void display(){
            if(head==null){
                System.out.println("the list is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
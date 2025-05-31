import java.util.*;
import java.util.Stack;

class PushAtBottom{
    public static void main(String [] args){
        Scanner ran=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        pushAtBottom(stack,5);

        int len=stack.size();
        for(int i=0;i<len;i++){
            System.out.print(stack.get(i)+"->");
        }
        
    }
    public static void pushAtBottom(Stack<Integer> stack, int val){
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }
        int top=stack.pop();
        pushAtBottom(stack, val);
        stack.push(top);
    }
}
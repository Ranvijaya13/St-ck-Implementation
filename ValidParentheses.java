import java.util.*;
import java.util.Stack;

class ValidParentheses{
    public static void main (String[] args){
        Scanner ran=new Scanner(System.in);
        String str=ran.nextLine();
        boolean result=checkParentheses(str);
        System.out.println(result);
    }
    public static boolean checkParentheses(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')'&& top!='(') || (ch==']'&&top!='[') ||(ch=='}'&&top!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
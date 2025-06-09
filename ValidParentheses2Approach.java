import java.util.*;

class ValidParentheses2Approach{
    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        String str = ran.nextLine();
        boolean result = checkParentheses(str);
        System.out.println(result);
    }
    public static boolean checkParentheses(String str){
        char[] stack=new char[str.length()];
        int index=-1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack[++index]=ch;
            }
            else if(ch=='('||ch=='['||ch=='{'){
                if(index<0){
                    return false;
                }
                char top=stack[index--];
                if((ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}'&& top!='{')){
                    return false;
                }
            }
        }
        return index<=0;
    }
}
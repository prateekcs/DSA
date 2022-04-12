import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars=str.toCharArray();
        for(char c:chars){
            stack.push(c);
        }
        int i;
        for(i=0; i<str.length(); i++){
            chars[i]= stack.pop();
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "PRATEEK";
        System.out.println("previous="+  str);
        System.out.println("reversed="+  reverse(str));
    }
}

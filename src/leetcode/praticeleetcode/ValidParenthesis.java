package leetcode.praticeleetcode;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String str="([)]";
        Boolean result=isValid(str);
        System.out.println("Is String Valid? "+result);
    }

    public static boolean isValid(String s) {

        Stack<Character> deque=new Stack<>();
        for (Character ch:s.toCharArray())
        {
            if (ch=='{')
                deque.add('}');
            else if (ch=='[')
                deque.add(']');
            else if (ch=='(')
                deque.add(')');
            else if(!deque.isEmpty() && deque.peek()==ch)
                deque.pop();
            else
                return false;
        }
        if (!deque.isEmpty())
            return false;
        return true;
    }
}

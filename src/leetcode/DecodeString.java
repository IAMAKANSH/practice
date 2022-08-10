package leetcode;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String str="3[a]2[bc]";
        String res=decodeString(str);
        System.out.println(res);
    }

    private static String decodeString(String str) {
        /**
         * 3[a]2[bc] len=9   stack
         * 3 [ a ]
         * bracketValue=a
         * curr= [
         * number =3
         */
        Stack<Character> stack=new Stack<>();
        for (char c:str.toCharArray())
        {
              if (c==']')
              {
                  StringBuilder str1=new StringBuilder();
                  while (!stack.isEmpty() && Character.isLetter(stack.peek()))
                  {
                      str1.insert(0,stack.pop());
                  }
                  String tmpStr=str1.toString();
                  stack.pop();
                  StringBuilder digit=new StringBuilder();
                  while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                  {
                      digit.insert(0,stack.pop());
                  }
                  int count=Integer.parseInt(digit.toString());
                  while (count>0)
                  {
                      for (char i:tmpStr.toCharArray())
                      {
                          stack.push(i);
                      }
                      count--;
                  }
              }
              else {
                  stack.push(c);
              }
        }
        StringBuilder output=new StringBuilder();
        while (!stack.isEmpty())
        {
            output.insert(0,stack.pop());
        }
        return output.toString();
    }
}

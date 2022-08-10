package leetcode;

import java.util.Stack;

public class BasicCalculator {

    public static void main(String[] args) {

        String str="1+1";
        int ans=calculate(str);
        System.out.println(ans);
    }

    private static int calculate(String str) {
        Stack<Character> stack=new Stack<>();
        if (str==null)
            return 0;
        int total=0;
        for (char ch:str.toCharArray())
        {
            if (ch==' ')
                continue;
            if (ch!=')')
            {
                stack.push(ch);
            }
            else
            {
                String curr="";
                while (!stack.isEmpty() && stack.peek()!='(')
                {
                    curr= stack.pop()+curr;
                }
                stack.pop();
                int carInt=cal(curr);
                if (!stack.isEmpty() && stack.peek()=='-' && carInt<0)
                {
                    stack.pop();
                    stack.push('+');
                    carInt = -carInt;
                }
                String curString=carInt+"";
                for (int i=0;i<curString.length();i++)
                {
                    stack.push(curString.charAt(i));
                }
            }
        }
        String last="";
        while (!stack.isEmpty())
        {
            last=stack.pop()+last;
        }
        total +=cal(last);
        return total;
    }

    public static int cal(String str){
        int total=0;
        if (str==null)
            return 0;

        int power=0;
        int last=0;
        for (int i=str.length()-1;i>=0;i--)
        {
            char curr=str.charAt(i);
            if (curr==' ')
                continue;
            else if (curr=='+')
            {
                total +=last;
                power=0;
                last=0;
            }else if (curr=='-')
            {
                total -=last;
                power=0;
                last=0;
            }
            else {
                //digit
                last +=(curr-'0')*Math.pow(10,power);
                power++;
            }
        }
        total +=last;
        return total;
    }
}

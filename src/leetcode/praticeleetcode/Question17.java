package leetcode.praticeleetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Question17 {

    public static void main(String[] args) {

        List<String> ans=letterCombinations("23");
        System.out.println(ans);
    }

    public static List<String> letterCombinations(String digits) {
        List<String> str= Arrays.asList("0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");

        LinkedList<String> output=new LinkedList<>();
        if (digits==null || digits.length()==0)
            return output;

        output.add("");
        while (output.peek().length()!=digits.length())
        {
            String curr=output.poll();
            int num=digits.charAt(curr.length())-'0';
            for (char c:str.get(num).toCharArray())
            {
                output.add(curr+c);
            }
        }
        return output;
    }
}

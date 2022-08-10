package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationPhoneNumber {

    public static void main(String[] args) {

        String digit="23";
        List<String> res=letterCombinations(digit);
        System.out.println(res);
    }

    private static List<String> letterCombinations(String digit) {
        String[]  map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> output=new LinkedList<>();
        if(digit==null || digit.length()==0)
            return output;
        output.add("");
        while (output.peek().length()!=digit.length())
        {
            String curr=output.poll();
            int num=digit.charAt(curr.length())-'0';
            for (char c:map[num].toCharArray())
            {
                output.add(curr+c);
            }
        }
        return output;
    }
    /**
     * output=["ad","ae","af","bd","de","df","cd","ce","cf"]
     * 0!=2 true            1!=2 true
     * "" len=0             "a" len=1
     * num=2                "b"
     * map=abc              "c"
     *
     *
     *
     */

}

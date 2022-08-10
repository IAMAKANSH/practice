package leetcode.praticeleetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question49 {

    public static void main(String[] args) {
String[] arr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }

    public static List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String,List<String>> seen=new HashMap<>();

        for (String s:
             strs) {

            char[] curr=s.toCharArray();
            Arrays.sort(curr);
            String currStr=new String(curr);
            List<String> currList=seen.getOrDefault(currStr,new ArrayList<>());
            currList.add(s);
            seen.put(currStr,currList);
        }
        return seen.values().stream().toList();
    }
}

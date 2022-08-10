package leetcode;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] arr={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res=groupAnagrams(arr);
        System.out.println(res);
    }

    private static List<List<String>> groupAnagrams(String[] arr) {

        Map<String,List<String>> map=new HashMap<>();
        for (int i=0;i< arr.length;i++)
        {
            char curr[]=arr[i].toCharArray();
            Arrays.sort(curr);
            String currStr=String.valueOf(curr);
            if(map.containsKey(currStr))
            {
                map.get(currStr).add(arr[i]);
            }
            else
            {
                List<String> arrList=new ArrayList<>();
                arrList.add(arr[i]);
                map.put(currStr,arrList);
            }
        }
        List<List<String>> output=new ArrayList<>(map.values());
        return output;
    }
}

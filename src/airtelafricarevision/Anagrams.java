package airtelafricarevision;

import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("arc","cat",
                "car","act","atc","abc");
        List<List<String>> res=anagram(list);
        System.out.println(res);
    }

    private static List<List<String>> anagram(List<String> list) {
        Map<String,List<String>> seen=new HashMap<>();
        for (String str:list
             ) {
            char[] curr=str.toCharArray();
            Arrays.sort(curr);
            String currStr=String.valueOf(curr);
            List<String> currList=seen.getOrDefault(currStr,new ArrayList<>());
            currList.add(str);
            seen.put(currStr,currList);
        }
        return  seen.values().stream().collect(Collectors.toList());
    }
}

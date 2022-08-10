package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class SubArraySumEqualsK {

    public static void main(String[] args) {

       int res=subArraySum(IntStream.of(1,2,3,4,5).toArray(),9);
        int res1=subArraySum(IntStream.of(1,2,3,4,5).toArray(),9);
        System.out.println(res);
        System.out.println(res1);
    }

    private static int subArraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(0,1);
        int currSum=0;
        //1 1 1 k=2
        for (Integer i:nums)
        {
            currSum +=i ;
            count +=map.getOrDefault(currSum-k,0);
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        System.out.println(map);
        return count;
    }
    private static int subArraySum1(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currSum=0;
        for (int i:nums)
        {
            currSum +=i;
            count +=map.getOrDefault(currSum-k,0);
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}

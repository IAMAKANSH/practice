package leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class TopKFrequentElement {
    public static void main(String[] args) {
        int k=2;
        List<Integer> ans=KTopElements(IntStream.of(1,1,1,2,2,3).toArray(),2);
        System.out.println(ans);
    }

    private static List<Integer> KTopElements(int[] nums, int k) {

        List<Integer> output=new ArrayList<>();
        HashMap<Integer,Integer> frequency=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            frequency.put(nums[i],frequency.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> queue=new PriorityQueue<>((o1, o2) -> o2.getValue()-o1.getValue());
        
        for (Map.Entry entry:frequency.entrySet())
        {
           queue.add(entry);
        }
        for(int i=0;i<k;i++)
        {
            output.add(queue.poll().getKey());
        }
        return output;
    }
}

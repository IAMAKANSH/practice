package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class SubsetProblem {

    public static void main(String[] args) {

        List<List<Integer>> res=subsets(IntStream.of(0).toArray());
        System.out.println(res);

        List<List<Integer>> res1=subsets1(IntStream.of(1,2,3).toArray());
        System.out.println(res1);
    }

    private static List<List<Integer>> subsets1(int[] nums) {

        List<List<Integer>> output=new ArrayList<>();
        helper(nums,output,0,new ArrayList<Integer>());
        return output;
    }

    private static void helper(int[] nums, List<List<Integer>> output, int index, ArrayList<Integer> curr) {
        output.add(new ArrayList<>(curr));
        for (int i=index;i<nums.length;i++)
        {
            curr.add(nums[i]);
            helper(nums,output,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        output.add(Collections.emptyList());
        for (int i=0;i<nums.length;i++)
        {
            output.add(Arrays.asList(nums[i]));
            for (int j=i+1;j<nums.length;j++)
            {
                output.add(Arrays.asList(nums[i],nums[j]));
            }
        }
        return output;
    }
}

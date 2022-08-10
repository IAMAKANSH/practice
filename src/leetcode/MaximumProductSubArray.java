package leetcode;

import java.util.stream.IntStream;

public class MaximumProductSubArray {

    public static void main(String[] args) {

        Integer ans=productSum(IntStream.of(2,3,-1,4).toArray());
        System.out.println(ans);
        Integer ans1=productSum1(IntStream.of(2,3,-1,4).toArray());
        System.out.println(ans1);
    }

    private static Integer productSum1(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int output=max;
        for (int i=1;i<nums.length;i++)
        {
            int premax=max;
            int curr=nums[i];
            max=Math.max(curr,Math.max(curr*premax,curr*min));
            min=Math.min(curr,Math.max(curr*premax,curr*min));
            output=Math.max(output,max);
        }
        return output;
    }

    private static Integer productSum(int[] nums) {

        int factor=1;
        for (int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*factor;
            factor=nums[i];
        }
        int max=Integer.MIN_VALUE;
        for (Integer i:nums)
        {
            max=Math.max(max,i);
        }
        return max;
    }
}

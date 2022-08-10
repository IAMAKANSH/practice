package leetcode;

import java.util.stream.IntStream;

public class MaxSubArray {

    public static void main(String[] args) {

        int sum=maxSubArraySum(IntStream.of(-2,1,-3,4,-1,2,1,-5,4).toArray());
        System.out.println(sum);

    }

    private static int maxSubArraySum(int[] nums) {
        if (nums.length==0)
            return 0;

        int max=nums[0];
        int sum=Math.max(0,max);
        for (int i=1;i<nums.length;i++)
        {
            sum +=nums[i];
            max=Math.max(max,sum);
            if (sum<0)
                sum=0;
        }
        return max;
    }
}

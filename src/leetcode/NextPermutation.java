package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NextPermutation {

    public static void main(String[] args) {

        int[] arr=IntStream.of(1,3,2).toArray();
         nextPermutation(arr);
         for (int ele:arr)
         {
             System.out.println(ele);
         }
    }

    private static void nextPermutation(int[] nums) {
        if (nums==null || nums.length<2)
            return;

        int k=nums.length-2;
        while (k>=0)
        {
            if (nums[k]<nums[k+1]) break;

            k--;
        }
        if (k<0)
        {
            Arrays.sort(nums);
            return;
        }
        for (int i=nums.length-1;i>k;i--)
        {
            if (nums[i]>nums[k])
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                break;
            }
        }
        Arrays.sort(nums,k+1,nums.length);

    }
}

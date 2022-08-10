package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] res=productOfArrayExceptSelf(IntStream.of(1,2,3,4).toArray());
        for (Integer ele:res)
        {
            System.out.println(ele);
        }
        System.out.println("+++++++++++++++++++++++++++ ");
        int[] res1=productOfArrayExceptSelf1(IntStream.of(1,2,3,4).toArray());
        for (Integer ele:res1)
        {
            System.out.println(ele);
        }
    }

    private static int[] productOfArrayExceptSelf1(int[] nums) {
        int[] output=new int[nums.length];
        Arrays.fill(output,1);
        int factor=1;
        for (int i=0;i<nums.length;i++)
        {
            output[i]=output[i]*factor;
            factor=factor*nums[i];
        }
        factor=1;
        for (int i=nums.length-1;i>=0;i--)
        {
            output[i]=output[i]*factor;
            factor=factor*nums[i];
        }
        return output;
    }

    private static int[] productOfArrayExceptSelf(int[] nums) {

        int total=1;
        for (Integer ele:nums)
        {
            total *=ele;
        }
        for (int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            nums[i]=total/val;
        }
        return nums;
    }
}

package leetcode;

import java.util.stream.IntStream;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int target=3;
        int res=sortedArray(IntStream.of(4,5,6,7,0,1,2).toArray(),target);
        System.out.println(res);
    }

    private static int sortedArray(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end)
        {
            int mid= (int) Math.floor((start+end)/2);
            if (nums[mid]==target)
                return mid;
            else if (nums[mid]<nums[end])
            {
                if (target>nums[mid] && target<nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else {
                if (target < nums[mid] && target > nums[start]){
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}

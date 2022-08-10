package leetcode;

import java.util.Arrays;

public class IntersectionOfArray {

    public static void main(String[] args) {

        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] res=intersect(nums1,nums2);
        for (Integer e:
             res) {

            System.out.println(e);
        }
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        int[] output=new int[nums1.length>nums2.length?nums1.length:nums2.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first=0;
        int second=0;
        int k=0;
        while (first<nums1.length&& second<nums2.length)
        {
            if(nums1[first]==nums2[second])
            {
                output[k]=nums1[first];
                first++;
                second++;
                k++;
            }
            else if (nums1[first]>nums2[second])
            {
                second++;
            }
            else
            {
                first++;
            }

        }
        return Arrays.copyOfRange(output,0,k);
    }
}

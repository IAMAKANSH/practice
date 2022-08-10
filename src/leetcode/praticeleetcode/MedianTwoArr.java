package leetcode.praticeleetcode;

import java.util.stream.IntStream;

public class MedianTwoArr {

    public static void main(String[] args) {

        int[] nums1=IntStream.of(0,0,0,0,0).toArray();
        int[] nums2=IntStream.of(-1,0,0,0,0,0,1).toArray();
        double res=findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }

    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int totalLen=nums1.length+nums2.length;
       int curr = 0,prev=0;
       int pointer=0;
       int a=0;
       int b=0;
       while (pointer<=totalLen/2)
       {
           prev=curr;
           if(b>=nums2.length)
               curr=nums1[a++];
           else
               curr=a<nums1.length && nums1[a]<=nums1[b]?nums1[a++]:nums2[b++];

           pointer++;
       }
       if (totalLen%2==0)
       {
           return ((double)prev+(double)curr)/2;
       }
        return curr;
    }
}

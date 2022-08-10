package airtelafricarevision;

import java.util.Arrays;

public class RangeInSortedArr {

    public static void main(String[] args) {

        int[] arr={1,2,2,2,3};
        int target=2;
        int[] range={-1,-1};
        findRangeLeftExtreme(arr,target,range);
        findRangeRightExtreme(arr,target,range);
        System.out.println(Arrays.toString(range));
    }

    private static void findRangeLeftExtreme(int[] arr, int target, int[] range) {

        int left=0;
        int right=arr.length-1;

        while (left<=right)
        {

            int mid= (int) Math.floor((left+right)/2);

            if (arr[mid]==target)
            {
                if(mid-1>=0 && arr[mid-1]==target)
                {
                    right=mid-1;
                }
                else
                {
                    range[0]=mid;
                    return;
                }
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }

        }
    }
    private static void findRangeRightExtreme(int[] arr, int target, int[] range) {

        int left=0;
        int right=arr.length-1;

        while (left<=right)
        {

            int mid= (int) Math.floor((left+right)/2);

            if (arr[mid]==target)
            {
                if(mid+1>=0 && arr[mid+1]==target)
                {
                    left=mid+1;
                }
                else
                {
                    range[1]=mid;
                    return;
                }
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }

        }
    }
}

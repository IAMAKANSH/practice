package airtelafricarevision;

import java.util.Arrays;
public class MergeSort {

    public static void main(String[] args) {

        int[] arr={9,4,7,-1,-3,5,5};
        /**
         *  we will divide the arr till its size=0
         *  merge two sorted array
         *  means both should be increasing/decreasing
         *  [2,5,7] [1,4,6]
         */
        int[] res=mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
    private static int[] mergeSortedArr(int[] arr1, int[] arr2)
    {
        int[] arr=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while (i<arr1.length)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    private static int[] mergeSort(int[] arr) {
        if (arr.length<=1)
            return arr;

        else {
            int mid= (int) Math.floor((arr.length/2));
            int[] leftSide=mergeSort(Arrays.copyOfRange(arr,0,mid));
            int[] rightSide=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
            return mergeSortedArr(leftSide,rightSide);
        }


    }
}

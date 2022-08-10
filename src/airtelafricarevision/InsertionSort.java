package airtelafricarevision;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        //Insertion sort is the stable sort
        //dividing the arr into 2 parts
        /**
         * dividing the arr into 2 parts
         * 1 part is sorted
         * 2 part is unsorted
         * we wil pick one by one from unsorted and place in the correct position in the sorted arr
         * For Ex::
         * [4 3 2 1]
         * [4] [3 2 1]
         * single arr .. or arr of len=1 is always sorted
         *
         * inital order is mintained that why stable
         *
         */
        int[] arr={9,4,7,-1,-3,5,5};
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
        insertionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort1(int[] arr) {
        /**
         *
         *  4 1 5 3 2 11 9
         *               i
         *  1 2 3 4 5 9 11
         *
          */
        for (int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int temp=arr[i];
           while (j>=0 && arr[j]>temp)
           {
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
        }

    }

    private static void insertionSort(int[] arr) {
        if (arr.length==1)
            return;
        for (int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while (j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}

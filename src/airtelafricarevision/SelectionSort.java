package airtelafricarevision;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={9,4,7,-1,-3,5,5};
        /**
         *
         *in each pass we will identity the smallest element or number and place it towards front
         *  i j
         *  9 4 7 -1 -3 5 5
         *  smallest=i=5
         *  -3 4 7 -1 9 5 5
         *  i=1;
         *  smallest=i=1
         *  -3 -1 7 4 9 5 5
         *  -3 -1 4 7 9 5 5
         *  -3 -1 4 5 9 7 5
         *  -3 -1 4 5 5 7 9
         */
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++)
        {
            int smallest=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[smallest])
                {
                    smallest=j;
                }
            }
            if(i!=smallest)
            {
                int temp=arr[i];
                arr[i]=arr[smallest];
                arr[smallest]=temp;
            }
        }
    }
}

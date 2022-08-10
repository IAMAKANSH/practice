package airtelafricarevision;

import java.util.Arrays;

public class BubbleSrort {

    public static void main(String[] args) {

        int[] arr={9,4,7,-1,-3,5,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     *
     *  4 1 8 3
     *  1 4 8 3
     *  1 3 8 4
     *  1 3 4 8
     *
     */
    private static void bubbleSort(int[] arr) {

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

package airtelafricarevision;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedSquareArray {

    public static void main(String[] args) {
        /**
         *
         * if all numbers are positive then it will be very easy problem
         * question is it accept positive and negative number as well
         */

        int[] arr=IntStream.of(-4,-2,0,1,3).toArray();
        int[] res=sortedSquareArr(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sortedSquareArr(int[] arr) {
        int[] output=new int[arr.length];
        int k=arr.length-1;
        int i=0;
        int j=arr.length-1;
        while (i<=j)
        {
            int leftElement=arr[i]*arr[i];
            int rightElement=arr[j]*arr[j];
            if (leftElement>rightElement) {
                output[k] = leftElement;
                i++;
            }
            else {
                output[k] = rightElement;
                j--;
            }
            k--;
        }
        return output;
    }
}

package airtelafricarevision;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotatedArray {

    public static void main(String[] args) {

        int k=2;
        int[] arr=IntStream.of(1,2,3).toArray();
//        int[] res=rotateArray(arr,k);
//        System.out.println(Arrays.toString(res));

        int[] res1=rotateOptimizedArr(arr,k);
        System.out.println(Arrays.toString(res1));
    }
    //bruteForce

    /**
     *
     *  1 2 3 4 5 k=0
     *  5 1 2 3 4 k=1
     *  4 5 1 2 3 k=2   since len=5
     *  3 4 5 1 2 k=3
     *  2 3 4 5 1 k=4
     *  1 2 3 4 5 k=5
     *  5 1 2 3 4 k=6 = k%le =1;
     *  k>len=k%length
     *
     *  we take last k element in the new arr->copy of it
     *  and then move 0-k-1 elements and shift k
     *  and finally we add k in the original one
     */
    private static int[] rotateArray(int[] arr, int k) {
        if (k==0 || arr.length==0)
            return arr;

        k=k% arr.length;
        //O(k)
        int[] kElementArr=Arrays.copyOfRange(arr,arr.length-k,arr.length);
        //O(len-k)
        for (int i=arr.length-k-1;i>=0;i--)
        {
            arr[i+k]=arr[i];
        }
        //0(k)
        for (int i=0;i<k;i++)
        {
            arr[i]=kElementArr[i];
        }
        //total 0(1)+2O(k)+O(n-k);
        //total O(K)+O(n)
        //k<n O(n)
        //space complexity=o(k)
        return arr;
    }

    /**
     * 1 2 3 4 5 k=2
     *
     * reverse the arr
     *
     * 5 4 3 2 1 [n]
     *
     * 4 5 1 2 3 reverse first k element and then last len-k element
     *
     * 4 5 1 2 3  expected ouput
     */
    private static int[] rotateOptimizedArr(int[] arr,int k)
    {
        k=k% arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        return arr;
    }

    public static void reverse(int[] arr,int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}

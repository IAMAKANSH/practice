package airtelafricarevision;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class QuickSort {

    public static void main(String[] args) {

        Float f=10.00f;
        int c=f.intValue();
        byte b=f.byteValue();
        double d=f.doubleValue();
        System.out.println(c+b+d);
        int[] arr={9,4,7,-1,-3,5,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        /**
         *divide and conquer
         *
         * select 1 element->pivot
         *
         * find its correct place in the array
         *
         * [6 3 1 9 5] -> sorted [1 3 5 6 9]
         *
         * select a pivot->any element find the index where it should be after sorting
         *
         *             [smaller element than it ]pivot [ bigger element than it]
         *
         */

        int arr2[]={1,3,2,4};
        int[] ressss=getNextLargerElement(arr2);
        System.out.println(Arrays.toString(ressss));
        System.out.println(swapTwoNibble(100));
    }

    private static int[] quickSort(int[] arr,int start,int end) {
        while (start<end)
        {
            int pivotIndex=partition(arr,start,end);
            if ((pivotIndex-start)<(end-pivotIndex))
            {
                quickSort(arr,start,pivotIndex-1);
                start=pivotIndex+1;
            }else {
                quickSort(arr,pivotIndex+1,end);
                end=pivotIndex-1;
            }
        }
        return arr;
    }
    public static int partition(int[] arr,int start,int end){
       int middle= (int) Math.floor((start+end)/2);
       swapStartAndMiddleElement(arr,start,middle);
       int pivot=arr[start];
       int i=start+1;
       int j=end;
       while (i<=j){
           while (arr[i]<=pivot)
           {
               i++;
           }
           while (arr[j]>pivot)
           {
               j--;
           }
           if (i<j)
           {
               swapStartAndMiddleElement(arr,i,j);
           }
       }
       swapStartAndMiddleElement(arr,start,j);
       return j;

    }

    private static void swapStartAndMiddleElement(int[] arr, int start, int middle) {
        int temp=arr[start];
        arr[start]=arr[middle];
        arr[middle]=temp;
    }

    public static int swapTwoNibble(int n)
    {
        //01100100
        //00001111
        //00000100
        //0100
        //01100100
        //11110000
        //01100000
        //00000110
        //01000000
        //01000110
        return (n&0x0F)<<4 | (n&0xF0)>>4;
    }
    private static int[]  getNextLargerElement(int[] arr)
    {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(0);
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        for (int i=1;i<arr.length;i++)
        {
            while (!stack.isEmpty() && arr[stack.peek()]<arr[i])
                result[stack.pop()]=arr[i];
            if (!stack.isEmpty() && i==stack.peekLast())
                break;
            if (result[i]==-1)
            {
                stack.push(i);
            }
            if (!stack.isEmpty() && i==arr.length-1)
            {
                i=-1;
            }
        }
        return result;
    }
}

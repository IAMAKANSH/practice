package airtelafricarevision;

import java.util.stream.IntStream;

public class MostWaterOccupiedInTank {

    public static void main(String[] args) {

        int[] arr=IntStream.of(10,6,5,6,5,7).toArray();
        int res=maximumArea(arr);
        System.out.println(res);
    }

    private static int maximumArea(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int maxArea=Integer.MIN_VALUE;
        while (start<end)
        {
            int area=(end-start)*Math.min(arr[start],arr[end]);
            maxArea=Math.max(maxArea,area);
            if(arr[start]<arr[end])
                start++;
            else
                end--;
        }
        return maxArea;
    }
}

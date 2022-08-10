package airtelafricarevision;

import java.util.HashSet;
import java.util.stream.IntStream;

public class TwoSum {

    public static void main(String[] args) {

        int targetValue=20;
        int[] arr= IntStream.of(1,-2,3,4,5).toArray();
        Boolean res=twoSumPossible(arr,targetValue);
        System.out.println(res);
    }

    private static Boolean twoSumPossible(int[] arr, int targetValue) {

        HashSet<Integer> seen=new HashSet<>();
        for (int i=0;i< arr.length;i++)
        {
            int currElement=arr[i];
            int reqElement=targetValue-currElement;
            if(seen.contains(reqElement))
                return true;
            else
                seen.add(currElement);
        }
        return false;
    }
}

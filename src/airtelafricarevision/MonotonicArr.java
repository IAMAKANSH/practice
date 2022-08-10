package airtelafricarevision;

import java.util.stream.IntStream;

public class MonotonicArr {

    public static void main(String[] args) {

        int[] arr=IntStream.of(5,3,2,1).toArray();
        Boolean res=monotonicOrNot(arr);
        System.out.println(res);
    }

    private static Boolean monotonicOrNot(int[] arr) {

        int first=arr[0];
        int last=arr.length-1;
        //equal
        if (first==last)
        {
            for (int i=0;i<arr.length-1;i++)
            {
                if (arr[i]!=arr[i+1])
                    return false;
            }
        }
        //increasing
        else if(first<last)
        {
            for (int i=0;i<arr.length-1;i++)
            {
                if (arr[i]<=arr[i+1])
                    continue;
                else
                    return false;
            }
        }
        //decreasing
        else
        {
            for (int i=0;i<arr.length-1;i++)
            {
                if (arr[i]>=arr[i+1])
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}

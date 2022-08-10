package airtelafricarevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Permutation {

    public static void main(String[] args) {

        int[] arr=IntStream.of(1,2,3).toArray();
        System.out.println(permutation(arr));
    }
    public static List<List<Integer>> output=new ArrayList<>();
    private static List<List<Integer>> permutation(int[] arr) {
        helper(arr,0);
        return output;
    }
    public static void helper(int[] arr,int i)
    {

        if (i==arr.length-1)
            output.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        for (int j=i;j<arr.length;j++)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            helper(arr,i+1);

            int temp2=arr[i];
            arr[i]=arr[j];
            arr[j]=temp2;
        }
    }
    /**
     *                                          1 2 3
     *
     *               swap 0,0               swap 0 1                     swap 0 2
     *                  1 2 3                 2 1 3                        3 2 1
     *   swap 1,1   swap 1,2      swap  1,1   swap 1,2            swap 1,1  swap1,2
     *      1 2 3    1 3 2          2 1 3       2 3 1               3 2 1       3 1 2
     *
     */

}

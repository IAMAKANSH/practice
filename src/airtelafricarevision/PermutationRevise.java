package airtelafricarevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationRevise {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        //3!=6
        permutationOfArr(arr);
        System.out.println(ans);
    }

    /**
     *             1,2,3
     *           swap 0,0 swap 0 1 swap 0,2
     *           1,2,3       2 1 3      3 1 2
     *          swap 1,0   swap 1,1  swap 1,2
     *          2 1 3          2 1 3
     *
     */
    static List<List<Integer>> ans=new ArrayList<>();
    private static void permutationOfArr(int[] arr) {
        int position=0;
        helper(arr,position);
    }

    private static void helper(int[] arr, int position) {

        if (position==arr.length-1) {
            ans.add(new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList())));
            return;
        }

        for (int i=position;i<arr.length;i++)
        {
            int temp=arr[i];
            arr[i]=arr[position];
            arr[position]=temp;

            helper(arr,position+1);

            int temp1=arr[i];
            arr[i]=arr[position];
            arr[position]=temp1;

        }
    }
}

package airtelafricarevision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    static List<List<Integer>> answer=new ArrayList<>();
    static List<List<Integer>> output=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={1,2,3};
        powerSubSetIterative(arr);
        System.out.println(answer);
        System.out.println(recursivePowerSubSet(arr));

    }
    private static  List<List<Integer>> recursivePowerSubSet(int[] arr)
    {
        int index=0;
        List<Integer> subset=new ArrayList<>();
        helper(arr,index,subset);
        return output;
    }

    private static void helper(int[] arr, int index, List<Integer> subset) {

        if (index==arr.length) {
            output.add(subset);
            return;
        }
        helper(arr,index+1,subset);
        subset.add(arr[index]);
        helper(arr,index+1,subset);
        subset.remove(subset.size()-1);
    }

    private static void powerSubSetIterative(int[] arr) {
        answer.add(Arrays.asList());
        for (int i=0;i<arr.length;i++)
        {

            List<List<Integer>> add=new ArrayList<>();
           for (int j=0;j<answer.size();j++)
           {
               List<Integer> existList=new ArrayList<>(answer.get(j));
               existList.add(arr[i]);
               add.add(existList);
           }
            for (List<Integer> ele:add
                 ) {
                answer.add(ele);
            }
        }
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ThreeSumProblem {

    public static void main(String[] args) {

        int[] num=IntStream.of(-1,0,1,2,-1,4).toArray();
//        int[] response=Arrays.stream(num).distinct().toArray();
//        for (Integer i:response
//             ) {
//            System.out.println(i);
//        }
        List<List<Integer>>  res=threeSum(num);
        System.out.println(res);


    }

    public static List<List<Integer>> threeSum(int[] num)
    {
        List<List<Integer>> response=new ArrayList<>();
        //sort
        num=Arrays.stream(num).sorted().toArray();
        //-4 -1 -1 0 1 2
        for (int i=0;i<num.length-2;i++)
        {
            int start=i+1; //1
            int end=num.length-1;  //5
           if(i==0 || num[i]!=num[i-1])
           {
               while (start<end)
               {
                   int curr=num[i]+num[start]+num[end];
                   if (curr==0)
                   {
                       response.add(Arrays.asList(num[i],num[start],num[end]));
                       while (start<end && num[start]==num[start+1]) start++;
                       while (start<end && num[end]==num[end-1])end--;
                       start++;
                       end--;
                   }
                   else if(curr>0)
                   {
                       end--;
                   }
                   else
                   {
                       start++;
                   }
               }
           }

        }
        return response;
    }
}

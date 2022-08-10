package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedListWeightSum {

    public static void main(String[] args) {

        List obj=new ArrayList();
        obj.add(Arrays.asList(1,1));
        obj.add(2);
        obj.add(Arrays.asList(1,1));
        int sum=depthSumReverse(obj);
        System.out.println(sum);
        int sum1=depthSumReverse1(obj);
        System.out.println(sum1);
    }

    private static int depthSumReverse(List list) {
        int sum=helper(list,1);
        return sum;
    }

    private static int helper(List list, int power) {

        int sum=0;
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i) instanceof List<?>)
            {
                sum+=helper((List) list.get(i),power+1);
            }
            else
            {
                sum +=(int)list.get(i);
            }
        }
        return (int) Math.pow(sum,power);
    }

    private static int depthSumReverse1(List list) {
        int sum=helper1(list,0);
        return sum;
    }

    private static int helper1(List list, int sum) {

        int total=sum;
        List<List> tmp=new ArrayList<>();
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i) instanceof List<?>)
            {
                tmp.add((List) list.get(i));
            }
            else
            {
                total +=(int)list.get(i);
            }
        }
        if (!tmp.isEmpty())
        {
            total+=helper1(tmp,total);
        }
        return total;
    }

}

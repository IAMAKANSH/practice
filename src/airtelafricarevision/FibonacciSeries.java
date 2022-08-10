package airtelafricarevision;

import java.util.HashMap;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n=7;
        int res=fibnonacciSeries(n);
        System.out.println(res);

        HashMap<Integer,Integer> map=new HashMap<>(){{
            put(0,0);
            put(1,1);
        }};
        int res1=fibnonacciSeriesOptimized(n,map);
        System.out.println(res1);

        int res2=iterativeFibnonacci(n);
        System.out.println(res2);
    }

    //0 1 1 2 3 5 8 13 21 34
    private static int fibnonacciSeries(int n) {

        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibnonacciSeries(n-1)+fibnonacciSeries(n-2);
    }
    private static int fibnonacciSeriesOptimized(int n,HashMap<Integer,Integer> map) {
        if(map.containsKey(n))
            return map.get(n);
        int res=fibnonacciSeriesOptimized(n-1,map)+fibnonacciSeriesOptimized(n-2,map);
        map.put(n,res);
        return res;
    }

    private static int iterativeFibnonacci(int n)
    {
        if(n<=1)
            return n;

        int prev=0;
        int curr=1;
        for (int i=2;i<=n;i++)
        {
            int sum=prev+curr;
            prev=curr;
            curr=sum;
        }
        return curr;
    }
}

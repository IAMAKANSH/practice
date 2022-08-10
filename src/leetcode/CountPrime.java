package leetcode;

import java.util.Arrays;

public class CountPrime {

    public static void main(String[] args) {
        int n=11;
        int ans=countPrimeNumber(n);
        System.out.println(ans);
    }

    private static int countPrimeNumber(int n) {
        boolean[] table=new boolean[n];
        Arrays.fill(table,true);
        for (int i=2;i*i<n;i++)
        {
            if (table[i])
            {
                for (int j=i;j*i<n;j++)
                {
                    table[i*j]=false;
                }
            }
        }
        int primeCount=0;
        for (int i=2;i<table.length;i++)
        {
            if(table[i])
                primeCount++;
        }
        return primeCount;
    }
}

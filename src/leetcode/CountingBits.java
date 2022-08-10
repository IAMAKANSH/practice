package leetcode;

public class CountingBits {

    public static void main(String[] args) {

        int num=2;
        int[] ans=countBits(num);
        System.out.println(ans);
    }

    private static int[] countBits(int num) {
        int[] ans=new int[num+1];
        for(int i=0;i< ans.length;i++)
        {
            ans[i]=ans[i>>1]+i%2;
        }
        return ans;
    }
}

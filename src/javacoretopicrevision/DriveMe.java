package javacoretopicrevision;

public class DriveMe {

    public static void main(String[] args) {

        Dog  dog=new Dog();
        dog.sum(4,5);
        int arr[]={5,5,10,100,10,5};
        int arr1[]={3,2,7,10};
        int arr2[]={3,2,5,10,7};
        int ans=maximumSum(arr);
        System.out.println(ans);



    }

    private static int maximumSum(int[] arr) {
        if(arr.length==0)
            return 0;
        if(arr.length==1)
            return arr[0];
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
//        {5,5,10,100,10,5};
        // 5,5,15,,105,105,110
        for (int i=2;i<arr.length;i++)
        {
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }


}

package airtelafricarevision;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr={2,3,6,9,10,15,20,60};
        int target=3;
        Boolean res=binarySearch(arr,target);
        System.out.println(res);
        System.out.println(iterativeBinarySearch(arr,target));
    }
    private static Boolean iterativeBinarySearch(int[] arr, int targer)
    {
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            int middle= (int) Math.floor((start+end)/2);
            if(arr[middle]==targer)
                return true;
            else if(arr[middle]>targer)
            {
                end=middle-1;
            }
            else
            {
                start=middle+1;
            }
        }
        return false;
    }
    private static Boolean binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        Integer res=helper(arr,start,end,target);
        return res==-1?false:true;
    }

    private static Integer helper(int[] arr, int start, int end,int target) {
        if(start>end)
            return -1;
        int mid= (int) Math.floor((start+end)/2);
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]>target)
            return helper(arr,start,mid-1,target);
        else
           return helper(arr,mid+1,end,target);
    }
}

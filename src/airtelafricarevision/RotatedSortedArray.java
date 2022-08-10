package airtelafricarevision;

public class RotatedSortedArray {

    public static void main(String[] args) {

        int[] arr={6,7,8,9,10,1,2,3,4,5};
        int target=3;
        int index=findTargetExistInRotatedSortedArr(arr,target);
        System.out.println(index);
    }

    private static int findTargetExistInRotatedSortedArr(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid = (int) Math.floor((start + end) / 2);
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] >= arr[start]) {
                //left is sorted
                if(target>=arr[start] && target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    //explore right part
                    start=mid+1;
                }
            } else {
                //right is sorted
                if(target<=arr[end] && target>arr[mid])
                {
                    //explore the right part
                    start=mid+1;
                }
                else
                {
                    //explore left part
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

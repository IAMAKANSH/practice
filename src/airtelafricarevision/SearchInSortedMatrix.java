package airtelafricarevision;

import java.util.Arrays;

public class SearchInSortedMatrix {

    public static void main(String[] args) {

        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}}; //sorted
        int target=12 ;
        int[] position={-1,-1};
        findTargetInSortedMatrixOptimized(matrix,target,position);
        System.out.println(Arrays.toString(position));

    }

    private static void findTargetInSortedMatrixOptimized(int[][] matrix, int target, int[] position) {
    int start=0;
    int end=matrix.length-1;
    int mid;
    while (start<=end)
    {
        mid= (int) Math.floor((start+end)/2);
        if(target>=matrix[mid][0] && target<=matrix[mid][matrix[mid].length-1])
        {
            int left=0;
            int right=matrix[mid].length-1;
            while (left<=right)
            {
                int middle= (int) Math.floor((left+right)/2);
                if (matrix[mid][middle]==target)
                {
                    position[0]=mid;
                    position[1]=middle;
                    return;
                }
                else if(matrix[mid][middle]>target) {
                    right = middle - 1;
                }
                else
                {
                    left=middle+1;
                }
            }
        }
        else if(target<matrix[mid][0])
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    }
}

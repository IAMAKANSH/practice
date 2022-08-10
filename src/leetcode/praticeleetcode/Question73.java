package leetcode.praticeleetcode;

public class Question73 {

    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println(matrix);

    }
    public static void setZeroes(int[][] matrix) {
        int[][] copyarr=matrix.clone();
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                  helper(i,j,copyarr);
                }
            }
        }
        matrix=copyarr;
    }

    private static void helper(int row, int col, int[][] matrix) {
        for (int i=0;i<matrix[0].length;i++)
        {
            matrix[row][i]=0;
        }
        for (int j=0;j<matrix.length;j++)
        {
            matrix[j][col]=0;
        }
    }

}

package leetcode.praticeleetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ValidSuduko {

    public static void main(String[] args) {

        char[][] board={{'5','3','.','.','7','.','.','.','.'}
                       ,{'6','.','.','1','9','5','.','.','.'}
                       ,{'.','9','8','.','.','.','.','6','.'}
                       ,{'8','.','.','.','6','.','.','.','3'}
                       ,{'4','.','.','8','.','3','.','.','1'}
                       ,{'7','.','.','.','2','.','.','.','6'}
                       ,{'.','6','.','.','.','.','2','8','.'}
                       ,{'.','.','.','4','1','9','.','.','5'}
                       ,{'.','.','.','.','8','.','.','7','9'}};
        //System.out.println(validSuduko(board));
        test(Arrays.asList(256741038,623958417,467905213,714532089,938071625));
    }
    public static void test(List<Integer>arr)
    {
        int sizeee=arr.size()/2;
        long maxEle=arr.stream().mapToLong(v->v).max().getAsLong();
        long minEle=arr.stream().mapToLong(v->v).min().getAsLong();
        long minSum=arr.stream().sorted().collect (Collectors.summingLong(Integer::longValue));
        long maxSum=arr.stream().sorted().collect(Collectors.summingLong(Integer::longValue));
        System.out.println((minSum-maxEle)+" "+(maxSum-minEle));
    }
    public static boolean validSuduko(char[][] board)
    {
        HashSet<String> map = new HashSet<>();
        for(int i = 0; i < 9; i ++) {
            for(int j = 0; j < 9; j ++) {
                if(board[i][j] != '.') {
                    String r = 'r' + "-" + i + board[i][j];
                    //r-0-1
                    String c = 'c' + "-" + j + board[i][j];
                    String rc = (i / 3) + "-" + board[i][j] + "-" + (j / 3);

                    if(!map.add(r) || !map.add(c) || !map.add(rc))
                        return false;
                }
            }
        }
        int a=623958417;
        System.out.println(map);
        return true;
    }
}

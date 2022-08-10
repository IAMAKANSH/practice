package leetcode.praticeleetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question41 {

    public static void main(String[] args) {

        System.out.println(firstMissingPositive(IntStream.of(3,4,-1,1).toArray()));
    }
    public static  int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int missing = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == missing) {
                missing++;
            }
        }
        return missing;
    }
}

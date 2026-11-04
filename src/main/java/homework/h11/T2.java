package homework.h11;

// https://leetcode.com/problems/missing-number/
public class T2 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int expectedSum = nums.length * (nums.length + 1) / 2;
        return expectedSum - sum;
    }
}
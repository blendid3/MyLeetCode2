package com.example.MyLeetCode;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (0 + n) * (n + 1) / 2;
        return sum - Arrays.stream(nums).sum();
    }
}

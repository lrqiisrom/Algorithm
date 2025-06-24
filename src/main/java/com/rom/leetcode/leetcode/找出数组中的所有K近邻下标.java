package com.rom.leetcode.leetcode;


import java.util.ArrayList;
import java.util.List;

public class 找出数组中的所有K近邻下标 {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                int bg = Math.max(i - k, 0);
                int ed = Math.min(nums.length - 1, i + k);
                if (!res.isEmpty()) {
                    int bg_1 = res.get(res.size() - 1);
                    if(bg <= bg_1) {
                        bg = bg_1 + 1;
                    }
                }
                for(int j = bg; j <= ed; j++) {
                    res.add(j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,2,2,2};
        int key = 2;
        int k = 2;
        System.out.println(findKDistantIndices(nums, key, k));
    }
}

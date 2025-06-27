package com.rom.leetcode.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 数组中的第K个最大元素 {
    public static int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return quickSelect(list, k);
    }
    public static int quickSelect(List<Integer> list, int k) {
        int tmp = list.get(0);
        List<Integer> big = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> equ = new ArrayList<>();
        for(int num: list) {
            if(num < tmp)  small.add(num);
            else if(num > tmp) big.add(num);
            else equ.add(num);
        }
        if(big.size() >= k ) return quickSelect(big, k);
        else if(big.size() + equ.size() < k) return quickSelect(small, k - big.size() - equ.size());
        else return tmp;
    }
    public static void main(String[] args) {
        int[] nums = {2,1};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}

package com.rom.leetcode.leetcode;


import java.util.HashMap;
import java.util.Map;


public class 无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        int lf = 0;
        int rg = 0;
        int res = 0;
        Map<Character, Integer> strMap = new HashMap<>();
        while(rg < s.length()) {
            if(strMap.containsKey(s.charAt(rg)) && strMap.get(s.charAt(rg)) >= lf) {
                lf = strMap.get(s.charAt(rg)) + 1;
            }
            strMap.put(s.charAt(rg), rg);
            rg++;
            res = Math.max(res, rg - lf);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

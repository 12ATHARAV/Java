package Strings;

// Problem

// Input
// abcabcbb

// Output
// 3

// Longest substring:
// abc

// Optimal Approach — Sliding Window
// Use:
// HashSet

import java.util.*;

public class LongestSubstring {
    public static int lengthofLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){     //The right pointer moves from the beginning to the end of the string, one character at a time.
            while(set.contains(s.charAt(right))){          //Handling Duplicates
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthofLongestSubstring(s));
    }
}


// Time: O(n)
// Space: O(n)
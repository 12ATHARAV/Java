package Strings;

// Approach
// Use HashSet.

import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicates(String s){
        HashSet<Character> set = new HashSet<>();

        String result = "";

        for(char c: s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}
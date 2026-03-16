package Strings;

// Problem
// Compress the string by counting characters.

// Example
// Input
// aaabbc

// Output
// a3b2c1

// Approach
// Traverse the string and count consecutive characters.

public class StringCompression {
    public static String compress(String s){
        String result = "";
        int count = 1;

        for(int i = 1; i <= s.length(); i++){
            if(i < s.length() && s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                result += s.charAt(i-1) + "" + count;
                count = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aaabbc";
        System.out.println(compress(s));
    }
}

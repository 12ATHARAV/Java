package Strings;

// Problem

// Input
// "the sky is blue"

// Output
// "blue is sky the"

// Approach
// Split → reverse order.


// .trim(): Removes any leading or trailing whitespace so you don't end up with empty strings at the start or end of your array.

// .split("\\s+"): This is a Regular Expression. The \s stands for "whitespace" and the + means "one or more."

// If the input is "sky    is", this ensures you get ["sky", "is"] instead of a bunch of empty strings in between.


// public class ReverseWords {
//     public static String reverseWords(String s){
//         String[] words = s.trim().split("\\s+");

//         String result = "";

//         for(int i = words.length - 1; i >= 0; i--){
//             result += words[i];
//             if(i != 0)
//                 result += " ";
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         String s = "the sky is blue";
//         System.out.println(reverseWords(s));
//     }
// }

// time O(n^2)
// space O(n)




// optimized : stringbuilder

public class ReverseWords {
    public static String reverseWords(String s) {
    String[] words = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
        sb.append(words[i]);
        if (i != 0) {
            sb.append(" ");
        }
    }
    return sb.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
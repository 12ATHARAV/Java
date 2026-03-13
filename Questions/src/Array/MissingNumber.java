package Array;

// Problem
// Array contains numbers 0 to n, one number missing.

// Optimal Approach — Sum Formula
// Formula:
// n(n+1)/2


public class MissingNumber {
    public static int missingNumber(int[] arr){
        int n = arr.length;

        int expected = n * (n + 1) / 2;

        int sum = 0;

        for(int num:arr){
            sum += num;
        }
        // return expected - sum;
        return sum - expected;
    }

    public static void main(String[] args){
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));

        int[] arr1= {1,2,4,5,6};
        System.out.println(missingNumber(arr1));
    }
}

// Time: O(n)
// Space: O(1)

// but if arr = {1,2,4,5,6} ---> -3
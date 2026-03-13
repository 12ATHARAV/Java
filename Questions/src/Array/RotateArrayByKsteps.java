package Array;

// Optimal Approach — Reverse Algorithm

// Steps:
// 1 reverse whole array
// 2 reverse first k elements
// 3 reverse remaining elements


public class RotateArrayByKsteps {
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;   // If you rotate an array of size 7 by 8 times, it's the same as rotating it once. This "modulo" operator ensures the code doesn't do unnecessary work and prevents index errors if k > n.

        reverse(arr, 0, n-1);   //Flips the entire array.
        reverse(arr, 0, k-1);   //Flips the first k elements back to their correct relative order.
        reverse(arr, k, n-1);         //Flips the remaining elements back to their correct relative order.
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}

// Time: O(n)
// Space: O(1)

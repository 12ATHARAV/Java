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
        k = k % n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
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

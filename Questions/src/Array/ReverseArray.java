package Array;

// Optimal Approach (Two Pointer)

// Swap:
// start ↔ end


public class ReverseArray {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

//time O(n)
//space O(1)


// Why left < right and not left <= right?

// Middle element (odd-length array) doesn't need swapping with itself
// <= would swap it with itself — wasteful but not wrong
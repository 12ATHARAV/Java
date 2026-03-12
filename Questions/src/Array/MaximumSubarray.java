package Array;

// Optimal Approach — Kadane's Algorithm
// The algorithm uses a "greedy" approach based on one simple realization: If a subarray's sum becomes negative, it will only decrease the sum of any future subarray it is added to.

// currentSum (The Local Optimizer): This variable keeps track of the sum of the "current" subarray you are building. If adding the next number makes the currentSum negative, you "reset" it to 0 and start a fresh subarray from the next element.

// maxSum (The Global Leader): This keeps track of the best currentSum we have encountered so far across the entire array.



public class MaximumSubarray {
    public static int maxSubArray(int[] arr){
        int maxSum = arr[0];
        int currentSum = 0;

        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];       // keep adding elements

            if(currentSum > maxSum){    // found a better sum? update maxSum
                maxSum = currentSum;
            }

            if(currentSum < 0){         // sum went negative? reset, start fresh
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}

package Array;
///////// Brute Force /////////
// time O(n^2)
// space O(1)

// public class TwoSum {
//     public static int[] twoSum(int[] arr, int target){
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};
//     }

//     public static void main(String[] args){
//         int[] arr = {2,7,11,15};
//         int[] result = twoSum(arr, 9);
//         System.out.println(result[0] + " " + result[1]);
//     }
// }






/////// Optimal Approach (HashMap) ///////

// time O(n)
// space O(n)
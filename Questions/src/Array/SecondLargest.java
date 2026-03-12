package Array;


// Optimal Approach (Single Traversal)

// Keep two variables:

// max
// second

public class SecondLargest {
    public static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                second = max;
                max = arr[i];
            }else if(arr[i] > second && arr[i] != max){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args){
        int[] arr = {10,5,29,46};
        int result = findSecondLargest(arr);
        System.out.println("Second largest element: " + result);
    }
}


// time O(n)
// space O(1)

// **Logic explained:**
// - Keep track of two variables — `max` and `second`
// - If current element is greater than `max` → old `max` becomes `second`, current becomes new `max`
// - If current element is between `second` and `max` → update `second`
// - `arr[i] != max` handles **duplicate values** (e.g. `{9, 9, 5}` → second largest is `5`, not `9`)

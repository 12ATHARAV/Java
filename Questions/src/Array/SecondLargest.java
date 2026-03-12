package Array;

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


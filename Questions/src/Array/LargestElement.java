package Array;


public class LargestElement {

    public static int findLargest(int[] arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {12,45,23,98};
        int result = findLargest(arr);
        System.out.println("Largest Element: " + result);
    }
}


// time - O(n)
// space - O(1)
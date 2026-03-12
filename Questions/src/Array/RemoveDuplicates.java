package Array;

// Since array is sorted, duplicates are always adjacent to each other
// Use two pointers — i (last unique) and j (scanner)
// If arr[j] == arr[i] → duplicate, skip and move j forward
// If arr[j] != arr[i] → unique, increment i and copy arr[j] into arr[i]
// Return i + 1 as the count of unique elements


public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        int i = 0;

        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,4};

        int newLength = removeDuplicates(arr);
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

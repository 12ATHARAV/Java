package Array;

// Boyer-Moore Voting Algorithm
// This code finds the majority element — the element that appears more than n/2 times in the array.

public class MajorityElement {
    public static int majorityElement(int[] arr){
        int count = 0;
        int candidate = 0;

        for(int num: arr){
            if(count == 0){
                candidate = num;     // No current candidate → pick this one
            }
            else if(num == candidate){
                count++;          // Same as candidate → reinforce it
            }
            else{
                count--;           // Different → cancel one out
            }
        }
        return candidate;
    }

    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};;
        System.out.println(majorityElement(arr));
    }
}
// time O(n)
// space O(1)
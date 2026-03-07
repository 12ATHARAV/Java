import java.util.Scanner;

// public class Array {
//     public static void main(String[] args){
//     // array creation
//     // int[] numbers = new int[5];


//     // assigning values
//     // numbers[0] = 10;
//     // numbers[1] = 20;
//     // numbers[2] = 30;
//     // numbers[3] = 40;
//     // numbers[4] = 50;


//     // accessing array elements
//     // System.out.println(numbers[0]);
//     // System.out.println(numbers[2]);


//     // Array Initialization Shortcut
//     // int[] numbers = {10, 20, 30, 40, 50};


//     // Traversing an Array
//     // for(int i=0; i < numbers.length; i++){
//     //     System.out.println(numbers[i]);
//     // }


//     // .length Property
//     // int[] arr = {1,2,3,4};
//     // System.out.println(arr.length);


//     // Enhanced for Loop (For-Each)
//     // int[] numbers = {10,20,30,40,50};

//     // for(int num: numbers){       // for(each element in array)
//     //     System.out.println(num);
//     // }


//     // Taking Array Input
//     // Scanner sc = new Scanner(System.in);

//     // int[] arr = new int[5];

//     // System.out.println("Enter 5 numbers: ");
//     // for(int i=0; i<5; i++){
//     //     arr[i] = sc.nextInt();
//     // }

//     // for(int i=0; i<5; i++){
//     //     System.out.println(arr[i]);
//     // }


//     // Common Error: Array Index Out Of Bounds
//     // int[] arr = new int[3];
//     // arr[3] = 10;   // ArrayIndexOutOfBoundsException


//     // Default Values of Arrays
//     // int[] arr = new int[3];
    
//     // for(int i=0; i<arr.length; i++){
//     //     System.out.println(arr[i]);
//     // }


//     // Q1 : Sum of Array //
//     // int[] arr = {10,20,30,40};

//     // int sum = 0;
//     // for(int i=0; i < arr.length; i++){
//     //     sum = sum + arr[i];
//     // }

//     // System.out.println(sum);


//     // Q2 //
//     // int[] arr = {2,4,6,8};

//     // int sum = 0;

//     // for(int i = 0; i < arr.length; i++){
//     //     sum += arr[i];
//     // }

//     // System.out.println(sum);


//     // }
// }



////////////////  2D Arrays  ////////////////

// import java.util.Arrays;
// public class Array{
//     public static void main(String[] args){
//         //syntax
//         // datatype[][] arrayName;


//         // Creating a 2D Array
//         // int[][] matrix = new int[3][3];


//         // Assigning Values
//         // matrix[0][0] = 1;
//         // matrix[0][1] = 2;
//         // matrix[0][2] = 3;

//         // matrix[1][0] = 4;
//         // matrix[1][1] = 5;
//         // matrix[1][2] = 6;


//         // Shortcut Initialization
//         // int[][] matrix = {
//         //     {1,2,3},
//         //     {4,5,6},
//         //     {7,8,9}
//         // };


//         // Traversing 2D Array
//         // for(int i=0; i < matrix.length; i++){  //rows
//         //     for(int j=0; j < matrix[i].length; j++){   //columns
//         //         System.out.print(matrix[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }


//         // Taking Input for 2D Array
//         Scanner sc = new Scanner(System.in);

//         int[][] arr = new int[2][2];

//         //taking user input
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[i].length; j++){
//                 System.out.print("Enter value for [" + i + "][" + j + "]: ");
//                 arr[i][j] = sc.nextInt();
//             }
//         }
        
//         //printing the array
//         for(int i=0; i < arr.length; i++){  //rows
//             for(int j=0; j < arr[i].length; j++){   //columns
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//         // printing the array using util.Arrays
//         System.out.println(Arrays.deepToString(arr));
//     }
// }


///////////////  Linear Search Code  /////////////////

// public class Array{
//     public static void main(String[] args){
//         int[] arr = {10, 25, 7, 40, 15};
//         int target = 7;

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] == target){
//                 System.out.println("Found at index " + i);
//                 return;
//             }
//         }
//         System.out.println("Not Found");
//     }
// }


////////////   Find Maximum in Array   //////////////

// public class Array{
//     public static void main(String[] args){
//         int[] arr = {4,9,2,15,7};

//         int max = arr[0];

//         for(int i = 1; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


//////////// Reverse an Array /////////////

// public class Array{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5};

//         for(int i = arr.length - 1; i >= 0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


/////////////  Reverse Using Swap (Important)  //////////////

// public class Array{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5};

//         int start = 0;
//         int end = arr.length - 1;

//         while(start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//         System.out.println(java.util.Arrays.toString(arr));
//     }
// } 


///////////////  Binary Search  ////////////////

public class Array{
    public static void main(Strings[] args){
        int[] arr = {2,4,6,8,10,12};

        int target = 6;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;
            
            if(arr[mid] == target){
                System.out.println("Found at index " + mid);
                break;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
    }
}
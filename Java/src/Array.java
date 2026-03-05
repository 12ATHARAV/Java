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
public class Array{
    public static void main(String[] args){
        //syntax
        // datatype[][] arrayName;


        // Creating a 2D Array
        // int[][] matrix = new int[3][3];


        // Assigning Values
        // matrix[0][0] = 1;
        // matrix[0][1] = 2;
        // matrix[0][2] = 3;

        // matrix[1][0] = 4;
        // matrix[1][1] = 5;
        // matrix[1][2] = 6;


        // Shortcut Initialization
        // int[][] matrix = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };


        // Traversing 2D Array
        // for(int i=0; i < matrix.length; i++){  //rows
        //     for(int j=0; j < matrix[i].length; j++){   //columns
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // Taking Input for 2D Array
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][2];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
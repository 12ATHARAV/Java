import java.util.Scanner;

public class Array {
    public static void main(String[] args){
    // array creation
    // int[] numbers = new int[5];


    // assigning values
    // numbers[0] = 10;
    // numbers[1] = 20;
    // numbers[2] = 30;
    // numbers[3] = 40;
    // numbers[4] = 50;


    // accessing array elements
    // System.out.println(numbers[0]);
    // System.out.println(numbers[2]);


    // Array Initialization Shortcut
    // int[] numbers = {10, 20, 30, 40, 50};


    // Traversing an Array
    // for(int i=0; i < numbers.length; i++){
    //     System.out.println(numbers[i]);
    // }


    // .length Property
    // int[] arr = {1,2,3,4};
    // System.out.println(arr.length);


    // Enhanced for Loop (For-Each)
    // int[] numbers = {10,20,30,40,50};

    // for(int num: numbers){       // for(each element in array)
    //     System.out.println(num);
    // }


    // Taking Array Input
    // Scanner sc = new Scanner(System.in);

    // int[] arr = new int[5];

    // System.out.println("Enter 5 numbers: ");
    // for(int i=0; i<5; i++){
    //     arr[i] = sc.nextInt();
    // }

    // for(int i=0; i<5; i++){
    //     System.out.println(arr[i]);
    // }


    // Common Error: Array Index Out Of Bounds
    int[] arr = new int[3];
    arr[3] = 10;   // ArrayIndexOutOfBoundsException

    }
}

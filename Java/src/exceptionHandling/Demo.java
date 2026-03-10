package exceptionHandling;

// Exception handling is used to handle ""runtime errors""" so the program does not crash.


// 3️⃣ try–catch Example (Complete Program)
// public class Demo {
//     public static void main(String[] args){
//         try{
//             int a = 10;
//             int b = 0;

//             int c = a / b;
//             System.out.println(c);
//         }catch(ArithmeticException e){
//             System.out.println("Cannot divide by zero");
//         }
//         System.out.println("Program continues");
//     }
// }



// 4️⃣ finally Block //
// public class Demo
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int a = 10;
//             int b = 2;

//             System.out.println(a/b);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Error occurred");
//         }
//         finally
//         {
//             System.out.println("Finally block executed");
//         }
//     }
// }



// 5️⃣ Multiple Catch Blocks //
// public class Demo
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int arr[] = new int[3];
//             arr[5] = 10;
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Arithmetic error");
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Array index error");
//         }
//     }
// }



// Example of throw //
// public class Demo
// {
//     public static void main(String[] args)
//     {
//         int age = 15;

//         if(age < 18)
//         {
//             throw new ArithmeticException("Not eligible to vote");
//         }

//         System.out.println("Eligible to vote");
//     }
// }



// Example with try–catch (Better Example)
// public class Demo
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             int age = 15;

//             if(age < 18)
//             {
//                 throw new ArithmeticException("You are under age");
//             }

//             System.out.println("You can vote");
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(e.getMessage());
//         }

//         System.out.println("Program continues");
//     }
// }




// Example of throws //
import java.io.*;

public class Demo
{
    static void readFile() throws IOException
    {
        FileReader f = new FileReader("test.txt");
        System.out.println("File opened");
    }

    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }
}
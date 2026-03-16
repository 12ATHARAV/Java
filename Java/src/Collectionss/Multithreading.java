package Collectionss;

// Multithreading means running multiple tasks (threads) simultaneously inside a program.


// Ways to Create Thread in Java

// There are 2 main ways:
// 1️⃣ Extending Thread class
// 2️⃣ Implementing Runnable interface


// Method 1: Extending Thread Class

// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }
// public class Multithreading {
//     public static void main(String[] args) {
//         MyThread t = new MyThread();
//         t.start();
//     }
// }




// Method 2: Runnable Interface (Better Approach)

// class MyThread implements Runnable{
//     public void run(){
//         System.out.println("Thread running using Runnable");
//     }
// }
// public class Multithreading {
//     public static void main(String[] args) {
//         MyThread obj = new MyThread();

//         Thread t = new Thread(obj);
//         t.start();

//     }
// }



// Example: Multiple Threads
class MyThread extends Thread{
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println("Thread: " + i);
        }
    }
}
public class Multithreading {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
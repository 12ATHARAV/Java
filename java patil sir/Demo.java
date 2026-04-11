// class MyThread implements Runnable
// {
//   Thread t;
//   int start, end;

//   MyThread(String tname, int start, int end)
//    {
//      this.start = start;
//      this.end = end;
//      t = new Thread(this, tname);
//      t.start();
//    }

//   public void run()
//    {
//       for(int i = start; i <= end; i++)
//        {
//          System.out.println(t.getName() + " : " + i);

//          try
//            {
//              Thread.sleep(1000);
//            }
//          catch(InterruptedException ie)
//            { } 
//        }
//    }
// }

// class Demo
// {
//   public static void main(String args[]) 
//    {
//       try
//        {
//          MyThread m1 = new MyThread("One", 1, 10);
//          m1.t.join();

//          MyThread m2 = new MyThread("Two", 11, 20);
//          m2.t.join();
//        }
//       catch(InterruptedException ie)
//        { }    
//    }
// }



// Deadlock among 3 threads
 
class MyThread1 implements Runnable

{

  Thread t;

  Thread obj;
 
  MyThread1(String tname)

   {

     t=new Thread(this, tname);

     t.start();

   }

  public void run()

   {

      for(int i=1; i<=10; i++)

       {

         System.out.println(t.getName() + " : " + i);
 
         try

           {

             if(i==5) obj.join();
 
             Thread.sleep(1000);

           }

         catch(InterruptedException ie)

           { } 

       }

   }

}
 
class MyThread2 implements Runnable

{

  Thread t;

  Thread obj;
 
  MyThread2(String tname, Thread obj)

   {

     this.obj=obj;
 
     t=new Thread(this, tname);

     t.start();

   }

  public void run()

   {
 
      for(int i=11; i<=20; i++)

       {

         System.out.println(t.getName() + " : " + i);
 
         try

           {

             if(i==15) obj.join();
 
             Thread.sleep(1000);

           }

         catch(InterruptedException ie)

           { } 

       }

   }

}
 
class MyThread3 implements Runnable

{

  Thread t;

  Thread obj;
 
  MyThread3(String tname, Thread obj)

   {

     this.obj=obj;
 
     t=new Thread(this, tname);

     t.start();

   }

  public void run()

   {
 
      for(int i=21; i<=30; i++)

       {

         System.out.println(t.getName() + " : " + i);
 
         try

           {

             if(i==25) obj.join();
 
             Thread.sleep(1000);

           }

         catch(InterruptedException ie)

           { } 

       }

   }

}
 
class Demo

{

  public static void main(String args[ ]) 

   {

     MyThread1 m1=new MyThread1("One");

     MyThread2 m2=new MyThread2("Two", m1.t);

     MyThread3 m3=new MyThread3("Three", m2.t);

     m1.obj=m3.t;

   }

}

 
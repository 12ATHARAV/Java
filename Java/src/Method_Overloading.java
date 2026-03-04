public class Method_Overloading {
    // static int add(int a,int b){
    //     return a + b;
    // }
    // static double add(double a, double b){
    //     return a + b;
    // }
    // static int add(int a, int b, int c){
    //     return a + b + c;
    // }
    // public static void main(String[] args){
    //     System.out.println(add(5,3));
    //     System.out.println(add(5.1,3.945));
    //     System.out.println(add(5,3,4));
    // }


    // E2
    static void greet(){
        System.out.println("Hello");
    }
    static void greet(String name){
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args){
        greet();
        greet("Atharav");
    }

}

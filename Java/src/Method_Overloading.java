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


    // E2 //
    // static void greet(){
    //     System.out.println("Hello");
    // }
    // static void greet(String name){
    //     System.out.println("Hello, " + name);
    // }
    // public static void main(String[] args){
    //     greet();
    //     greet("Atharav");
    // }


    // E3 // Compile Time Polymorphism -> Java decides which method to call at compile time.
    // static void show(int a){
    //     System.out.println("int");
    // }
    // static void show(double a){
    //     System.out.println("double");
    // }
    // public static void main(String[] args){
    //     show(5);
    //     show(5.5);
    // }


    // E4 //  Compile Time Polymorphism -> Java decides which method to call at compile time.
    // static void show(int a) {
    //     System.out.println("int");
    // }
    // static void show(long a) {
    //     System.out.println("long");
    // }
    // public static void main(String[] args){
    //     show(5);
    // }


    // E6 //  Decimal numbers → double by default
    static void show(float a) {
        System.out.println("float");
    }
    static void show(double a) {
        System.out.println("double");
    }
    public static void main(String[] args){
        show(5.5);
    }

}

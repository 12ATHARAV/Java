public class Strings {
    public static void main(Strings[] args){
        ///////// string creation ways ////////
        /// method 1 ---> uses string pool
        String s = "Atharav";
        System.out.println(s);

        /// method 2 ---> this creates new object in heap
        String a = new String("Java");
        System.out.println(a);
    }
}

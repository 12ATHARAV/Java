public class Strings {
    public static void main(String[] args){
        ///////// string creation ways ////////
        /// method 1 ---> uses string pool
        // String s = "Atharav";
        // System.out.println(s);

        /// method 2 ---> this creates new object in heap
        // String a = new String("Java");
        // System.out.println(a);


        //////// String Comparison ///////
        // String a = "Java";
        // String b = "Java";
        // System.out.println(a == b);  //true   Because both refer to same object.


        // String a = new String("Java");
        // String b = new String("Java");
        // System.out.println(a == b);   //false  Because two different objects were created


        // String a = new String("Java");
        // String b = new String("Java");
        // System.out.println(a.equals(b));   //true  Because values are same.


        ///////// Important String Methods /////////
        /// Length
        // String s = "Hello";
        // System.out.println(s.length());

        ///charAt()
        // String s = "Hello";
        // System.out.println(s.charAt(2));

        /// toUpperCase()
        // String s = "java";
        // System.out.println(s.toUpperCase());

        /// substring()
        // String s = "Programming";
        // System.out.println(s.substring(3,7));



        /////////// Why Strings Are Immutable ////////////
        // strings cannot be modified. Instead Java creates a new object.

        // String s = "";

        // for(int i=0;i<1000;i++){
        //     s = s + "a";
        // }   // Java creates 1000 new objects. Very inefficient.




        ///////////  Solution → StringBuilder  ////////////
        // mutable version of a string
        // means content can be changed without creating new objects


        // append()
        // StringBuilder sb = new StringBuilder("Java");
        // sb.append(" World");
        // System.out.println(sb);


        // reverse()
        // StringBuilder sb = new StringBuilder("java");
        // sb.reverse();
        // System.out.println(sb);


        // insert()
        // StringBuilder sb = new StringBuilder("avaj");
        // sb.insert(2,"x");
        // System.out.println(sb);


        // Q //
        String s = "Java";
        s.concat(" World");
        System.out.println(s);   // Java
    }
}

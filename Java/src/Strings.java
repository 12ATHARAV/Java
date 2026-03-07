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
        // String s = "Java";
        // s.concat(" World");
        // System.out.println(s);   // Java

        //memory becomes
        // String Pool
        // ------------
        // "Java"
        // "Java World"

        // s → "Java"
        // But you did not store the new string anywhere. so it gets ignored



        // 1️⃣ Reverse a String
        // Method 1: Using Loop
        // String s = "Java";
        // for(int i = s.length()-1; i >= 0; i--){
        //     System.out.print(s.charAt(i));
        // }


        // Method 2: Using StringBuilder
        // String s = "Java";

        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // System.out.println(sb);



        // 2️⃣ Check Palindrome String
        // String s = "Java";

        // String rev = "";

        // for(int i = s.length() - 1; i >= 0; i--){
        //     rev = rev + s.charAt(i);
        // }

        // if(s.equals(rev)){
        //     System.out.println("Pallindrome");
        // }else{
        //     System.out.println("Not Pallindrome");
        // }



        // 3️⃣ Count Vowels in String
        // String s = "Java";

        // int count = 0;

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        //        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        //         count++;
        //         System.out.println(ch);
        //     }
        // }
        // System.out.println(count);



        // 4️⃣ Remove Spaces

        String s = "Java Programming";
        System.out.println(s.replace(" ",""));
  

    }
}

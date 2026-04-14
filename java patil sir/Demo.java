
// STRING

public class Demo {
  public static void main(String[] args) {
    String str1 = "CPC";
    String str2 = "CPC";
    String str3 = "DPC";
    String str4 = "Hello";
    String str5 = "India is my country. India is superpower";

    System.out.println(str1.length());
    System.out.println(str1.charAt(1));
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str1.compareTo(str3));
    System.out.println(str1.compareTo(str4));
    System.out.println(str4.toUpperCase());
    System.out.println(str4.toLowerCase());
    System.out.println(str4.replace('l', 'M'));
    System.out.println(str4);
    System.out.println(str4.substring(1,4));
    System.out.println(str5.replaceAll("India", "Bharat"));
    System.out.println(str5.indexOf("is"));
    System.out.println(str5.indexOf("is", 7));
  }
}

/*
Methods of 'String' class:
1) length(): int length()
2) charAt(): char charAt(int index)
3) equals(): public boolean equals(Object obj)
4) compareTo(): public int compareTo(String str) 
5) toUpperCase(): String toUpperCase()
6) toLowerCase(): String toLowerCase()
7) replace(): void replace(char oldChar, char newChar)
8) substring(): String substring(int startIndex, int endIndex + 1)
9) replaceAll(): void replaceAll(String oldString, String newString)
10) indexOf(): int indexOf(String searchString)
11) indexOf(): int indexOf(int startIndex, String searchString)
*/
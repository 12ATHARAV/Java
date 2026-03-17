package Strings;

public class CountVowels {
    public static void count(String s){
        int vowels = 0;
        int consonants = 0;

        for(char c: s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1)
                vowels++;
            else if(Character.isLetter(c))
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args){
        count("Hello");
    }
}

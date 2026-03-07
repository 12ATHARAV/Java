public class Decision {
    public static void main(Strings[] args){
        // 1. if Statement
        // int age = 20;
        // if(age >= 18){
        //     System.out.println("You can vote");
        // }



        // 2. if-else statement
        // int age = 16;

        // if(age >= 18){
        //     System.out.println("You can vote");
        // }else{
        //     System.out.println("You cannot vote");
        // }



        // 3. if-else-if Ladder
        // int marks = 85;

        // if(marks >= 90){
        //     System.out.println("Grade A");
        // }else if(marks >= 75){
        //     System.out.println("Grade B");
        // }else if(marks >= 60){
        //     System.out.println("Grade C");
        // }else{
        //     System.out.println("Fail");
        // }



        // Nested if

        // int age = 20;
        // boolean hasID = true;

        // if(age >= 18){
        //     if(hasID){
        //         System.out.println("Allowed to vote");
        //     }else{
        //         System.out.println("Bring ID");
        //     }
        // }else{
        //     System.out.println("Underage");
        // }



        // 4. switch Statement

        // old switch //
        // int day = 3;

        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3: 
        //         System.out.println("Wednesday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        // }


        // Modern Switch (Java 14+) //
        // int day = 2;

        // switch(day){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     default -> System.out.println("Invalid");
        // }


        // switch with String //
        // String name = "Atharav";

        // switch(name){
        //     case "Atharav":
        //         System.out.println("Hello Atharav");
        //         break;
        //     default:
        //         System.out.println("Unknown");
        // }



        // Tricky question
        // This is a classic example of the "Dangling Else" problem in Java. Even though the indentation might look a bit ambiguous, the Java compiler follows a specific rule: an else always attaches to the nearest preceding if that doesn't already have an else.
        // int x = 10;

        // if(x > 5)
        //     if(x < 15)
        //         System.out.println("A");
        //     else
        //         System.out.println("B");
        // output: A


        // Tricky question
        // Even though num is 2, there are no statements or break commands under case 1 or case 2. This is a common pattern in Java called "Fall-Through."
        int num = 2;

        switch(num) {
            case 1:
            case 2:
            case 3:
                System.out.println("Low");
                break;
            default:
                System.out.println("High");
        }
    }
}
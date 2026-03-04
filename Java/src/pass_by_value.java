public class pass_by_value {
    // static void change(int x){
    //     x = 50;
    // }
    // public static void main(String[] args){
    //     int a = 10;
    //     change(a);
    //     System.out.println(a);
    // }  //output: 10, Because Java passes copy of value, not the original variable.



    // E2 //
    // static void modify(int num){
    //     num = num + 10;
    // }
    // public static void main(String[] args){
    //     int x = 20;
    //     modify(x);
    //     System.out.println(x);
    // }


    // Interview Trap Example //
    // static void change(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
    // public static void main(String[] args){
    //     int x = 5;
    //     int y = 10;

    //     change(x, y);
    //     System.out.println(x + " " + y);
    // }   // output: 5 10  --> bcz only copies were swapped


    public static void main(String[] args){
        int a = 5;

        for(int i = 0; i < 3; i++) {
            a = a + i;
        }

        System.out.println(a);
    }

    //output -> 8
    //1st 5 + 0 = 5
    //2nd 5 + 1 = 6
    //3rd 6 + 2 = 8
}

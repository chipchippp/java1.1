package codelearn;

import java.util.Scanner;

public class B17 {
    public static void main(String[] args) {

            System.out.println("a = " + (int) 'a');
            System.out.println("b = " + (int) 'b');
            System.out.println("c = " + (int) 'c');
            System.out.println("...");
            System.out.println("x = " + (int) 'x');
            System.out.println("y = " + (int) 'y');
            System.out.println("z = " + (int) 'z');

            char d = 'a' + 3 ;
            char e = 'd' + 1;
        System.out.println(d);
        System.out.println(e);

//        int a = 5;
//        int b = 4;
//        boolean c = a < b;
//        System.out.println(c);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(" helllo" + name);

        System.out.println("hello2" +sc.nextLine());

    }
}

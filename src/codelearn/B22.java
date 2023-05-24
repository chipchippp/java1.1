package codelearn;

import java.util.Scanner;

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //25
        System.out.println(5 % 3);

        //26
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //28
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping, a = " + a + ", b = " + b);
    }
}

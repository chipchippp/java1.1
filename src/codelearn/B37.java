package codelearn;

import java.util.Scanner;

public class B37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        }
         else if (b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


        if (a >= 10 && a <= 100) {
            System.out.println(a + " is in the range [10, 100]");
        } else {
            System.out.println(a + " is not in the range [10, 100]");
        }

        //39
        int score = sc.nextInt();
        if (score < 0 || score > 10) {
            System.out.println("The score is not valid");
        } else {
            System.out.println("The score is valid");
        }
    }
}

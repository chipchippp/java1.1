package codelearn;

import java.util.Scanner;

public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        System.out.println("c = " + c);

        char d = (char) (sc.nextLine().charAt(0) +1);
        System.out.println(d);
        //31
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b);
        System.out.println(	a < b);
        System.out.println(	a >= b);

    }
}

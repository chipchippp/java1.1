package codelearn;

import java.util.Scanner;

public class B34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a.equals(b)) {
            System.out.println("two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
        // 36
        if (c != 0 && d != 0) {
            System.out.println("c is not equal to 0 and d is not equal to 0");
        } else {
            System.out.println("c is equal to 0 or d is equal to 0");
        }
    }
}

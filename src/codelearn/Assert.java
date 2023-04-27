package codelearn;

import java.util.Scanner;
public class Assert {

        public static void main(String args []) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ur age");

            int value = sc.nextInt();
            assert value >= 18 : " not valid";
            System.out.println("value is " + value);
            sc.close();

        }
}

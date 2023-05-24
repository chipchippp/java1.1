package codelearn;

import java.util.Scanner;

public class B42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= 15 ;i++ ){
            System.out.println(i + " ");
        }

        for (int i = 15; i >1; i--){
            System.out.println(i + " ");
        }


        for (int i = 1; i <= n; i+= 2) {
            System.out.print(i + " ");
        }

        // 43
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}

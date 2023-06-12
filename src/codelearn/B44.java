package codelearn;

import java.util.Scanner;

public class B44 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= -n; i--) {
            System.out.println(i + " ");
        }

        // 45
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;

        }
        System.out.println(answer);


    }
}

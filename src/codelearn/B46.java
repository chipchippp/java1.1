package codelearn;

import java.util.Scanner;

public class B46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int answer2 = 1;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        System.out.println(answer);

        //47
        for (int i = 0; i <= n; i++){
            if (i % 3 ==0){
                System.out.println(i + " ");
            }
        }
        //48
        for (int i = 1; i<= n; i++){
            answer2 *= i;
        }
        System.out.println(answer2);

        //49
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

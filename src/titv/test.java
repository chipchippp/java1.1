package titv;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào một số nguyên dương n: ");
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                // Nếu n là số chẵn
                System.out.println("Các số chẵn từ 0 đến " + n + ":");
                for (int i = 0; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
            } else {
                // Nếu n là số lẻ
                System.out.println("Các số lẻ từ 0 đến " + n + ":");
                for (int i = 1; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }
}

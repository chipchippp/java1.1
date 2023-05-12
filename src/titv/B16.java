package titv;

import java.util.Scanner;

public class B16 {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        r = sc.nextDouble();

        // Tinh chu vi
        chuVi = 2*Math.PI*r;
        System.out.println("Chu vi = "+ chuVi);
        System.out.println("Chu vi = "+ Math.round(chuVi)); // loại bỏ phần chấm ở cuối vd: 54.32513 => 54
        System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0); //lấy 2 số cuối vd: 54.32513 => 54.33

        // Tinh dien tich
        dienTich = Math.PI * Math.pow(r,2);
        System.out.println("Dien tich = " + dienTich);
        System.out.println("Dien tich = " + Math.round(dienTich));
        System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
    }
}

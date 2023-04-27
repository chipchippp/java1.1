package demo1;

import java.util.Scanner;

public class DemoSession2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai báo biến a là số cần kiểm tra, sum là tổng các ước số của a
        int sum = 0, a;
        System.out.println("\n\nNhập vào số cần kiểm tra: ");
        a = sc.nextInt();
        //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0)
                sum += i;
        }
        if (sum == a) {
            System.out.println(a + " là số hoàn hảo");
        } else {
            System.out.println(a + " không phải là số hoàn hảo");
        }


        //    2. Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonaci.

            System.out.print("Nhap n");
            int n= nhap();
            int[] f= new int[n+1];
            f[0]= 1; f[1]= 1;
            for(int i=2;i<=n;i++)
                f[i]= f[i-1]+f[i-2];
            System.out.println("So Fibonanci thu "+n+" la: f["+n+"]= "+f[n]);
        }

    public static int nhap(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);

        //    3. Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.
    }
}


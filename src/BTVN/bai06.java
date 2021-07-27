package BTVN;

import java.util.Scanner;

public class bai06 {
    // Nhap vao so nguyen n, kiem tra so do phai so nguyen to khong
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n: ");
        int a = sc.nextInt();
        if (a < 2){
            System.out.println("Vui long nhap vao so lon hon 1 ");
        } else if (a == 2 || a == 3 || a == 5 || a == 7){
            System.out.println("Day la so nguyen to");

        } else if (a > 2){
            if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0 ){
                System.out.println("Day khong phai la so nguyen to");
            }
            else {
                System.out.println("Day la so nguyen to");
            }
        }

    }


}

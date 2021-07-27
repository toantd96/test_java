package BTVN;

import java.util.Scanner;

public class bai03 {
// nhap vao so nguyen n, tinh tong cac so nho hon n
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so nguyen n: ");
    int a = sc.nextInt();
    int tong = 0;
    for (int i = 0; i < a; i++){
        tong = tong + i;
    }
    System.out.println("Tong cac so nguyen nho hon n: " + tong);
}
}

package BTVN;

import java.util.Scanner;

public class bai02 {
    // nhap vao so nguyen n. liet ke ra cac so nguyen chan nho hon n theo chieu giam dan
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        int a = sc.nextInt();
        for (int i = a-1; i >= 0; i--){
            if (i % 2 == 0){
                System.out.println("Cac so nguyen chan nho hon n la: " + i);
            }
        }
    }
}

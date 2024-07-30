package Excercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Nhap vao so nguyen thu 1 de tinh tong: ");
            int number1= scanner.nextInt();
            System.out.println("Nhap vao so nguyen thu 2 de tinh tong: ");
            int number2= scanner.nextInt();
            int sum = number1+number2;
            System.out.println("Tong 2 so nguyen la: "+sum);
        }catch (Exception e){
            System.out.println("So nguyen duoc nhap vao khong hop le. Vui long nhap lai:");
            scanner.next();
        }
    }
}

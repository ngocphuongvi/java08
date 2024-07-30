package Exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Nhap so nguyen thu nhat(so bi chia): ");
            int number1=scanner.nextInt();
            System.out.println("Nhap so nguyen thu hai(so chia): ");
            int number2=scanner.nextInt();
            double divide=(double) number1/number2;
            System.out.println("Ket qua phep chia: "+divide);
        }catch (ArithmeticException e){
            throw new  ArithmeticException("Error: Don't divide a number by zero");

//            System.out.println("Loi so 0 khong the la so chia ");
        }catch (Exception e){
            System.out.println("Loi dau vao khong hop le");
        }finally {
            scanner.close();
        }
    }
}

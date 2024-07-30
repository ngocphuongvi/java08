package Exercise08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhap canh thu 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhap canh thu 3: ");
        double side3 = scanner.nextDouble();

        if(side1<=0||side2<=0||side3<=0){
            System.out.println("Cac canh tam giac phai lon hon 0.");
        }
    }
}

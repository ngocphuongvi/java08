package Exercise04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay thang nam(theo dinh dang yyyy-MM-DD): ");
        String input = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try{
            LocalDate.parse(input, dateTimeFormatter);
            System.out.println("Ban vua nhap: "+input);
        }catch (DateTimeParseException dtpe){
            System.out.println("Ngay thang nam khong hop le");
        }
    }
}

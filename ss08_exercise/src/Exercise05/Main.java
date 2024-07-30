package Exercise05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a array: ");
        String[] array = scanner.nextLine().split(" ");
        if(array == null || array.length==0){
            System.out.println("Array is invalid");
        }else {
            StringBuilder reversedString = new StringBuilder(Arrays.toString(array.clone()));
            System.out.println(reversedString);
        }
    }
}

package Basic;

import java.util.Scanner;

public class inputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name= sc.nextLine();

        System.out.println("Hello "+name);
    }
}

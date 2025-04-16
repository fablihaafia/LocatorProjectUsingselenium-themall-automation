package java_basic;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject grade (A/B): "); // better prompt message

        String grade = sc.next();
        String message;

        switch (grade.toUpperCase()) {
            case "A":
                message = "Great";
                break;
            case "B":
                message = "Good";
                break;
            default:
                message = "Invalid grade";
        }

        System.out.println("Result: " + message);
        sc.close(); // close the scanner (good practice)
    }
}

package flowcontrol;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gender = sc.next();
        int age = sc.nextInt();

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58)
                System.out.println("8.2%");
            else if (age >= 59 && age <= 100)
                System.out.println("9.2%");
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58)
                System.out.println("8.4%");
            else if (age >= 59 && age <= 100)
                System.out.println("10.5%");
        }

        sc.close();
    }
}
package lv.acodemy.classroom;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = myScanner.next();

        System.out.println("What is your last name?");
        String lastName = myScanner.next();

        System.out.printf("Hello %s %s. My name is Bot John. How can I help you?%n",
                name, lastName);

        System.out.println("Press 1 for registration. Press 2 to stop the chat");
        int answer = myScanner.nextInt();

        if (answer == 1) {
            System.out.println("Please enter the date in following format: (dd-MM-yyyy)");
            String registrationDate = myScanner.next();
            System.out.println("You've registered on date:" + registrationDate);
        } else if (answer == 2) {
            System.out.println("OK, this chat will be closed now!");
            myScanner.close();
        } else {
            System.out.println("Option is not correct!");
            myScanner.close();
        }
    }
}

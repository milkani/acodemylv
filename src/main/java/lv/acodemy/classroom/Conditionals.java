package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {

        // 1. IF
        if (1 < 2) {
            System.out.println("Yes, this is true!");
        }

        if (1 > 2) {
            System.out.println("Yes, this true!");
        }

        // boolean
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("This is summer!");
        }

        // String example
        String name = "Nikita";
        if (name.equals("Alien")) {
            System.out.println("Yes, this is correct!");
            System.out.println("And something else");
        }

        if (name.contains("Nik")) {
            System.out.println("Yes, name contains Nik");
        }

        if (!name.contains("Nik")) {
            System.out.println("Yes, name does not contains");
        }

        // simplified if
        if (5 < 10) System.out.println("Yes 5 is less then 10");

        // if-else

        int studentAge = 20;
        if (studentAge < 18) {
            System.out.println("Please come later!");
        } else {
            System.out.println("You can buy everything you want!");
        }

        // if-else-if-else

        int currentTime = 4;
        if (currentTime <= 11 && currentTime > 6) {
            System.out.println("Good morning!");
        } else if (currentTime > 11 && currentTime < 17) {
            System.out.println("Good day!");
        } else if (currentTime > 17 && currentTime < 24) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Good night!");
        }
    }
    // && - true true
    // ||  true false
}

package lv.acodemy.classroom;

import java.util.Arrays;

public class LoopsExample {
    public static void main(String[] args) {

        // for loop

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        String[] names = {"John", "Enthony", "Anna", "Marija", "Yanis"};
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s ", names[i]);
        }
        System.out.println();
        System.out.println();

        for(int j = names.length -1; j >= 0; j--) {
            System.out.println(names[j]);
        }

        // enhanced for
        for (String name : names) {
            if (name.equals("John")) {
                System.out.println(name);
            }
        }

        System.out.println();
        System.out.println();

        Arrays.stream(names).forEach(System.out::println);

        // while
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World!");
            i++;
        }

        do {
            System.out.println("Hello World!");
            i++;
        } while (i < 5);



    }
}

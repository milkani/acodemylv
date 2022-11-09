package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        // Arrays

        int[] studentAges = {17, 18, 20, 21, 16};
        int[] weeks = new int[5];
        weeks[0] = 3;

        // counting starts from 0
        System.out.println(Arrays.toString(studentAges));
        System.out.println(studentAges[2]);
        System.out.println(studentAges.length);
        //System.out.println(studentAges[5]);
        studentAges[2] = 5;
        System.out.println(studentAges[2]);

        Object[] myObjects = {1, "Nikita", 5.4};
        //String name = myObjects[0];

        String[] names = {"John", "Alex", "Ilya", "Andrew", "Sasha", "Anna", "Nastja"};
        System.out.println(names[2]);
    }
}

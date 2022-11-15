package lv.acodemy.classroom;

public class ObjectsExample {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.printAllInfo();

        System.out.println("");

        cat.name = "Barsik";
        cat.printAllInfo();
    }
}

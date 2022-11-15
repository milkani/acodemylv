package lv.acodemy.classroom;

public class Animal {

    public boolean hasBody;
    public int age;
    public String name;
    public String color;

    public void printAllInfo() {
        System.out.println("Has body:" + hasBody);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}

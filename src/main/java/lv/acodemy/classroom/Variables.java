package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {
        // Line comment

        /*
        My name is %s
        I am %d years old
         */

        // byte
        byte byteVariable = 120;
        System.out.println(byteVariable);

        // short
        short salary = 2000;
        System.out.println(salary);

        // char
        char letterA = 'A';
        System.out.println(letterA);

        // int
        int populationInLatvia = 2000000;
        System.out.println(populationInLatvia);

        // long
        long coronavirusCases = 63614776L;
        System.out.println(coronavirusCases);

        // float
        float stockPrice = 5000.50f;
        System.out.println(stockPrice);

        // double
        double twittersPrice = 20659.94;
        System.out.println(twittersPrice);

        // non-primitive type

        String fullName = "Nikita Milka";
        System.out.println(fullName);

        String name = "Nikita";
        String surname = "Milka";
        String nameAndSurname = name + " " + surname;
        System.out.println(nameAndSurname);

        String fName = String.format("My full name is %s %s", name, surname);
        System.out.println(fName);
        System.out.printf("My full name is %s %s\n", name, surname);
        System.out.println("Hello World");
    }
}
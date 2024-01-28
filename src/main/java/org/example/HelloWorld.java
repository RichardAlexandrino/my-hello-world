package org.example;

public class HelloWorld {
    private String firstName;
    private String lastName;
    private int age;

    public HelloWorld(String firstName, String lastName, int age) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.age = age;
        System.out.println("My Hello World: \n" + firstName + " " + lastName + ", " + age + " years old.");
    }

    public static void main(String[] args) {
        HelloWorld myDates = new HelloWorld("Richard", "Alexandrino", 27);
    }

}

package org.example;

class Printer {

}
public class Test1{
    static boolean containsOnlyLettersOrDigits(String input) {
        return input.matches("[a-zA-Z0-9]+");
    }
    public static void main(String[] args) {
        System.out.println(containsOnlyLettersOrDigits("a^a"));
    }
}

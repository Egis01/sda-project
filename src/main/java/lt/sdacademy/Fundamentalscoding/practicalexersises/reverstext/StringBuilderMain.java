package lt.sdacademy.Fundamentalscoding.practicalexersises.reverstext;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Iveskite texta");
        stringBuilder.append(scanner.nextLine());
        // System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.reverse());
        String reverseText = stringBuilder.reverse().toString();

    }
}

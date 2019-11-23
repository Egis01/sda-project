package lt.sdacademy.fundamentals.controlflow.switchcase;

import java.util.Scanner;

public class Exemple1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char direction = 'w';
        //       char direction = scanner.next(),charAt(0);
        switch (direction) {
            case 'n':
                System.out.println("keliaujame siaures kryptimi!");
                break;
            case 's':
                System.out.println("keliaujame pietu kryptimi!");
                break;
            case 'e':
                System.out.println("keliaujame rytu kryptimi!");
                break;
            case 'w':
                System.out.println("keliaujame vakaru kryptimi!");
                break;
            default:
                System.out.println("keliaujame nezinome kryptimi");
                //pirmas keisas prilyginimaas if'ui kiti else, paskutinis default'ui
        }
    }
}

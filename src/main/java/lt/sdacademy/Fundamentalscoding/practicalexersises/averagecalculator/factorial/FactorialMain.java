package lt.sdacademy.Fundamentalscoding.practicalexersises.averagecalculator.factorial;

import java.util.Scanner;

public class FactorialMain {// pries tai buvusiu reiksmiu sandauga

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int result =1;



        System.out.println("iveskite skaiciu:");
        int input = inputScanner.nextInt();


        for (int i = 1; i <= input; i++) {
            result *= i;

        }

        System.out.println("Faktorialo: " + input + " rezultatas yra:" + result);


    }

}

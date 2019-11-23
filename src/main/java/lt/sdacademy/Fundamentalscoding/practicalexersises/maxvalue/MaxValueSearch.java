package lt.sdacademy.Fundamentalscoding.practicalexersises.maxvalue;

import java.util.Scanner;

public class MaxValueSearch {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("iveskite skaiciu sarasa per kableli"); // ivedam skaicius ir prilyginam String tipo kintamajam, naudotojas ivede skaicius, taciau jie traktuojami kaip textas, texta verciam i simbolius.
        String numbersIntText = inputScanner.nextLine();
        String[]numberArr = numbersIntText.split(","); // split funkcija skiri ba texta per kableli

        int max = Integer.parseInt(numberArr[0]); // tekstines reiksmes paverciamos i skaicius, skliaustuose nurodyta pirma masyvo reiksme su kuria bus lyginami visi like skaiciai
         for (int i=0; i<numberArr.length;i++) {// masyvo ilgis toks koki ivesiu numberArr.lenght;
            int number = Integer.parseInt(numberArr[i]);
            if (number>max){
                max = number;
            }

        }
        System.out.println("Maksimali reiksme is saraso yra: "+max);
    }

}

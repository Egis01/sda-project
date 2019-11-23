package lt.sdacademy.fundamentals.fileread.scanner;

import lt.sdacademy.fundamentals.fileread.Util;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.fundamentals.fileread.Util.FILE_LOCATION;

public class ScannerExampleMain {
    public static void main(String[] args){
        //need to close
        try{
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));        //inicializuoja Scanner objekta, vietoj system.in nurodom failo lokacija
            while (fileScanner.hasNext()){                                          // skaitom faila kol turi kita eilute, ir automatiskai pamato ar turi kita eilute,
                System.out.println(fileScanner.nextLine());                          // atspausdinam nuskaityta eilute
            }
            fileScanner.close(); // uzdarom rankiniu budu
        }catch (IOException e){
            System.out.println("KLAIDA");
        }
        // Closes automatically
        try (Scanner fileScanner  = new Scanner(new File(FILE_LOCATION))){   // kadangi jau paciam try irasyta f-ja, todel jos nebereikia uzdarineti
            while (fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());
            }
        }catch (IOException e) {
            System.out.println("KLAIDA");
        }
    }
}

package lt.sdacademy.Fundamentalscoding.practicalexersises.Dog.refactored;
// nuskaitys is failo sunu sarasa
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import lt.sdacademy.Fundamentalscoding.practicalexersises.Dog.Dog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogMainRefactored {
    // static viena karta sukurs ir inicializuos, final tik viena karta inicializuotas
    private static final String FINALE_LOCATION = "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\lt\\sdacademy\\Fundamentalscoding\\practicalexersises\\Dog\\refactored\\DogsData.txt";

    public static void main(String[] args) {
        //List<Dog> dogList = new ArrayList<>();
        List<Dog> dogList = getDogsFromFile();
      /*  for (int i = 0; i < 2; i++) {
            dogList.add(buildDog());
        }*/

        System.out.println("Vyriausio šuns vardas: " + findOldestDog(dogList));
        System.out.println("Vidutinis šunų amžius: " + findAverageYearOfDogs(dogList));
    }

    private static List<Dog> getDogsFromFile() {  // funkcija
        List<Dog> dogList = new ArrayList();  // sarasas
        try (BufferedReader br = new BufferedReader(new FileReader(FINALE_LOCATION))) { // failo skaitymas
            String line = br.readLine();

            while (line != null) {
                line = br.readLine();                                                // teksas
                                                                                     //  text += line.split(","); // atskiri elementai atskirti kalbeliu
                if (line == null) {
                    break;
                }
                dogList.add(mapDataToObject(line.split(",")));
            }
        } catch (IOException e) {
            System.out.println("Klaida");
        }
        return dogList;                                                              // grazinam sarasa
    }

    private static Dog mapDataToObject(String[] dogsData) {
        return new Dog(dogsData[0], Integer.parseInt(dogsData[1]), dogsData[2]);     // pirmas masyvo elementas yra vardas,antras amzius,trecias spalva
    }

   /* private static List<Dog> getDogsFromFile() throws FileNotFoundException { // throws
        BufferedReader br = new BufferedReader(new FileReader(FINALE_LOCATION));
    }*/

    private static String findOldestDog(List<Dog> dogList) {
       /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/

        String oldestDogName = dogList.get(0).getName();
        int oldestDog = dogList.get(0).getAge();

        return oldestDogName;
    }

    private static double findAverageYearOfDogs(List<Dog> dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }

        return averageYear / dogList.size();
    }
}

// 1. Susikurem konstanta, o su Buferedreaderiu nusiskaitom
//2.
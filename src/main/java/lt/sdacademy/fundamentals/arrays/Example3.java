package lt.sdacademy.fundamentals.arrays;

import com.sun.deploy.security.JarAsBLOBVerifier;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};

        System.out.println(arrayOfInts[0]); //prints 10
        System.out.println(arrayOfInts[2]); //prints 20
        System.out.println(arrayOfInts[4]); //prints 30

        for (int i = 0; i < arrayOfInts.length; i++) { // paprastas for ciklas
            System.out.println(arrayOfInts[i] + " ");
        }
        System.out.println(); //Spausdinamas tuscia eilute

        //Isspausdins 10 15 20 25 30
        for (int i : arrayOfInts) { // siek tiek patobulintas for ciklas
            System.out.print(i + " ");
        }
        System.out.println();
        // java funkcinis programavimas
        List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30);
      //  integerList.forEach(number -> System.out.print(number + " "));


    }
}

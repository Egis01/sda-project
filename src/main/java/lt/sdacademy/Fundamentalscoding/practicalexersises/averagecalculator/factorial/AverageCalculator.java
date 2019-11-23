package lt.sdacademy.Fundamentalscoding.practicalexersises.averagecalculator.factorial;

import java.util.Arrays;
import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 32, 4, 5, 7); // sukurem sarasa, jis nuo masyvo skiriasi, tuom kad nereikia inicializuoti jo dydi, sarase reikia nurodyti jo tipa, kuris aprasomas <> viduje, tipai galim buti string, int tipo ir t.t gali buti ir objektu sarasai
        //i sarasa galima prideti duomenis pvz: integers.add(123), jis eis po 7, galime atrasti vieta kurioje yra skaicius 32 integers.indexOf (); Taip pat galima istrinti integers.remove(12); Loop - ciklas
//integers.
        int sum = 0;
      //  double average = 0;

        for (Integer number : integers) {
            sum += number; // sum = sum+number

        }
        //  average = sum / integers.size(); // suma skaiciu dalinam is ju kiekio
        double average = (double) sum / integers.size();
        System.out.println("Suma: " + sum);
        System.out.println("Vidurkis: " + average);
        System.out.printf("Vidurkis: %.2f ", average); // suapvalina su skaicius po kalbelio
        // sarasas turi dydi size, o masyvas lenght

        /* norint isspausdinti visa sarasa:
        for (int i=0,i<integers.size();i++);
        System.out.println(integers.get(i))
         */
    }
}

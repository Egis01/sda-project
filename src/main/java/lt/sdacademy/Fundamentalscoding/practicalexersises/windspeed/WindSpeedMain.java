 package lt.sdacademy.Fundamentalscoding.practicalexersises.windspeed;

import java.util.Scanner;

public class WindSpeedMain {
    // konstantu aprasymas
    static final double NAUTIC_MILE=1.852;//kitamasis susikurs tik viena karta, konstantos rasomos didziosom raidem ir atskiriamos _
    static final double BEAUFORT_CONSTANT=3.01;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("iveskite skaiciu vejo greiti km/h");
        int windSpeedPerHour = inputScanner.nextInt();
        double Beufortoskale = Math.pow(windSpeedPerHour / BEAUFORT_CONSTANT, 1.5);


      //  System.out.println("vejo greitis mazgais: " + windSpeedPerHour * NAUTIC_MILE);
      //  System.out.println("Vejo greitis Beuforto skaleje: " + Math.pow(windSpeedPerHour / BEAUFORT_CONSTANT, 1.5));
      //  System.out.println("Vejo stiprumas: " + kilometersPerHourToKnots(windSpeedPerHour));
/*         System.out.println("vejo greitis mazgais: " + kilometersPerHourToKnots(windSpeedPerHour));
         System.out.println("Vejo greitis Beuforto skaleje: " + kilometersPerHourToKnots(windSpeedPerHour));
         System.out.println("Vejo stiprumas: " + getWindStrength(windSpeedPerHour);



// if (windSpeedPerHour >20){
//        System.out.println("vejas stiprus");
//    }else{
//         System.out.println("vejas nestiprus");
//    }
        // Beuforto skale negali buti didesnis nei 12
     //   if (Beufortoskale<12){
     //       System.out.println("Math.pow(windSpeedPerHour / BEAUFORT_CONSTANT, 1.5");
     //   }else{
     //       System.out.println("12");
     //   }


    } private static String kilometersPerHourToKnots (int windSpeed){

        return windSpeed <=20 ?"ramus ": "stiprus"; // po salygos dedamas klaustukas
    }
      private static int kilometersPerHourToKnots(int windSpeed) {
        return (int) (NAUTIC_MILE * windSpeed); // (int) iscastina tik sveika dali

          private static String getWindStreght (int windSpeed){
              int beufort = (int) Math.pow(windSpeed/BEAUFORT_CONSTANT,1.5);
              return windSpeed <=20 ?"ramus ": "stiprus";
          }
*/
 }
}

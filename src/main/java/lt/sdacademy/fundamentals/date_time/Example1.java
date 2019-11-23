package lt.sdacademy.fundamentals.date_time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example1 {
    public static void main(String []args){
        Date now=new Date();
        // arba
        long millis = System.currentTimeMillis();
        now = new Date(millis); // is mili sekundziu
        System.out.println(now); //Sekmadienis lapkricio 10

        Calendar cal = Calendar.getInstance(); // paiima esama masinos laika mili sekundem ir priskiriamas kalendoriaus objektui
        Date date = cal.getTime();// konvertuojamas Calender objektas i Date objekta, masinos laika gaunu su siuo metodu
        System.out.println(date); // Sekmadienis lapkricio 10 11.20 2019
        cal.setTime(now); // konvertuojamas Date objektas i Calender objekta, cia galima nustatyti tarkim vilniaus laika

        System.out.println(cal.get(Calendar.YEAR)); //2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //314
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));//45

        String dateInText = "2019-02-18"; // tik tokiu formatu gali isparsint
        LocalDate data =LocalDate.parse(dateInText); // is teksto pavertem i data
        System.out.println(data);
        System.out.println(data.plusDays(2)); // prideda dvi dienas
    }


}

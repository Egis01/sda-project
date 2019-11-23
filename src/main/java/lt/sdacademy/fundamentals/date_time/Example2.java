package lt.sdacademy.fundamentals.date_time;

import java.time.LocalDateTime;
import java.time.Month;

public class Example2 {
    public static void main (String [] args){
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime.of(2015, Month.FEBRUARY,20,06,30);// inicialicuojam, galim patys inicializuoti
        LocalDateTime.parse("2015-02-20T06:30:00"); // toks formatas nuo T raides prasideda laikas

        now = now.plusDays(1); // prie esamos datos prideda viena diena
        now = now.minusHours(2); // prie esamo laiko atimama 2 valandos

        System.out.println(now.getMonth());
        System.out.println(now);
    }
}

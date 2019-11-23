package lt.sdacademy.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main (String [] args){

        // tikrinam teksta
        System.out.println(Pattern.matches(".s","as")); // true // .s reiskia patikrint ar mano paste bus bet kokia raide. regex sako kad bus dvieju simboliu tekstas, pirmas bet koks simbolis antras simbolis privalo buti raide s
        System.out.println(Pattern.matches(".t","dt")); // true
        System.out.println(Pattern.matches(".d","odt")); // false // sakom, kad paduosim dvieju simboliu, bet yra triju todel false, antras simbolis d
        System.out.println(Pattern.matches(".d","oodt")); // false
        System.out.println(Pattern.matches("..t","odt")); // true, triju simboliu tekstas, trecias simbolis raide t, taip ir yra todel true

        // el. pasto validacija (pratikrinimas)
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");// ^ zymi pradzia, $ zymi pabaiga // is teksto parsinam i regex// (.x)bet kokie simboliai iki etos @ (.x)bet kokie simboliai iki pabaigos. Tikrinam pasta nuo pradziu bet koks simbolis bet kokio ilgio
        Matcher emailMatcher = emailPattern.matcher("d*.egis01@gmail.com"); // susikuriam pati matcheri ir jeigu sitsa pastas atitinka virsutini kodo eilute tada true.
        System.out.println(emailMatcher.matches());//true
        // regexas yra tam kad ivedi i pass ir turi pakartot, jeigu atitinka tada ok. Naudojamas registracijos formoje
        // (.+) bet koks tekstas, bet kokio ilgio (.)- bet koks (+) bet kokio ilgio, (^) nuo pradziu, (\\) taskas
    }
}

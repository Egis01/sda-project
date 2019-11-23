package lt.sdacademy.Fundamentalscoding.practicalexersises.reverstext;

import java.util.Scanner;

public class ReversText {
    public static void main(String[]args){
        Scanner textScanner = new Scanner(System.in);
        String text;
        String reversText="";
        System.out.println("Iveskite teksta:");
        text = textScanner.nextLine();
         // for (pradine reiksme; salyga;zingsnis per kiek keliausim ivykde salyga) , ciklas for
        for (int i = text.length()-1;i>=0;i--){ //text.length nuskaito teksto ilgi, i-1 todel kad musu indeksas prasideda nuo 0, jei -1 tada ima zodi labas nuo s raides, jei nepazymesim -1 ims 6 pozicija ir mes klaida
            reversText+=text.charAt(i); //  += tas pats kas reversText = reversText+text.charAt(i)
        } // jei cikle nurodysim pradine reiksme nulis tada pirma pozicija bus zodzio Labas - L, siuo atveju pradine reiksme bus paskutines zodzio simbolis s tada ciklo metu pridedama a b a L
        System.out.println(reversText);
    }
}

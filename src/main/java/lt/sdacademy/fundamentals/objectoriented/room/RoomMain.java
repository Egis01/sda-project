package lt.sdacademy.fundamentals.objectoriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        int whidt;
        int lenght;
        Scanner scanner = new Scanner(System.in);

        System.out.println("iveskite kambario ilgi:");
        whidt = scanner.nextInt();
        System.out.println("iveskite kambario ploti:");
        lenght = scanner.nextInt();

        Room room = new Room(whidt, lenght); // susikurem room objekta ir priskyrem reiksmes

        // System.out.println("Kambario plotas yra: " + whidt*lenght);// paprasciausias variantas plotui gauti
        // int squareOfRoom=room.getLength() * room.getWidth();
        // apatines funkcijos pasekme, t.y vietoj virsutines eilutes parasom apatine po siuo komentaru esancia eilute
        int squareOfRoom = getSquareOfRoom(room.getLength(), room.getWidth()); // po lygybes sukurtos musu funkcijos kuri priima du parametrus pasiema is apacios
        System.out.println("Kambario plotas yra: " + squareOfRoom);
    }
    /*          ^
                |  apatine funcija atsispausdina auksciau parasytame kode
     */
    // nauja funcija - funkcijos deklaravimas, ji bus prieinama tik sioje klasej
    private static int getSquareOfRoom(int lenght, int width) { // privati funkcija su dviem kintamaisiais. reikia nurodyti kintamuju tipus
        //int square = lenght*widht tas pats yra apatinej eilutej tik kitaip
        return (lenght * width); //pasako ka funcija grazins
    }
}

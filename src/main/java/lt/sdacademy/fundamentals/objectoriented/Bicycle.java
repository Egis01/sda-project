package lt.sdacademy.fundamentals.objectoriented;

public class Bicycle {
    private int model;
    private int gear;
    private int speed;
    static int count = 0; // static compiliatorius sukompiliuoja viena karta

    public Bicycle(int model, int gear, int speed) { // konstruktorius
        this.model = model;
        this.gear = gear;
        this.speed = speed;
        this.count++; // susikurem objekta todel count kintamasis igauna reiksme vienas, antra karta sukurus objekta
        // jo pradine reiksme jau bus nebe nulis o vienas

    }

    public int getModel() { // geteris, viesai matomas metodas int tipo ir funkcija kuri grazina model kintamaji.
        return model;
    }

    public static int getCount() { //geteris
        return count;
    } // grazina count kintamaji
}

package lt.sdacademy.fundamentals.varargs;

public class Example1 {
    public static void main(String[] args){

        System.out.println(sum(1, 2, 3, 4));// 10
        System.out.println(sum(1));//1
        System.out.println(sum()); //00


    }
    private static int sum(int... elements){ // sita funkcija priims daug elementu, cia varargs kintamasis (int... elements),reiksmes nuo 0 iki begalybes, daugiau kintamuju nebegali buti, jei norim daugiau kintamuju paduot, reikia rasyti int skaicius, int... elements
        int result = 0;
        for (int i:elements){
            result += i;
        }
        return result;
    }
}

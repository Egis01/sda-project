package lt.sdacademy.fundamentals.loop.foreach;

public class Example2 {
    public static void main(String[] args){
        int[] arrayOfInts = {1,2,3,8,5,6};
// kiek masyvas turi elementu tiek kartu jis ir bus vykdomas
        for(int n : arrayOfInts){
            System.out.println(n);
        }
    }
}

package lt.sdacademy.fundamentals.loop.foreach;

public class Example1 {
   public static void main(String[] args){
       Animal dog = new Animal("Boss","Kovinis");
       Animal cat = new Animal("Dolly","Ciau ciau");
       Animal[] animals={dog,cat}; // [] pasako, kad bus masyvas
       for (Animal a: animals){
           System.out.println(a.getName());
           System.out.println(a.getBreed());
       }


   }
}
class Animal {// sukurem klase kuri yra objektas su dviem kintamaisiais, kurie yra privatus.
    //kintamieji
    private String name;
    private String breed;

    // sitas daiktas vadinamas konstruktoriumi
    Animal(String name,String breed){
        this.name = name;
        this.breed= breed;
    }
    //Kintamojo getteris
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
}
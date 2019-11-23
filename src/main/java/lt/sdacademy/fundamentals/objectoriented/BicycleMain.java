package lt.sdacademy.fundamentals.objectoriented;

public class BicycleMain {
    public static void main(String[] args){
        Bicycle bike = new Bicycle(75,2,20); // susikuriam objekta Bicycle ir inicializuojam per konstruktoriu

        bike.getModel(); //grazinama 75
        System.out.println(bike. getModel()); // isvesta i ekrana 75

        int model = bike.getModel();
        System.out.println("Model is: "+model);

        System.out.println(Bicycle.count); //isvesta i ekrana 1
        Bicycle anotherBike = new Bicycle(80,4,25);

        int model1 = anotherBike.getModel();
        System.out.println("Model is: "+model1);

        System.out.println(Bicycle.count); //isvesta i ekrana 2

        // abiejuose atvejuose isvedama reiksme true
        System.out.println(Bicycle.count==bike.count); // kreipiames i viesai prieinama count
        System.out.println(bike.count==anotherBike.count);
    }
}

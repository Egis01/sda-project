package lt.sdacademy.homework.refactored;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            carList.add(buildCar());
        }

        System.out.println("Naujausias automobilis: " + findNewestCar(carList));
        System.out.println("Vidutinis automobilių amžius: " + findAverageCarsYear(carList));
        System.out.println("Brangiausias automobilis: " + findMostExpensiveCar(carList));
    }
    private static List<Car> readFile(){
        List<Car> carList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\main\\java\\lt\\sdacademy\\homework\\refactored\\CarData.txt"));
            String line = bufferedReader.readLine();

          /*  while (line != null) {
                carList.add(mapDataToModel(line));
                line = bufferedReader.readLine();
            }
*/
        }catch (IOException e){
            System.out.println("ivyko klaida nuskaitant faila");
        }
        return carList;
    }
   /* private static Car mapDataToModel (String lineData) {
        String[] splitedData = lineData.split(",");
      //  return new Car(splitedData[0], Integer.parseInt(splitedData[1],Integer.parseInt(splitedData[2],Double.parseDouble(splitedData[3],String.parseString(splitedData[4])))));
    }*/


    private static Car buildCar() {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite automobilio markę");
        String model = inputScanner.nextLine();

        System.out.println("Įveskite automobilio tipą");
        String type = inputScanner.nextLine();

        System.out.println("Įveskite variklio tūrį");
        int engine = inputScanner.nextInt();

        System.out.println("Įveskite automobilio pagaminimo metus");
        int year = inputScanner.nextInt();

        System.out.println("Įveskite automobilio kainą");
        double price = inputScanner.nextDouble();

        return new Car(model, engine, year, price, type);
    }

    private static String findNewestCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingInt(Car::getYear))
                .get()
                .toString();*/

        int newestCarMadeIn = carList.get(0).getYear();
        for (Car car : carList) {
            newestCarMadeIn = Math.max(newestCarMadeIn, car.getYear());
        }

        return String.valueOf(newestCarMadeIn);
    }

    private static double findAverageCarsYear(List<Car> carList) {
        int carsYearSum = 0;

        for (Car car : carList) {
            carsYearSum += car.getYear();
        }

        return (double) carsYearSum / carList.size();
    }

    private static double findMostExpensiveCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .get()
                .toString();*/

        double mostExpensiveCar = carList.get(0).getPrice();
        for (Car car : carList) {
            mostExpensiveCar = Math.max(mostExpensiveCar, car.getPrice());
        }

        return mostExpensiveCar;
    }
}






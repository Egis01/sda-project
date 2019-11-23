package lt.sdacademy.Fundamentalscoding.practicalexersises.Worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkerMain {
    private static final String FILE_LOCATION = "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\main\\java\\lt\\sdacademy\\Fundamentalscoding\\practicalexersises\\Worker\\WorkerData.txt";

    public static void main(String[] args) {
        List<Worker> workerList = getWorkerFromFile();

        System.out.println("Vidutinis darbuotoju uzmokestis: " + findAverageSalaryWorkers(workerList));
        System.out.println("Daugiausiai uzdirbantis darbuotojas: " + findMaxSalaryWorkerName(workerList) + " : "+ findMaxSalaryWorker(workerList));
        System.out.println("Vidutinis darbuotoju amzius yra: " + findAverageAgeWorkers(workerList));
        System.out.println("Jauniausias darbuotojas yra: "+ findYoungestWorkerName(workerList) + " : " + findYoungestWorker(workerList));

    }

    private static List<Worker> getWorkerFromFile() {
        List<Worker> workerList = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                workerList.add(mapDataToObject(line.split(";")));   // ???
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Klaidingai nuskaitytas failas");
        }
        return workerList;
    }

    private static Worker mapDataToObject(String[] workerData) {
        return new Worker(workerData[0], Double.parseDouble(workerData[1]), Integer.parseInt(workerData[2]), workerData[3]);
    }

    private static double findAverageSalaryWorkers(List<Worker> workerList) {
        double averageSalary = 0;

        for (Worker worker : workerList) {
            averageSalary += worker.getSalary();
        }
        return averageSalary / workerList.size();
    }

    private static double findAverageAgeWorkers(List<Worker> workerList) {
        double averageAge = 0;

        for (Worker worker : workerList) {
            averageAge += worker.getAge();
        }
        return averageAge / workerList.size();
    }

    private static double findMaxSalaryWorker(List<Worker> workerList) {
        double maxSalaryWorker = workerList.get(0).getSalary();
        for (Worker worker : workerList) {
            maxSalaryWorker = Math.max(maxSalaryWorker, worker.getSalary());
        }
        return maxSalaryWorker;
    }

    private static int findYoungestWorker(List<Worker> workerList){
        int youngestWorker = workerList.get(0).getAge();
        for (Worker worker : workerList){
            youngestWorker = Math.min(youngestWorker,worker.getAge());
        }
        return youngestWorker;
    }
    private static String findYoungestWorkerName(List<Worker> workerList) {
        String youngestWorekerName = "";
        int youngestWorker1 = workerList.get(0).getAge();
        for (Worker worker : workerList){
            if (youngestWorker1 > worker.getAge()){
                youngestWorker1 = worker.getAge();
                youngestWorekerName = worker.getName();
            }
        }
        return youngestWorekerName;
    }
    private static String findMaxSalaryWorkerName (List<Worker> workerList){
        String maxSalaryWorkerName = "";
        double maxSalaryWorker1 =  workerList.get(0).getSalary();
        for (Worker worker : workerList){
            if (maxSalaryWorker1 < worker.getSalary()){
                maxSalaryWorker1 = worker.getSalary();
                maxSalaryWorkerName = worker.getName();
            }
        }
        return maxSalaryWorkerName;
    }
}



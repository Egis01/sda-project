package lt.sdacademy.fundamentals.filewrite;

import java.io.*;

public class Example1 {
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\main\\java\\lt\\sdacademy\\fundamentals\\filewrite\\result.txt";

    public static void main(String[] args) {
        String text = "Good morning";

       writeDataToFile (text);
    }

    private static void writeDataToFile(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(data);
        }catch (FileNotFoundException e) {  // svarbi chatch'u tvarka, sita klaida ismeta jeigu buna direktorijoj klaida ir neranda failo
            System.out.println("Failas nerastas");
        } catch (IOException e){ // sitas suvalgo viska todel File not found yra specifinis ir rasomas pirma.
            System.out.println("Ivyko klaida rasant duomenis i faila !");
        }
    }
}

package lt.sdacademy.fundamentals.fileread.buffereader;

import lt.sdacademy.fundamentals.fileread.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleMain {
    public static void main(String[] args) {
        //try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\lt\\sdacademy\\fundamentals\\fileread\\TextFileRescource.txt"))) {                                                             // BufferedReader leidzia skaityti duomenis is faila ar irasyt, FileReader paima faila pagal lokacija
        try (BufferedReader br = new BufferedReader(new FileReader(Util.FILE_LOCATION))){ // is Util klases padarem copy ant FILE_LOCATION, pries tai kaip darem buvo virsutine eiletu
                                                                         //  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\lt\\sdacademy\\fundamentals\\fileread\\TextFileRescource.txt")); // susikuriam bufered reader objekta, file reader duoda failo lokacija
            StringBuilder stringBuilder = new StringBuilder();           // ji inicializuojam, susikuriam tuscia stringbilder
            String line;                                                 // viena eilute

            while(true) {                                                  // skaityk programa visada iseik is cilko
                line = br.readLine();
                if (line==null){
                    break;
                }
                stringBuilder.append(line);
            }

           /* do {
                line = br.readLine();                                        //nuskaito pirma eilute
                stringBuilder.append(line);                                  // ir ja pridedam prie kitos i musu s
            } while (line != null);                                          // ar cia yra paskutine eilute skaito tol kol ppaskutine eilute nera nulis, nera tuscia
*/
            System.out.println(stringBuilder.toString());                    // tada stabdo cikla ir paras
           // br.close();                                                      // uzdarom faila, nuo 8-tos java versijos buvo padaryta tokia ypatybe, kad galime neuzdarineti
        } catch (IOException e) {                                            // input output  exeption
            e.printStackTrace();
        }
    }

}

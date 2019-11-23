package lt.sdacademy.Fundamentalscoding.practicalexersises.AutorBook;

import javafx.scene.chart.ScatterChart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/*

public class BooksAndAuthorsMain {
    public static void main(String[] args) {
        List<Book> bookList = readDateFromFile();

        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    private static List<Book> readDateFromFile() {

        List<Book> bookList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\main\\java\\lt\\sdacademy\\Fundamentalscoding\\practicalexersises\\AutorBook\\DooksData"))) {
            //  String line = readDateFromFile();
            String line = br.readLine();

            while (line != null) {
                bookList.add(mapBookData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("blogai nuskaitytas failas");
        }
        return bookList;


    }

    private static Book mapBookData(String bookDate) {
        String[] splitedLineData = bookDate.split(";");
        return new Book(splitedLineData[0],mapAutorData(splitedLineData[1],Double.parseDouble(splitedLineData[2],Integer.parseInt(splitedLineData[3]))));
    }



    }
    private static List<Author> mapAutorData(String authorData){
    List<Author> authors = new ArrayList<>();
    String[] splitedLineData = authorData.split("-");
    if (splitedLineData.length == 0){
        String[]authorsData == authorData.split(",");
        authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
    }
    for (String authorsInfo : splitedLineData) {
        String[] authorsData = authorsInfo.split(",");
        authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
    }
    return authors;
*/

//}

   /* private static Book mapBookData(String bookData) {
        String[] splitedLineData = bookData.split(";");
        return new Book(splitedLineData[0], mapAuthorData(splitedLineData[1], Double.parseDouble(splitedLineData[2]), Integer.parseInt(splitedLineData[3])));
    }*/
//}
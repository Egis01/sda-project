package lt.sdacademy.fundamentals.fileread.filesreader;

import lt.sdacademy.fundamentals.fileread.Util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static lt.sdacademy.fundamentals.fileread.Util.FILE_LOCATION;


public class FileReaderMain {
    public static void main(String[] args) {
        try {
            List<String> text = Files.readAllLines(Paths.get(FILE_LOCATION));
            System.out.println(text);

        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
    }
}


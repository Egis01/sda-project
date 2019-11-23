package lt.sdacademy.Fundamentalscoding.practicalexersises.triangles;

import lt.sdacademy.fundamentals.fileread.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TriangleMain {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\main\\java\\lt\\sdacademy\\Fundamentalscoding\\practicalexersises\\triangles\\trianglesData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Dell\\IdeaProjects\\Introduction project\\src\\main\\java\\lt\\sdacademy\\Fundamentalscoding\\practicalexersises\\triangles\\result.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile();

        calculateTrianglePerimeter(triangles);
        writeTriangleToFile(triangles);
    }

    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            String line = br.readLine();
            while (line != null) {
                triangles.add(mapInfoToModel(line));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila:");
        }
        return triangles;
    }

    private static Triangle mapInfoToModel(String line) {
        String[] splittedLine = line.split(",");
        return new Triangle(Integer.parseInt(splittedLine[0]), Integer.parseInt(splittedLine[1]), Integer.parseInt(splittedLine[2]), TriangleType.valueOf(splittedLine[3]));
    }

    private static void calculateTrianglePerimeter(List<Triangle> triangles) {
        for (Triangle t : triangles) {
            int sum = t.getA() + t.getB() + t.getC();
            t.setPerimeter(sum);
        }
    }
   /* private static void countTrianglesPerimeter(List<Triangle> triangles) {
        int perimeter;
        for (Triangle triangle : triangles) {
            perimeter = triangle.getA() + triangle.getB() + triangle.getC();
            triangle.setPerimeter(perimeter);
        }
    }*/

    private static void writeTrianglePerimeterToFile(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                bw.write(t.getTriangleType().getTriangleDiscription() + t.getPerimeter());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Klaida irasant faila");
        }


    }

    private static void writeTriangleToFile(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                bw.write("Trikampio tipas: " + t.getTriangleType().getTriangleDiscription() + "perimetras:" + t.getPerimeter() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("klaida nuskaitant faila");
        }
    }
}

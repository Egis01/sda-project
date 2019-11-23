package lt.sdacademy.Fundamentalscoding.practicalexersises.Circle;

import java.util.Scanner;

public class CircleMain {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("iveskite apskritimo spindulio ilgi");
        int radius = scanner.nextInt();

        Circle circle = new Circle(radius, "zalias");
        double circleSquare = getCircleSquare(circle);

        System.out.printf("Apskritimo plotas: %2f", circleSquare);
    }
    private static double getCircleSquare(Circle circle) {
        return Math.pow(circle.getRadius(),2)*Math.PI;
    }
}

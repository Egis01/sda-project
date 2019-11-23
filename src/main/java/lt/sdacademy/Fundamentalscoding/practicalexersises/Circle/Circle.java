package lt.sdacademy.Fundamentalscoding.practicalexersises.Circle;

public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) { // konstruktorius
        this.radius = radius;
        this.color = color;
    }
    public int getRadius() { // geteris
        return radius;
    }
    public String getColor(){
        return color;
    }

}

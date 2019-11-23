package lt.sdacademy.Fundamentalscoding.practicalexersises.AutorBook;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private double price;
    private int qnt;

    public Book (String title, List<Author> authors,Double price,Integer qnt){
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qnt = qnt;
    }
    public String getTitle(){
        return title;
    }
    public List<Author> getAuthors() {
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public int getQnt(){
        return qnt;
    }

}

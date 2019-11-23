package lt.sdacademy.Fundamentalscoding.practicalexersises.AutorBook;

public class Author {
    private String name;
    private String email;
    private String phoneNumer;

    public Author(String name, String email, String phoneNumer) {
        this.name = name;
        this.email = email;
        this.phoneNumer = phoneNumer;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }
    public String toString (){
        return String.format("Autoriaus vardas: %s,pastas: %s", name, email);
    }

}

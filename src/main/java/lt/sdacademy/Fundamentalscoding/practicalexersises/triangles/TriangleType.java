package lt.sdacademy.Fundamentalscoding.practicalexersises.triangles;

public enum TriangleType {
    EQUILATERAL("lygiakrastis"),
    EQUAL_SIDE("lygiasonis"),
    OBTUSE("bukas");

    private String triangleDiscription;
                                               //konstruktorius
    TriangleType(String triangleDiscription) { // objekto pavadinimas triangleDiscription
        this.triangleDiscription = triangleDiscription;
    }

    public String getTriangleDiscription() {
        return triangleDiscription;
    }
}

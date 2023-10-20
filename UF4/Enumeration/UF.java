package UF4.Enumeration;

public class UF {
    private String id;
    private String nom;

    public UF(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "UF{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}

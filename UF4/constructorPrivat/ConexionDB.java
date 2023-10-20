package UF4.constructorPrivat;

public class ConexionDB {
    static ConexionDB instance = null;
    private String tipus;

    private ConexionDB() {
        System.out.println("Connexió iniciada");
    }

    public static ConexionDB getInstance() {
        if (instance == null){instance = new ConexionDB();}
        return instance;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
}

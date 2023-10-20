package UF4.Enumeration;

public enum Qualifier {
    NO_SATISFACTORI("NS",0),
    SATISFACTORI("S",5),
    NOTABLE("NT",8),
    EXCELLENT("EX",10);

    private String codi;
    private int nota;

    Qualifier(String codi, int nota) {
        this.codi = codi;
        this.nota = nota;
    }

    public String getCodi() {
        return codi;
    }

    public int getNota() {
        return nota;
    }
}

package UF4.Ejercicios.Ejer1_4;

import java.util.HashMap;
import java.util.Map;

public class Alumne implements Comparable<Alumne>{


    @Override
    public int compareTo(Alumne alumne) {
        return getNombre().compareTo(alumne.getNombre());
    }

    public enum Carrec{
        DELEGAT,
        SUBDELEGAT,
        SENSE_CARREC;
    }
    private String nombre;

    private String idalumno;
    private Carrec carrec;

    private Map<UF, Qualifier> notes;
    public Alumne(String nombre, String idalumno, Carrec carrec) {
        this.nombre = nombre;
        this.idalumno = idalumno;
        this.carrec = carrec;
        notes = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(String idalumno) {
        this.idalumno = idalumno;
    }

    public Carrec getCarrec() {
        return carrec;
    }

    public void setCarrec(Carrec carrec) {
        this.carrec = carrec;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "nombre='" + nombre + '\'' +
                ", idalumno='" + idalumno + '\'' +
                ", carrec=" + carrec +
                '}';
    }

    public void addNota(UF mp3uf4, Qualifier qualifier) {
        notes.put(mp3uf4,qualifier);
    }

    public Map<UF, Qualifier> getNotes() {
        return notes;
    }
}

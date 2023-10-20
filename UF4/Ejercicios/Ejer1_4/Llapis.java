package UF4.Ejercicios.Ejer1_4;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.Objects;

public class Llapis {
    private int color;
    private float gruix;

    public Llapis(int color) {
        this.color = color;
    }
    public Llapis(int color, float gruix) {
        this.color = color;
        this.gruix = gruix;
    }

    public int getColor() {
        return color;
    }
    public float getGruix() {
        return gruix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color && Float.compare(gruix, llapis.gruix) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, gruix);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "Llapis{" +
                "color=" + color +
                ", gruix=" + df.format(gruix) +
                '}';
    }
}

package UF4.Strings;

import java.time.LocalDate;

public class Persona {

    private String name;
    private String address;
    private LocalDate dataNaixament;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

import java.util.Date;

import animales.Perro;
import personas.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona("Juan Antonio", "García Gómez", new Date(1976, 12, 12));
        persona.setDni("12345678A");
        Perro perro = new Perro("Toby", "Pastor alemán", new Date(), persona);
        System.out.print(perro.leerChip());
    }
}

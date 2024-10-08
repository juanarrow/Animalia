package personas;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String dni;
    
    public Persona(String nombre, String apellidos, Date fecha){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fecha;
    }

    public Persona(String nombre, String apellidos, Date fecha, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fecha;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String obtenerFicha(){
        return "Nombre: "+nombre+
               "\nApellidos: "+apellidos+
               "\nDni: "+dni;
    } 
}

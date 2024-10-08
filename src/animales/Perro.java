package animales;

import java.util.Date;

import personas.Persona;

public class Perro {
    private String nombre;
    private String raza;
    private Date fechaNac;
    private Persona amo;

    public Perro(String nombre, String raza, Date fecha, Persona amo){
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNac = fecha;
        this.amo = amo;
    }

    public String caminar(int distancia){
        return "Estoy caminando "+distancia+" metros";
    }

    public String ladrar(int ladridos){
        String retorno = "";
        for(int contador = 1; contador<=ladridos;contador++){
            retorno = retorno + "Guau ";
        }
        return retorno;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getRaza() {
        return raza;
    }

    public Persona getAmo() {
        return amo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAmo(Persona amo) {
        this.amo = amo;
    }


    public String leerChip(){
        return "********** A N I M A L **********\nNombre: "+nombre+
               "\nRaza: "+raza+
               "\nFecha de Nacimiento: "+fechaNac+
               "\n********** D U E Ñ O **********\n"+amo.obtenerFicha();
    }
}

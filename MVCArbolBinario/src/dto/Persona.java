package dto;

import java.util.Objects;

public class Persona {
    private String rut;
    private String nombre;
    private int edad;
    private String ocupacion;

    public Persona(String rut, String nombre, int edad, String ocupacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public Persona() {
        this.rut = "00000-0";
        this.nombre = "desconocido";
        this.edad = 18;
        this.ocupacion = "desconocida";
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.rut);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        return true;
    }    
    
}

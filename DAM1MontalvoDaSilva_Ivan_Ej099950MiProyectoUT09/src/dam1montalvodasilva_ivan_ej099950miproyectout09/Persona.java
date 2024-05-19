/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public abstract class Persona {

    private String nombre;
    private String DNI;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String DNI, String apellidos, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.DNI = p.getDNI();
        this.apellidos = p.getApellidos();
        this.edad = p.getEdad();
    }

    public Persona() {
        this.nombre = "";
        this.DNI = "";
        this.apellidos = "";
        this.edad = 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", apellidos: " + apellidos + ", DNI: " + DNI + ", edad: " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.DNI);
        hash = 67 * hash + Objects.hashCode(this.apellidos);
        hash = 67 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }

}

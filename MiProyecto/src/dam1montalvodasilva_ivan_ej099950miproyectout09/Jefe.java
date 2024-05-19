/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

/**
 *
 * @author alumno
 */
public class Jefe extends Empleado {

    private double complementario;

    @Override
    public String toString() {
        return "Jefe: " + super.toString() + "\ncomplemento salarial: " + complementario;
    }

    /*Constructores*/
    //Completo
    public Jefe(double complementario, String nombre, String DNI, String apellidos, int edad, double salario) {
        super(nombre, DNI, apellidos, edad, salario);
        this.complementario = complementario;
    }

    //Copia
    public Jefe(Jefe j, Empleado e, Persona p) {
        super(e, p);
        this.complementario = j.getComplementario();
    }

    //Vacio
    public Jefe() {
        super();
        this.complementario = 0.;
    }

    public double getComplementario() {
        return complementario;
    }

    public void setComplementario(double complementario) {
        this.complementario = complementario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.complementario) ^ (Double.doubleToLongBits(this.complementario) >>> 32));
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
        final Jefe other = (Jefe) obj;
        return Double.doubleToLongBits(this.complementario) == Double.doubleToLongBits(other.complementario);
    }

}

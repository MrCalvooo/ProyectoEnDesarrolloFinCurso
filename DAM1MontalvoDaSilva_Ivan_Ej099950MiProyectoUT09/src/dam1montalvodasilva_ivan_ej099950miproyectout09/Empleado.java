/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

/**
 *
 * @author alumno
 */
public abstract class Empleado extends Persona {

    private double salario;

    @Override
    public String toString() {
        return super.toString() + "\n, salario: " + salario;
    }

    /*Constructores*/
    //Completo
    public Empleado(String nombre, String DNI, String apellidos, int edad, double salario) {
        super(nombre, DNI, apellidos, edad);
        this.salario = salario;
    }

    //Copia
    public Empleado(Empleado e, Persona p) {
        super(p);
        this.salario = e.getSalario();
    }

    public Empleado(double salario) {
        this.salario = salario;
    }

    //Vacio
    public Empleado() {
        super();
        this.salario = 0.;
    }

    //Getters y Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Empleado other = (Empleado) obj;
        return Double.doubleToLongBits(this.salario) == Double.doubleToLongBits(other.salario);
    }

}

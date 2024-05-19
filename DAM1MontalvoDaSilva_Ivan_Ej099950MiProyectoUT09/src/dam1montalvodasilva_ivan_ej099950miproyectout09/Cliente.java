/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

/**
 *
 * @author alumno
 */
public class Cliente extends Persona {

    private double presupuesto;

    @Override
    public String toString() {
        return "Cliente: " + super.toString() + ", presupuesto: " + presupuesto;
    }

    /*Constructores*/
    //Completo
    public Cliente(double presupuesto, String nombre, String DNI, String apellidos, int edad) {
        super(nombre, DNI, apellidos, edad);
        this.presupuesto = presupuesto;
    }

    //Copia
    public Cliente(Cliente c, Persona p) {
        super(p);
        this.presupuesto = c.getPresupuesto();
    }

    //Vacio
    public Cliente() {
        this.presupuesto = 0.;
    }

    //Getters y setters
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.presupuesto) ^ (Double.doubleToLongBits(this.presupuesto) >>> 32));
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
        final Cliente other = (Cliente) obj;
        return Double.doubleToLongBits(this.presupuesto) == Double.doubleToLongBits(other.presupuesto);
    }

}

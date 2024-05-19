/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Gerente extends Empleado {

    private Jefe j;
    private double complemento;
    private int idGerente;

    @Override
    public String toString() {
        return super.toString() + "\nGerente, " + "jefe: " + j.getNombre() + "ID: " + idGerente + ", complemento: " + complemento;
    }

    /*Constructores*/
    //Completo
    public Gerente(Jefe j, double complemento, int idGerente, String nombre, String DNI, String apellidos, int edad, double salario) {
        super(nombre, DNI, apellidos, edad, salario);
        this.j = j;
        this.complemento = complemento;
        this.idGerente = idGerente;
    }

    //Copia
    public Gerente(Jefe j, Gerente g, Empleado e, Persona p) {
        super(e, p);
        this.j = j;
        this.complemento = g.getComplemento();
        this.idGerente = g.getIdGerente();
    }

    //Vacio
    public Gerente() {
        super();
        this.complemento = 0.;
    }


    /*Getters y setters*/
    public Jefe getJ() {
        return j;
    }

    public void setJ(Jefe j) {
        this.j = j;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.j);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.complemento) ^ (Double.doubleToLongBits(this.complemento) >>> 32));
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
        final Gerente other = (Gerente) obj;
        if (Double.doubleToLongBits(this.complemento) != Double.doubleToLongBits(other.complemento)) {
            return false;
        }
        return Objects.equals(this.j, other.j);
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

    public static void eliminarGerente(HashSet<Gerente> setGerentes, String nombreEliminar) {
        Iterator<Gerente> iterator = setGerentes.iterator();

        while (iterator.hasNext()) {
            Gerente gerente = iterator.next();
            if (gerente.getNombre().equalsIgnoreCase(nombreEliminar)) {
                iterator.remove();
                System.out.println("Gerente " + nombreEliminar + " eliminado.");
                return;  // Salir del método después de eliminar el primer vendedor encontrado
            }
        }
        System.out.println("Gerente " + nombreEliminar + " no encontrado.");
    }

}

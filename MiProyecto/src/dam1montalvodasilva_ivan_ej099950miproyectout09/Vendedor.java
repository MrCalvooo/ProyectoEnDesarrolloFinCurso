/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Vendedor extends Empleado {

    private Gerente g;
    private int idVendedor;

    @Override
    public String toString() {
        return super.toString() + "\nID del gerente del empleado: " + g.getIdGerente() + ", nombre del gerente: " + g.getNombre();
    }

    /*Constructores*/
    //Completo
    public Vendedor(Gerente g, int idVendedor, String nombre, String DNI, String apellidos, int edad, double salario) {
        super(nombre, DNI, apellidos, edad, salario);
        this.g = g;
        this.idVendedor = idVendedor;
    }

    //Copia
    public Vendedor(Gerente g, Vendedor v, Empleado e, Persona p) {
        super(e, p);
        this.g = v.getG();
        this.idVendedor = v.getIdVendedor();
    }

    //Vacio
    public Vendedor() {
        super();
        this.idVendedor = 0;
    }

    //Getters y setters
    public Gerente getG() {
        return g;
    }

    public void setG(Gerente g) {
        this.g = g;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.g);
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
        final Vendedor other = (Vendedor) obj;
        return Objects.equals(this.g, other.g);
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    // Método estático para eliminar un vendedor por nombre
    public static void eliminarVendedorPorNombre(LinkedList<Vendedor> listaVendedores, String nombreAEliminar) {
        Iterator<Vendedor> iterator = listaVendedores.iterator();

        while (iterator.hasNext()) {
            Vendedor vendedor = iterator.next();
            if (vendedor.getNombre().equalsIgnoreCase(nombreAEliminar)) {
                iterator.remove();
                System.out.println("Vendedor " + nombreAEliminar + " eliminado.");
                return;  // Salir del método después de eliminar el primer vendedor encontrado
            }
        }
        System.out.println("Vendedor " + nombreAEliminar + " no encontrado.");
    }

}

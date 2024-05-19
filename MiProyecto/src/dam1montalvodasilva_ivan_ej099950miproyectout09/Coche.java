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
public class Coche extends Vehiculo {

    private int puertas;
    private String modelo;
    private int luces;
    private double capacidadMaletero;

    @Override
    public String toString() {
        return "\nKoenigsegg: " + modelo + " " + super.toString() + ",puertas: " + puertas + ", luces: " + luces + ", capacidadMaletero: " + capacidadMaletero + "\n";
    }

    public Coche(int puertas, String modelo, int luces, double capacidadMaletero, int id, String color, String motor, int ruedas, int asientos, double alto, double ancho, String tipoCombustible, double capacidadDeposito, double velocidadMaxima, double precio) {
        super(id, color, motor, ruedas, asientos, alto, ancho, tipoCombustible, capacidadDeposito, velocidadMaxima, precio);
        this.puertas = puertas;
        this.modelo = modelo;
        this.luces = luces;
        this.capacidadMaletero = capacidadMaletero;
    }

    public Coche() {
        super();
        this.puertas = 0;
        this.modelo = "";
        this.luces = 0;
        this.capacidadMaletero = 0.;
    }

    public Coche(Coche c, Vehiculo v) {
        super(v);
        this.puertas = c.getPuertas();
        this.modelo = c.getModelo();
        this.luces = c.getLuces();
        this.capacidadMaletero = c.getCapacidadMaletero();
    }

    //Getters y setters
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getLuces() {
        return luces;
    }

    public void setLuces(int luces) {
        this.luces = luces;
    }

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    //equals y hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.puertas;
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + this.luces;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.capacidadMaletero) ^ (Double.doubleToLongBits(this.capacidadMaletero) >>> 32));
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
        final Coche other = (Coche) obj;
        if (this.puertas != other.puertas) {
            return false;
        }
        if (this.luces != other.luces) {
            return false;
        }
        if (Double.doubleToLongBits(this.capacidadMaletero) != Double.doubleToLongBits(other.capacidadMaletero)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public abstract class Vehiculo {

    //Atributos
    private int id;
    private String motor;
    private int ruedas;
    private int asientos;
    private double alto;
    private double ancho;
    private String tipoCombustible;
    private double capacidadDeposito;
    private double velocidadMaxima;
    private double precio;
    private String color;

    @Override
    public String toString() {
        return ", color: " + color + ", motor: " + motor + ", numero de ruedas: " + ruedas + ", asientos: " + asientos + ",alto: " + alto + ", ancho: " + ancho + ", tipo de combustible: " + tipoCombustible + ", Capacidad del deposito: " + capacidadDeposito + ", velocidad máxima: " + velocidadMaxima + ", precio: " + precio;
    }

    /*Constructores*/
    //Completo
    public Vehiculo(int id, String color, String motor, int ruedas, int asientos, double alto, double ancho, String tipoCombustible, double capacidadDeposito, double velocidadMaxima, double precio) {
        this.id = id;
        this.color = color;
        this.motor = motor;
        this.ruedas = ruedas;
        this.asientos = asientos;
        this.alto = alto;
        this.ancho = ancho;
        this.tipoCombustible = tipoCombustible;
        this.capacidadDeposito = capacidadDeposito;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }

    //Vacio
    public Vehiculo() {
        this.color = "";
        this.motor = "";
        this.ruedas = 0;
        this.asientos = 0;
        this.alto = 0.;
        this.ancho = 0.;
        this.tipoCombustible = "";
        this.capacidadDeposito = 0.;
        this.velocidadMaxima = 0.;
        this.precio = 0.;
    }

    //Copia
    public Vehiculo(Vehiculo v) {
        this.id = v.getId();
        this.color = v.getColor();
        this.motor = v.getMotor();
        this.ruedas = v.getRuedas();
        this.asientos = v.getAsientos();
        this.alto = v.getAlto();
        this.ancho = v.getAncho();
        this.tipoCombustible = v.getTipoCombustible();
        this.capacidadDeposito = v.getCapacidadDeposito();
        this.velocidadMaxima = v.getVelocidadMaxima();
        this.precio = v.getPrecio();
    }

    //Getters y setters
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(double CapacidadDeposito) {
        this.capacidadDeposito = CapacidadDeposito;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //equals y hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.motor);
        hash = 83 * hash + this.ruedas;
        hash = 83 * hash + this.asientos;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.alto) ^ (Double.doubleToLongBits(this.alto) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.ancho) ^ (Double.doubleToLongBits(this.ancho) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.tipoCombustible);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.capacidadDeposito) ^ (Double.doubleToLongBits(this.capacidadDeposito) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.velocidadMaxima) ^ (Double.doubleToLongBits(this.velocidadMaxima) >>> 32));
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.ruedas != other.ruedas) {
            return false;
        }
        if (this.asientos != other.asientos) {
            return false;
        }
        if (Double.doubleToLongBits(this.alto) != Double.doubleToLongBits(other.alto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ancho) != Double.doubleToLongBits(other.ancho)) {
            return false;
        }
        if (Double.doubleToLongBits(this.capacidadDeposito) != Double.doubleToLongBits(other.capacidadDeposito)) {
            return false;
        }
        if (Double.doubleToLongBits(this.velocidadMaxima) != Double.doubleToLongBits(other.velocidadMaxima)) {
            return false;
        }

        if (!Objects.equals(this.motor, other.motor)) {
            return false;
        }
        return Objects.equals(this.tipoCombustible, other.tipoCombustible);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void eliminarVehiculo(HashMap<Integer, Vehiculo> mapaCoches, String nombreAEliminar) {
        if (mapaCoches.containsValue(nombreAEliminar)) {
            mapaCoches.remove(nombreAEliminar);
            System.out.println("Coche " + nombreAEliminar + " eliminado.");
        } else {
            System.out.println("Coche " + nombreAEliminar + " no encontrado.");
        }
    }

}

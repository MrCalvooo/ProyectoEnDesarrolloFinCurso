/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dam1montalvodasilva_ivan_ej099950miproyectout09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class DAM1MontalvoDaSilva_Ivan_Ej099950MiProyectoUT09 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Gestor del concesionario Koenigsegg");

        Persona jefe = new Jefe(2000.54, "Marcos", "0874658T", "Ruiz", 49, 5574.33);

        // Gerentes
        Gerente lorena = new Gerente((Jefe) jefe, 500.45, 10, "Lorena", "09748692H", "Pallares", 45, 2000.45);
        Gerente pepe = new Gerente((Jefe) jefe, 300.45, 20, "Pepe", "08111497P", "Parrado", 40, 3000.84);
        Gerente laura = new Gerente((Jefe) jefe, 200.00, 33, "Laura", "09787692H", "Ruíz", 35, 1937.79);
        Gerente alberto = new Gerente((Jefe) jefe, 210.87, 34, "Alberto", "09718692H", "Manchego", 36, 1940.21);
        Gerente sofia = new Gerente((Jefe) jefe, 459.78, 11, "Sofía", "0870158T", "Gallardo", 43, 2948.67);

        // Vendedores
        Vendedor ana = new Vendedor((Gerente) pepe, 50, "Ana", "09084348H", "Garrido", 26, 1220.87);
        Vendedor antonio = new Vendedor((Gerente) pepe, 51, "Antonio", "08974365H", "Garcia", 28, 1300.15);
        Vendedor javier = new Vendedor((Gerente) laura, 52, "Javier", "08964365P", "Blasco", 31, 1284.62);
        Vendedor ivan = new Vendedor((Gerente) laura, 53, "Iván", "09096348T", "Fernández", 25, 1220.0);
        Vendedor alba = new Vendedor((Gerente) alberto, 54, "Alba", "0896253F", "González", 32, 1436.56);
        Vendedor alma = new Vendedor((Gerente) alberto, 55, "Alma", "0900537S", "Carmona", 25, 1267.31);
        Vendedor daniel = new Vendedor((Gerente) sofia, 56, "Daniel", "09023467G", "Moreno", 23, 1242.34);
        Vendedor dario = new Vendedor((Gerente) sofia, 57, "Dario", "0897884L", "Munuera", 32, 1397.58);

        // Clientes
        Cliente cliente1 = new Cliente(500000.49, "Andres", "08784096G", "Pérez", 55);
        Cliente cliente2 = new Cliente(1000000.0, "Benito", "08974183B", "Galdós", 34);
        Cliente cliente3 = new Cliente(749687.123, "Andrea", "09098736T", "Cals", 37);
        Cliente cliente4 = new Cliente(0, "Sara", "09110587C", "Cuenca", 26);
        Cliente cliente5 = new Cliente(0, "Álvaro", "09110241L", "Domínguez", 28);

        /* Coches */
        // Regera
        Vehiculo regera1 = new Coche(3, "Regera", 8, 25.0, 1, "Negro", "V8", 4, 2, 1.11, 2.05, "Gasolina", 5, 410,
                3900000);
        Vehiculo regera2 = new Coche(3, "Regera", 8, 25.0, 2, "Rojo", "V8", 4, 2, 1.11, 2.05, "Gasolina", 5, 410,
                3900000);
        Vehiculo regera3 = new Coche(3, "Regera", 8, 25.0, 3, "Azúl", "V8", 4, 2, 1.11, 2.05, "Gasolina", 5, 410,
                3900000);
        Vehiculo regera4 = new Coche(3, "Regera", 8, 25.0, 4, "Amarillo", "V8", 4, 2, 1.11, 2.05, "Gasolina", 5, 410,
                3900000);
        Vehiculo regera5 = new Coche(3, "Regera", 8, 25.0, 5, "Morado", "V8", 4, 2, 1.11, 2.05, "Gasolina", 5, 410,
                3900000);

        // Agera
        Vehiculo agera1 = new Coche(3, "Agera", 8, 25.0, 6, "Amarillo", "V8", 4, 4, 1.12, 1.99, "Gasolina", 5, 447,
                165000000);
        Vehiculo agera2 = new Coche(3, "Agera", 8, 25.0, 7, "Negro", "V8", 4, 4, 1.12, 1.99, "Gasolina", 5, 447,
                165000000);
        Vehiculo agera3 = new Coche(3, "Agera", 8, 25.0, 8, "Blanco", "V8", 4, 4, 1.12, 1.99, "Gasolina", 5, 447,
                165000000);
        Vehiculo agera4 = new Coche(3, "Agera", 8, 25.0, 9, "Gris", "V8", 4, 4, 1.12, 1.99, "Gasolina", 5, 447,
                165000000);
        Vehiculo agera5 = new Coche(3, "Agera", 8, 25.0, 10, "Rojo", "V8", 4, 4, 1.12, 1.99, "Gasolina", 5, 447,
                165000000);

        // Jesko
        Vehiculo jesko1 = new Coche(2, "Jesko", 6, 0., 11, "Negro", "V8 biturbo", 4, 2, 1.2, 2.03, "Gasolina", 5, 0,
                3000000);
        Vehiculo jesko2 = new Coche(2, "Jesko", 6, 0., 12, "Amarillo", "V8 biturbo", 4, 2, 1.2, 2.03, "Gasolina", 5, 0,
                3000000);
        Vehiculo jesko3 = new Coche(2, "Jesko", 6, 0., 13, "Gris", "V8 biturbo", 4, 2, 1.2, 2.03, "Gasolina", 5, 0,
                3000000);
        Vehiculo jesko4 = new Coche(2, "Jesko", 6, 0., 14, "Rojo", "V8 biturbo", 4, 2, 1.2, 2.03, "Gasolina", 5, 0,
                3000000);
        Vehiculo jesko5 = new Coche(2, "Jesko", 6, 0., 15, "Azúl", "V8 biturbo", 4, 2, 1.2, 2.03, "Gasolina", 5, 0,
                3000000);

        // Colecciones
        HashMap<Integer, Vehiculo> mapaCoches = new HashMap<>();

        HashSet<Gerente> setGerentes = new HashSet<>();

        LinkedList<Vendedor> listaVendedores = new LinkedList<>();

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        /* Colecciones */
        // Añadir gerentes
        setGerentes.add(lorena);
        setGerentes.add(pepe);
        setGerentes.add(laura);
        setGerentes.add(alberto);
        setGerentes.add(sofia);

        // Añadir vendedores
        listaVendedores.add(ana);
        listaVendedores.add(antonio);
        listaVendedores.add(javier);
        listaVendedores.add(ivan);
        listaVendedores.add(alba);
        listaVendedores.add(alma);
        listaVendedores.add(daniel);
        listaVendedores.add(dario);

        // Añadir clientes
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        listaClientes.add(cliente4);
        listaClientes.add(cliente5);

        // Añadir coches
        int contador = 1; // Contador para el mapa

        // Ageras
        mapaCoches.put(contador, agera1);
        mapaCoches.put(contador++, agera2);
        mapaCoches.put(contador++, agera3);
        mapaCoches.put(contador++, agera4);
        mapaCoches.put(contador++, agera5);

        // Regeras
        mapaCoches.put(contador++, regera1);
        mapaCoches.put(contador++, regera2);
        mapaCoches.put(contador++, regera3);
        mapaCoches.put(contador++, regera4);
        mapaCoches.put(contador++, regera5);

        // Jeskos
        mapaCoches.put(contador++, jesko1);
        mapaCoches.put(contador++, jesko2);
        mapaCoches.put(contador++, jesko3);
        mapaCoches.put(contador++, jesko4);
        mapaCoches.put(contador++, jesko5);


        // Gestion del programa
        String anyadirCliente = "";

        final int MAXCLIENTES = 99;

        int contadorClientes = 5;

        // METER EXCEPCION
        int eleccion = 0;

        String rehacer = "";

        String contrasenya = "concesionarioProyecto";

        System.out.println("Contraseña: ");

        String contrasenyaPedida = scan.nextLine();

        // Comprobacion de la contraseña
        if (contrasenyaPedida.equals(contrasenya)) {
            do {
                try {
                    // Opciones a hacer
                    System.out.println("1.- Añadir cliente");
                    System.out.println("2.- Gestionar empleados");
                    System.out.println("3.- Gestion de coches");
                    System.out.println("4.- Cambiar contraseña");

                    System.out.println("Seleccione la opcion que desea hacer: ");
                    eleccion = Integer.parseInt(scan.nextLine());

                    if (eleccion < 1 || eleccion > 4) {
                        throw new IllegalArgumentException("Ingrese el numero de las opciones mostradas porfavor");
                    }

                    // Aquí iría el resto del código para manejar la elección del usuario.
                } catch (NumberFormatException e) {
                    System.out.println("Ingrese el numero de las opciones mostradas porfavor");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                switch (eleccion) {
                    case 1 -> {
                        // Bucle do-while para que se repita si se desea meter mas clientes
                        do {
                            try {
                                // Escaneamos los datos introducidos por el usuario para almacenarlos en
                                // variables e instanciarlos luego en el objeto
                                System.out.println("Nombre del cliente: ");
                                String nombreCliente = scan.nextLine();
                                System.out.println("Apellidos: ");
                                String apellidosCliente = scan.nextLine();
                                System.out.println("DNI: ");
                                String dniCliente = scan.nextLine();
                                System.out.println("Edad: ");
                                String edadCliente = scan.nextLine();
                                int edadC = Integer.parseInt(edadCliente);
                                System.out.println("Presupuesto disponible: ");
                                String presupuestoCliente = scan.nextLine();
                                double presCliente = Double.parseDouble(presupuestoCliente);

                                // Creamos el objeto cliente y metemos los datos introducidos por el usuario
                                // almacenados en variables
                                Persona cliente = new Cliente(presCliente, nombreCliente + contadorClientes++,
                                        dniCliente, apellidosCliente, edadC);

                                // Añadimos el cliente a la lista de clientes
                                listaClientes.add((Cliente) cliente);

                                System.out.println(cliente);

                                if (contadorClientes < MAXCLIENTES) {
                                    System.out.println("Desea añadir otro cliente (s/n): ");
                                    anyadirCliente = scan.nextLine();
                                }
                            } catch (NumberFormatException exception) {
                                System.out.println("Ingrese datos correctos");
                            }

                        } while (anyadirCliente.equalsIgnoreCase("s") && contadorClientes < MAXCLIENTES);

                        System.out.println("Datos introducidos correctamente");
                    }

                    case 2 -> {
                        System.out.println("1.- Gestionar vendedores\n2.- Gestionar gerentes");
                        System.out.println("Introduzca que desea hacer: ");
                        eleccion = Integer.parseInt(scan.nextLine());

                        /* Vendedores */
                        if (eleccion == 1) {
                            try {
                                // Gestion vendedores
                                System.out.println("1.- Registrar vendedor\n2.- Eliminar vendedor");
                                System.out.println("Seleccione que desea hacer con los vendedores: ");
                                eleccion = Integer.parseInt(scan.nextLine());
                            } catch (NumberFormatException exception) {
                                System.out.println("Ingrese los datos correctamente");
                            }

                            // Registro de vendedores
                            if (eleccion == 1) {
                                try {
                                    // Registro vendedores
                                    System.out.println("Nombre del vendedor: ");
                                    String nombreVendedor = scan.nextLine();
                                    System.out.println("Apellidos del vendedor: ");
                                    String apellidosVendedor = scan.nextLine();
                                    System.out.println("DNI: ");
                                    String dniVendedor = scan.nextLine();
                                    System.out.println("Edad: ");
                                    int edadVendedor = Integer.parseInt(scan.nextLine());
                                    System.out.println("Salario a percibir: ");
                                    double salarioVendedor = Double.parseDouble(scan.nextLine());
                                    System.out.println("ID: ");
                                    int idVendedor = Integer.parseInt(scan.nextLine());
                                    System.out.println("Gerente: " + lorena.getNombre());

                                    Persona vendedorNuevo = new Vendedor((Gerente) lorena, idVendedor, nombreVendedor,
                                            dniVendedor, apellidosVendedor, edadVendedor, salarioVendedor);
                                    System.out.println(vendedorNuevo);
                                    listaVendedores.add((Vendedor) vendedorNuevo);
                                } catch (NumberFormatException exception) {
                                    System.out.println("Ingrese los datos correctamente");
                                }

                            } else if (eleccion == 2) {

                                try {
                                    // Eliminar vendedor
                                    System.out.println(listaVendedores);
                                    System.out.println("Nombre del vendedor a eliminar: ");
                                    String eliminarNombre = scan.nextLine();

                                    Vendedor.eliminarVendedorPorNombre(listaVendedores, eliminarNombre);
                                    // Buscar forma para eliminar vendedor mediante su nombre
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Porfavor meta un nombre valido");
                                }
                            }

                            /* Gestion gerentes */
                        } else if (eleccion == 2) {
                            try {
                                System.out.println("1.- Registrar gerente\n2.- Eliminar gerente");
                                System.out.println("Seleccione que desea hacer con los gerentes: ");
                                eleccion = Integer.parseInt(scan.nextLine());
                            } catch (NumberFormatException exception) {
                                System.out.println("Ingrese los datos correctamente");
                            }

                            if (eleccion == 1) {
                                try {
                                    // Registrar gerente
                                    System.out.println("Nombre del gerente: ");
                                    String nombreGerente = scan.nextLine();
                                    System.out.println("Apellidos del gerente: ");
                                    String apellidosGerente = scan.nextLine();
                                    System.out.println("DNI: ");
                                    String dniGerente = scan.nextLine();
                                    System.out.println("Edad: ");
                                    int edadGerente = Integer.parseInt(scan.nextLine());
                                    System.out.println("Salario a percibir: ");
                                    double salarioGerente = Double.parseDouble(scan.nextLine());
                                    System.out.println("ID: ");
                                    int idGerente = Integer.parseInt(scan.nextLine());
                                    System.out.println("Complemento: ");
                                    Double complementoGerente = Double.valueOf(scan.nextLine());
                                    System.out.println("Jefe: " + jefe.getNombre());

                                    // Creamos nuevo gerente
                                    Persona gerenteNuevo = new Gerente((Jefe) jefe, complementoGerente, idGerente,
                                            nombreGerente, dniGerente, apellidosGerente, edadGerente, salarioGerente);

                                    // Añadimos el nuevo gerente
                                    setGerentes.add((Gerente) gerenteNuevo);
                                } catch (NumberFormatException exception) {
                                    System.out.println("Ingrese los datos correctamente");
                                }

                            } else if (eleccion == 2) {
                                try {// Eliminar gerente
                                    System.out.println(setGerentes);
                                    System.out.println("Nombre del gerente a eliminar (minusculas): ");
                                    String eliminarGerente = scan.nextLine();
                                    Gerente.eliminarGerente(setGerentes, eliminarGerente);
                                    // Forma de eliminar gerente mediante busqueda de nombre
                                } catch (IllegalArgumentException argumentException) {
                                    System.out.println("Ingrese gerente valido");
                                }
                            }
                        }
                    }

                    case 3 -> {
                        try {
                            System.out.println("1.- Registrar vehiculo nuevo");
                            System.out.println("2.- Eliminar vehiculo existente");
                            System.out.println("Porfavor introduzca que desea hacer: ");
                            eleccion = Integer.parseInt(scan.nextLine());
                        } catch (NumberFormatException exception) {
                            System.out.println("Ingrese los datos correctamente");
                        }
                        switch (eleccion) {
                            case 1 -> {
                                try {
                                    System.out.println("Modelo: ");
                                    String modelo = scan.nextLine();

                                    System.out.println("Color: ");
                                    String color = scan.nextLine();

                                    System.out.println("Motor: ");
                                    String motor = scan.nextLine();

                                    System.out.println("Numero de ruedas: ");
                                    int ruedas = Integer.parseInt(scan.nextLine());

                                    System.out.println("Numero asientos: ");
                                    int asientos = Integer.parseInt(scan.nextLine());

                                    System.out.println("Altura: ");
                                    double alto = Double.parseDouble(scan.nextLine());

                                    System.out.println("Anchura: ");
                                    double ancho = Double.parseDouble(scan.nextLine());

                                    System.out.println("Tipo de combustible: ");
                                    String tipoCombustible = scan.nextLine();

                                    System.out.println("Capacidad del deposito: ");
                                    double capacidadDeposito = Double.parseDouble(scan.nextLine());

                                    System.out.println("Velocidad máxima: ");
                                    double velocidadMaxima = Double.parseDouble(scan.nextLine());

                                    System.out.println("Numero de puertas: ");
                                    int puertas = Integer.parseInt(scan.nextLine());

                                    System.out.println("Numero de luces: ");
                                    int luces = Integer.parseInt(scan.nextLine());

                                    System.out.println("Capacidad en maletero: ");
                                    double capacidadMaletero = Double.parseDouble(scan.nextLine());

                                    System.out.println("Precio: ");
                                    double precio = Double.parseDouble(scan.nextLine());

                                    int idVehiculo = 15;

                                    // Creacion del objeto
                                    Vehiculo cocheNuevo = new Coche(puertas, modelo, luces, capacidadMaletero,
                                            idVehiculo++, color, motor, ruedas, asientos, alto, ancho, tipoCombustible,
                                            capacidadDeposito, velocidadMaxima, precio);

                                    // Añadimos a la lista el coche
                                    mapaCoches.put(cocheNuevo.getId(), cocheNuevo);
                                } catch (NumberFormatException exception) {
                                    System.out.println("Ingrese los datos correctamente");
                                }
                            }
                            case 2 -> {
                                try {
                                    System.out.println(mapaCoches);
                                    System.out.println("Modelo de coche a eliminar (jesko1): ");
                                    String eliminarCoche = scan.nextLine();
                                    Vehiculo.eliminarVehiculo(mapaCoches, eliminarCoche);
                                } catch (IllegalArgumentException argumentException) {
                                    System.out.println("Ingrese nombre valido");
                                }
                            }
                            default ->
                                System.out.println("Nope");
                        }
                        break;
                    }

                    case 4 -> {
                        // Cambio contraseña
                        System.out.println("Contraseña actual: ");
                        contrasenyaPedida = scan.nextLine();
                        if (contrasenyaPedida.equals(contrasenya)) {
                            System.out.println("Contraseña nueva: ");
                            contrasenyaPedida = scan.nextLine();
                            // Eliminamos la contraseña anterior
                            contrasenya = "";
                            contrasenya = contrasenyaPedida;
                        } else {
                            System.out.println("Las contraseñas no coinciden");
                        }
                        break;
                    }

                }
                try {
                    System.out.println("Desea realizar otra operacion (s/n): ");
                    rehacer = scan.nextLine();
                } catch (NumberFormatException exception) {
                    System.out.println("Ingrese la letra correctamente");
                }
            } while (rehacer.equalsIgnoreCase("s"));
        } else {
            System.out.println("Contraseña incorrecta");
        }
        System.out.println("Gracias por usar el servicio");

    }
}

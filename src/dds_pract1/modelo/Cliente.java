/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 * Clase cliente, encargada de crear objetos del tipo cliente y gestionar.
 * @author Leiva
 */
public class Cliente {
    /**
     * int con el numero de telefono del cliente.
     */
    int numeroTelefono;
    /**
     * String con el DNI del cliente.
     */
    String DNI;
    /**
     * String con el nombre del cliente.
     */
    String nombre;
    /**
     * String con el aniversario del cliente.
     */
    String aniversario;
    /**
     * int con el numero de visitas del piso.
     */
    int visitasPisos;
    /**
     * Constructor de la clase cliente, vacio.
     */
    public Cliente () {
        numeroTelefono = 0;
        nombre = "";
        DNI = "";
        aniversario = "";
    }
    
   
    /**
     * Metodo que permite editar el nombre del cliente
     * @param name String con el nombre del cliente
     */
    public void setName (String name) {
        nombre = name;
    }
    /**
     * Metodo que permite editar el dni del cliente
     * @param dni String con el dni del cliente
     */
    public void setDNI(String dni) {
        DNI = dni;
    }
    /**
     * Metodo que permite editar el numero de telefono del cliente
     * @param num int con el numero de telefono nuevo
     */
    public void setNumberPhone (int num) {
        numeroTelefono = num;
    }
    /**
     * Metodo que permite editar el aniversario de un cliente
     * @param a String con la fecha de aniversario
     */
    public void setAniversari(String a) {
        aniversario = a;
    }
    /**
     * Metodo que devuelve el aniversario del cliente
     * @return String con la fecha
     */
    public String getAniversari() {
        return aniversario;
    }
    /**
     * Metodo que devuelve el nombre del cliente
     * @return el nombre del cliente
     */
    public String getName() {
        return nombre;
    }
    /**
     * Metodo que devuelve el DNI del cliente
     * @return String con el DNI del cliente
     */
    public String getDNI() {
        return DNI;
    }
    /**
     * Metodo que devuelve el numero del cliente
     * @return int con el numero del cliente
     */
    public int getNumero() {
        return numeroTelefono;
    }
    /**
     * Metodo que añade una visita al piso
     */
    public void anadirvisitapiso() {
        visitasPisos++;
    }
    /**
     * Metodo que devuelve el numero de visitas ha hecho un cliente
     * @return int con el numero de visitas
     */
    public int getvisitaspiso() {
        return visitasPisos;
    }
    /**
     * Metodo que imprime toda la informacion de un cliente
     * @return String formatado con la informacion de un cliente para ser mostrado por pantalla
     */
    @Override
    public String toString() {
        String salida =
                "Nombre: " + nombre + "\n" +
                "Numero de telefono: " + numeroTelefono + "\n" +
                "DNI: " + DNI + "\n" +
                "Fecha de nacimiento: " + aniversario + "\n";
        return salida;
    }
}

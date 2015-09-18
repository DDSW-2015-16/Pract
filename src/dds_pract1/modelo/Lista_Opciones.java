/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 *
 * @author aleivaca9.alumnes
 */


public class Lista_Opciones {
    /**
     * Clase que va a devolver las listas de de opciones que gestionara el menu principal
     * @param opcionesPrincipales Contiene las opciones del menu principal
     * @param opcionesClientes Contiene las opciones del menu de clientes
     * @param opcionesPisos Contiene las opciones del menu de los pisos
     */

    String opcionesPrincipales;
    String opcionesClientes;
    String opcionesPisos;
    
    public Lista_Opciones ()
    /**
     * Metodo que genera las tres listas de opciones
     */
    {
        opcionesPrincipales = "c - Area Clientes"   + "\n" +
        "p - Area Pisos"        + "\n" +
        "l - Lista de pisos"    + "\n" +
        "q - Salir";
        opcionesClientes= "r - Registrar nuevo cliente" + "\n" +
        "e - Editar información clientes"   + "\n" +
        "s - Salir";
        opcionesPisos = "r - Registrar nuevo piso"  + "\n" +
        "e - Editar informacion piso"    + "\n" +
        "s - Salir";
    }
    
    public String getOpcionesPrincipales() {
        return opcionesPrincipales;
    }

    public String getOpcionesClientes() {
        return opcionesClientes;
    }

    public String getOpcionesPisos() {
        return opcionesPisos;
    }


    
    /*
    Volia preguntar perque necessitem aquests sets?
    - pregunta en Sistach -
    */
    public void setOpcionesPrincipales(String OpcionesPrincipales) {
        this.opcionesPrincipales = OpcionesPrincipales;
    }

    public void setOpcionesClientes(String OpcionesClientes) {
        this.opcionesClientes = OpcionesClientes;
    }

    public void setOpcionesPisos(String OpcionesPisos) {
        this.opcionesPisos = OpcionesPisos;
    }
    
    
}

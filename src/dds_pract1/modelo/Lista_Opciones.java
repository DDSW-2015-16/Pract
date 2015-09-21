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

/*** Clase que va a devolver las listas de de opciones que gestionara el menu principal */
public class Lista_Opciones {

    private String presentacion;
    /**Lista de las opciones principales de la aplicacion*/
    private String opcionesPrincipales;
    /**Lista de las opciones del area de clientes */
    private String opcionesClientes;
    /** Lista de las opcines del area de pisos*/
    private String opcionesPisos;
    
    private String errorNoEntiende;
    private String errorNoDigito;
    private String errorOverFlow;


    /**
     * Constructor que genera las tres listas de opciones
     */
    public Lista_Opciones ()
    {
        presentacion = "Buenos días señor, bienvenido a Bueno, Bonito y Barato (BBB)";
        opcionesPrincipales =
                "Esta en el menu principal" +   "\n" +
                "Escoja la opcion deseada:" +   "\n" +
                "c - Area Clientes"+            "\n" +
                "p - Area Pisos" +              "\n" +
                "l - Lista de pisos" +          "\n" +
                "q - Salir";

        opcionesClientes =
                "Has seleccionado la opcion clientes" + "\n" +
                "Escoja la opcion deseada:" +           "\n" +
                "r - Registrar nuevo cliente" +         "\n" +
                "e - Editar información clientes" +     "\n" +
                "q - Salir";
        
        opcionesPisos =
                "Has seleccionado la opcion pisos" +    "\n" +
                "Escoja la opcion deseada:" +           "\n" +
                "r - Registrar nuevo piso" +            "\n" +
                "e - Editar informacion piso" +         "\n" +
                "q - Salir";
        
        errorNoEntiende = "No se a visto concidencias. Porfavor, escoja una opcion valida.\n";
        errorNoDigito = "Se le ha pedido un digito. El programa no ha interpretado un digito.\n";
        errorOverFlow = "Ha seleccionado un elemento fuera de la lista. No ha podido ser seleccionado.\n";
    }

    public String getPresentacion ()
    { return presentacion; }
    /**
     * Metodo que devuelve la lista de opciones
     * @return Lista con las opciones para que escoja el cliente
     */
    public String getOpcionesPrincipales() {
        return opcionesPrincipales;
    }

    /**
     * Metodo que devuelve la lista de opciones del area de clientes
     * @return Lista con las opciones del area de clientes para que el cliente escoja que quiere hacer
     */
    public String getOpcionesClientes() {

        return opcionesClientes;
    }

    /**
     * Metodo que devuelve la lista de opciones del area de pisos
     * @return Lista con las opciones del area de pisos para que el cliente escoja que quiere hacer
     */
    public String getOpcionesPisos() {

        return opcionesPisos;
    }
    
    public String getErrorInterpret ()
    { return errorNoEntiende; }
    public String getErrorDigit ()
    { return errorNoDigito; }
    public String getErrorOverFlow ()
    { return errorOverFlow; }
}

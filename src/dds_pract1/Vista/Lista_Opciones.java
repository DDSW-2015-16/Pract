/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.Vista;

/**
 *
 * @author aleivaca9.alumnes
 */

/*** Clase que va a devolver las listas de de opciones que gestionara el menu principal */
public class Lista_Opciones {
    
    /**
     * Mensaje de presentacion de la aplicacion
     */
    private String presentacion;
    /**Lista de las opciones principales de la aplicacion*/
    private String opcionesPrincipales;
    /**Lista de las opciones del area de clientes */
    private String opcionesClientes;
    private String opcionesEditarCliente;
    /** Lista de las opcines del area de pisos*/
    private String opcionesPisos;
    /**
     * Lista de las opciones de editar pisos
     */
    private String opcionesEditarPisos;
    /**
     * String que se imprime cuando se introduce un algo incorrecto
     */
    private String errorNoEntiende;
    /**
     * Error que se imprime cuando no se ha introducido un digito
     */
    private String errorNoDigito;
    /**
     * Error que se imprimer cuando se selecciona un elemento que no esta en la lista
     */
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
                "l - Registrar Visitas a los Pisos" +          "\n" +
                "q - Salir";

        opcionesClientes =
                "Has seleccionado la opcion clientes" + "\n" +
                "Escoja la opcion deseada:" +           "\n" +
                "r - Registrar nuevo cliente" +         "\n" +
                "e - Editar información clientes" +     "\n" +
                "m - Cliente que ha visitado más pisos"+        "\n" +
                "b - Volver atras";
        
        opcionesEditarCliente =
                "Has seleccionado la opcion editar cliente" +   "\n" +
                "Escoja la opcion deseada:" +                   "\n" +
                "n - Editar el nombre" +                        "\n" +
                "d - Editar el DNI" +                           "\n" +
                "p - Editar telefono" +                         "\n" +
                "a - Editar fecha de nacimiento" +              "\n" +
                "b - Volver atras";
        
        opcionesPisos =
                "Has seleccionado la opcion pisos" +    "\n" +
                "Escoja la opcion deseada:" +           "\n" +
                "r - Registrar nuevo piso" +            "\n" +
                "e - Editar informacion piso" +         "\n" +
                "m - Piso más visitado" +               "\n" +
                "b - Volver atras";
        opcionesEditarPisos=
                "Has seleccionado la opcion editar pisos"+     "\n" +
                "Escoja la opcion deseada:" +           "\n" +
                "d - Direccion" +                       "\n" +
                "n - Piso" +                            "\n" +
                "p - Precio" +                          "\n" +
                "s - Superficie" +                      "\n" +
                "i - Porcentaje/Identificador" +        "\n" +
                "b - Volver atras";
                
        
        errorNoEntiende = "No se han visto concidencias. Por favor, escoja una opción válida.\n";
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
    /**
     * Metodo que devuelve el Error de un key incorrecto
     * @return Mensaje de error
     */
    public String getErrorInterpret (){
        return errorNoEntiende; 
    }
    /**
     * Metodo que devuelve el error se ha introducido un valor aleatorio
     * @return Mensaje de error
     */
    public String getErrorDigit (){ 
        return errorNoDigito; 
    }
    /**
     * Metodo que devuelve el error cuando se ha introducido un valor fuera de la lista
     * @return  Mensaje de error
     */
    public String getErrorOverFlow ()
    { return errorOverFlow; }
    
    public String getOpcionesEditarCliente ()
    { return opcionesEditarCliente; }
    
    public String getOpcionesEditarPisos() {
        return opcionesEditarPisos;
    }
}


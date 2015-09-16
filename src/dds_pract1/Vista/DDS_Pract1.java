/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.Vista;

import java.util.Scanner;

import dds_pract1.modelo.Lista_Opciones;
/**
 *
 * @author aleivaca9.alumnes
 */
public class DDS_Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean bigWhile = true;
        Lista_Opciones strings = new Lista_Opciones ();
        
        System.out.println("Buenos días señor, bienvenido a BBB escoja la opcion deseada:");
        
        while (bigWhile)
        {
            System.out.println (strings.getOpcionesPrincipales());
            //Aqui empezamos a escoger la opción que quiera el empresario
            switch(scanner.nextLine()){
                case("c"):
                    //Hemos seleccionado la opción clientes
                System.out.println(strings.getOpcionesClientes());
                    switch(scanner.nextLine()){
                        case("r"):
                            //Hemos escogido la opción de registrar un cliente
                            //A continuacion se pedira la informacion y se llamara al constructor
                            //TODO: Pedir la información del piso y llamar al constructor
                            System.out.println("funciona");
                            break;
                        case("e"):
                            //Hemos escogido la opcion de editar los datos de un cliente
                            //Se pedira que cliente quiere editar y que parametro
                            //TODO: Preguntar que cliente queremos editar
                            //TODO: Preguntar que caracteristica vamos a editar
                            break;
                        case("s"):
                            //Hemos escogido la opcion de salir del area de clientes
                            //TODO: Volver al estado anterior
                            break;
                        default:
                            continue;
                    }
                break;
                case("p"):
                    //llamamos la opción de registrar pisos
                    switch(scanner.nextLine()){
                        case("r"):
                            //Hemos escogido la opción de registrar un cliente
                            //A continuacion se pedira la informacion y se llamara al constructor
                            //TODO: Pedir la información del piso y llamar al constructor
                            System.out.println("funciona");
                            break;
                        case("e"):
                            //Hemos escogido la opcion de editar los datos de un cliente
                            //Se pedira que cliente quiere editar y que parametro
                            //TODO: Preguntar que cliente queremos editar
                            //TODO: Preguntar que caracteristica vamos a editar
                            break;
                        case ("l"):
                            
                        case("s"):
                            //Hemos escogido la opcion de salir del area de clientes
                            //TODO: Volver al estado anterior
                            break;
                    }
                break;
                case("l"):
                //visualizamos lista de pisos para escoger el piso a visitar
                     //switch lista de pisos
                break;
                case("q"):
                    bigWhile = false;
                default:
                    
                break;
            }
        }
    }
    
}

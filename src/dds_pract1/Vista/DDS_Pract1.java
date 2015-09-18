/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.Vista;

import dds_pract1.controlador.cnt;
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
        cnt controlador = new cnt();
        
        System.out.println("Buenos días señor, bienvenido a BBB escoja la opcion deseada:");
        
        while (bigWhile)
        {
            System.out.println (strings.getOpcionesPrincipales());
            //Aqui empezamos a escoger la opciÃ³n que quiera el empresario
            switch(scanner.nextLine()){
                case("c"):
                    //Hemos seleccionado la opciÃ³n clientes
                System.out.println(strings.getOpcionesClientes());
                Scanner sc = new Scanner(System.in);
                    switch(scanner.nextLine()){
                        case("r"):
                            //Hemos escogido la opciÃ³n de registrar un cliente
                            //A continuacion se pedira la informacion y se llamara al constructor
                            //TODO: Pedir la informaciÃ³n del piso y llamar al constructor
                            System.out.println("Introduzca la información del cliente:");
                            System.out.println("Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Dni:");
                            int dni = sc.nextInt();
                            System.out.println("Telefono:");
                            int tel = sc.nextInt();
                            controlador.AddClientBegin(dni, tel, nombre);
                            controlador.AddClientEnd();
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
                    //llamamos la opciÃ³n de registrar pisos
                System.out.println(strings.getOpcionesPisos());
                Scanner sc2 = new Scanner(System.in);
                    switch(scanner.nextLine()){
                        case("r"):
                            //Hemos escogido la opciÃ³n de registrar un cliente
                            //A continuacion se pedira la informacion y se llamara al constructor
                            //TODO: Pedir la informaciÃ³n del piso y llamar al constructor
                            System.out.println("Introduzca la informacion del piso: ");
                            System.out.println("Direccion: ");
                            String s = sc2.nextLine();
                            System.out.println("Numero del piso: ");
                            int n = sc2.nextInt();
                            System.out.println("Precio: ");
                            double p = sc2.nextDouble();
                            System.out.println("Superficie: ");
                            double sp = sc2.nextDouble();
                            controlador.AddPiso(s, n, p, sp);
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
                    }
                    break;
                case("l"):
                //visualizamos lista de pisos para escoger el piso a visitar
                     //switch lista de pisos
                    System.out.println(controlador.ShowListPisos());
                    break;
                case("q"):
                    System.out.println("Adios!");
                    bigWhile = false;
                default:
                    break;
            }
        }
    }
    
}

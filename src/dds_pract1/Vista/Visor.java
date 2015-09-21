/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.Vista;

import dds_pract1.controlador.Controlador;
import dds_pract1.modelo.Lista_Opciones;
import java.util.Scanner;

/**
 *
 * @author asistare7.alumnes
 */
public class Visor {
    
    /*
     * Totes les variables generals necessaries
     */
    Scanner scanner;
    Lista_Opciones strings;
    Controlador controlador;
    
    public Visor ()
    {
        scanner = new Scanner(System.in);
        strings = new Lista_Opciones ();
        controlador = new Controlador();
        
        System.out.println(strings.getPresentacion ());
        MenuPrincipal ();
    }
    
    private void MenuPrincipal ()
    {
        boolean loop = true;
        while (loop)
        {
            System.out.println (strings.getOpcionesPrincipales());
            switch(scanner.nextLine())
            {
            case("c"):/* Seleccion de cliente */
                MenuClient ();
                break;
            case("p"):/* Seleccion de piso */
                //MenuPisos ();
                System.out.println ("Esta en beta");
                break;
            case ("l"): break;
            case ("q"):
                System.out.println ("Adios");
                loop = false;
                break;
            default:
                    System.out.println (strings.getErrorInterpret());
                    break;
            }
        }
    }
    
    private void MenuClient ()
    {
        boolean loop = true;
        while (loop)
        {
            System.out.println(strings.getOpcionesClientes());
            switch (scanner.nextLine())
            {
            case ("r"):
                      
            case ("e"):
            case ("q"):
                loop = false;
                break;
            default:
                System.out.println (strings.getErrorInterpret());
                break;
            }
        }
    }
    
    private void AddClient ()
    {
        System.out.println("Introduzca la información del cliente:");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dni:");
        int dni = sc.nextInt();
        System.out.println("Telefono:");
        int tel = sc.nextInt();
        //Se llamara al constructor
        controlador.AddClientBegin(dni, tel, nombre);
        controlador.AddClientEnd();
        break;
        //TODO: ALMACENAR CLIENTES EN UN FICHERO
    }
}
          /*      
                Scanner sc = new Scanner(System.in);
                while (smallWhile){
                    switch(scanner.nextLine()){
                        case("r"):
             
                        case("e"):
                            //Hemos escogido la opcion de editar los datos de un cliente                          
                            //Se pedira que cliente quiere editar y que parametro o borrar cliente
                            //TODO: Preguntar que cliente queremos editar
                            //TODO: Preguntar que caracteristica vamos a editar
                            //TODO: BORRAR CLIENTES
                            System.out.println("hola");
                            System.out.println(strings.getOpcionesClientes());
                            break;
                        case("q"):
                            //Hemos escogido la opcion de salir del area de clientes
                            //TODO: Volver al estado anterior
                            smallWhile= false;
                            break;
                        default:
                            System.out.println("No has introducido una opcion correcta, vuelvelo a intentar."); 
                            System.out.println(strings.getOpcionesClientes());
                            break;
                    }
                }
    

                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                
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
                            
                        case("q"):
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
                    System.out.println (strings.getErrorInterpret());
                    break;
            }
        }
    }
    
}

}*/

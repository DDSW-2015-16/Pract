/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.Vista;

import dds_pract1.controlador.Controlador;
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
    }
    
    public void MenuPrincipal ()
    {
        boolean loop = true;
        System.out.println(strings.getPresentacion ());
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
            case ("l"):
                System.out.println ("Esta en beta");
                break;
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
                AddClient ();
                break;
            case ("e"):
                EditClient ();
                break;
            case ("b"):
                loop = false;
                break;
            default:
                System.out.println (strings.getErrorInterpret());
                break;
            }
        }
    }
    
    private void MenuEditClient ()
    {
        boolean loop = true;
        while (loop)
        {
            System.out.println ("Estado del cliente:\n" + controlador.ShowCliente());
            System.out.println (strings.getOpcionesEditarCliente());
            switch (scanner.nextLine())
            {
            case "n":
                System.out.println ("Introduce el nuevo nombre:");
                controlador.EditClientName(scanner.nextLine());
                break;
            case "d":
                System.out.println ("Introduce el nuevo DNI:");
                controlador.EditClientDNI(scanner.nextLine());
                break;
            case "p":
                System.out.println ("Introduce el nuevo numero de telefono:");
                controlador.EditClientNumberPhone( InputDigit () );
                break;
            case "b":
                loop = false;
                break;
            default:
                System.out.println (strings.getErrorInterpret());
                break;
            }
        }
    }
    
    
/*************************/
/* Controlar els clients */
/*************************/
    private void AddClient ()
    {
        controlador.AddClientBegin();
        
        System.out.println("Introduzca la información del cliente:");
        System.out.println("Nombre: ");
        controlador.EditClientName(scanner.nextLine());
        System.out.println("Dni:");
        controlador.EditClientDNI(scanner.nextLine());
        System.out.println("Telefono:");
        controlador.EditClientNumberPhone(InputDigit ());
        
        controlador.AddClientEnd();
    }
        private void EditClient ()
    {
        if ( SelectClient () )
                MenuEditClient ();
        else /* Control d'error */
            System.out.println (strings.getErrorOverFlow());
    }
    
    /**
     * Fem que surti directament, ja que aixi evitem errors de no existencia.
     * @return Si ha pogut ser seleccionat true, sino false
     */
    private boolean SelectClient ()
    {
        boolean loop = true;
        System.out.println
        (
                "Mostrem tots els clients:\n" +
                controlador.ShowListClients() +
                "Seleccioni pel index el client que vol."
        );

        try
        {
            controlador.SelectionClient( InputDigit () );
            return true;
        }catch (IndexOutOfBoundsException ex)
        { /* exepcio de si estas fora del array */
            return false;
        }
    }
    

    
/*******************************/
/* Apartat per ajudar al visor */
/*******************************/
    private int InputDigit ()
    {
        Integer o = new Integer (0);
        boolean loop = true;
        while (loop)
        {
            try
            {
                o = Integer.parseInt(scanner.nextLine());
                loop = false; // Si ha arribat aqui, ja tenim el resultat desitjat
            }catch (NumberFormatException e) {
                System.out.println (strings.getErrorDigit());
            }
        }
        return o.intValue();
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

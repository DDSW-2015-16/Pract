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
                MenuPisos ();
                break;
            case ("l"):
                System.out.println(controlador.ShowListPisos());
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
    /*
    Menu de los pisos
    */
    private void MenuPisos() {
        boolean loop = true;
        while (loop) {
            System.out.println(strings.getOpcionesPisos());
            switch(scanner.nextLine())
            {
                case("r"):
                    AddPiso();
                    break;
                case("e"):
                    EditPiso();
                    break;
                case("b"):
                    loop = false;
                    break;
                default:
                    System.out.println(strings.getErrorInterpret());
                    break;
            }
        }
        
    }
    /*
    Menu para editar un piso
    */
    private void MenuEditPisos() {
        boolean loop = true;
        while(loop) {
            System.out.println("Estado del piso:\n" + controlador.ShowPiso());
            System.out.println(strings.getOpcionesEditarPisos());
            switch(scanner.nextLine()) {
                case "d":
                    System.out.println("Introduce la nueva direccion:");
                    controlador.EditDireccion(scanner.nextLine());
                    break;
                case "n":
                    System.out.println("Introduce el nuevo numero de piso:");
                    controlador.EditNum(scanner.nextInt());
                    break;
                case "p":
                    System.out.println("Introduce el nuevo preci del piso:");
                    controlador.EdtiPrecio(scanner.nextDouble());
                    break;
                case "s":
                    System.out.println("Introduce la nueva superficie del piso:");
                    controlador.EditSuperficie(scanner.nextDouble());
                    break;
                case "i":
                    System.out.println("Introduce el identificador/porcentaje del piso:");
                    controlador.EditPorcentajeIdentificador(scanner.nextInt());
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
                "Lista de clientes:\n" +
                controlador.ShowListClients() +
                "Selecciona el cliente deseado:"
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
 
/*************************/
/* Controlar los pisos */
/*************************/
    /*
    Añadir un piso
    */
    private void AddPiso() {
        System.out.println("Introduzca la información del piso:");
        System.out.println("Se trata de un piso nuevo(S/N):");
        switch(scanner.nextLine()) {
            case("S"):
                AddPisoNuevo();
                break;
            case("N"):
                AddPisoOficial();
                break;
            default:
                break;
            
        }
    }
    /*
    Funcion auxiliar para añadir un piso nuevo
    */
    private void AddPisoNuevo() {
        System.out.println("Direccion: ");
        String d = scanner.nextLine();
        System.out.println("Numero piso:");
        int n = scanner.nextInt();
        System.out.println("Precio:");
        double p = scanner.nextDouble();
        System.out.println("Superficie: ");
        double s = scanner.nextDouble();
        System.out.println("Porcentaje de beneficio: ");
        int pc = scanner.nextInt();
        controlador.AddPisoNuevo(d, n, p, s, pc);
    }
    /*
    Funcion auxiliar para añadir un piso de proteccion oficial
    */
    private void AddPisoOficial() {
        System.out.println("Direccion: ");
        String d = scanner.nextLine();
        System.out.println("Numero piso:");
        int n = scanner.nextInt();
        System.out.println("Precio:");
        double p = scanner.nextDouble();
        System.out.println("Superficie: ");
        double s = scanner.nextDouble();
        System.out.println("Identificador ");
        int i = scanner.nextInt();
        controlador.AddPisoProtOficial(d, n, p, s, i);
    }
    
    private void EditPiso() {
        if(SelectPiso()) {
            MenuEditPisos();
        }
        else /* Control d'error */{
            System.out.println (strings.getErrorOverFlow());
        }      
    }
    /*
    Seleccionar piso deseado
    */
    private boolean SelectPiso() {
        boolean loop = true;
        System.out.println
        (
                "Lista de pisos:\n" +
                controlador.ShowListPisos() +
                "Selecciona el piso deseado:"
        );

        try
        {
            controlador.SeleccionarPiso(InputDigit());
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
          

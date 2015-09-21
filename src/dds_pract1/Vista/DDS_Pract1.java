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
public class DDS_Pract1
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
<<<<<<< HEAD
        Visor v = new Visor ();
=======
        Scanner scanner = new Scanner(System.in);
        boolean bigWhile = true;
        boolean smallWhile = true;
        Lista_Opciones strings = new Lista_Opciones ();
        Controlador controlador = new Controlador();
        
        System.out.println("Buenos días señor, bienvenido a BBB escoja la opcion deseada:");
        
        while (bigWhile)
        {
            smallWhile = true;
            System.out.println (strings.getOpcionesPrincipales());
            //Aqui empezamos a escoger la opcion que quiera el empresario
            switch(scanner.nextLine()){
                case("c"):
                    //Hemos seleccionado la opcion clientes
                System.out.println(strings.getOpcionesClientes());
                Scanner sc = new Scanner(System.in);
                while (smallWhile){
                    switch(scanner.nextLine()){
                        case("r"):
                            //Hemos escogido la opcion de registrar un cliente
                            //A continuacion se pedira la informacion 
                            System.out.println("Introduzca la información del cliente:");
                            System.out.println("Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.println("Dni:");
                            String dni = sc.nextLine();
                            System.out.println("Telefono:");
                            int tel = sc.nextInt();
                            System.out.println("Fecha de aniversario: ");
                            String a = sc.nextLine();
                            //Se llamara al constructor
                            controlador.AddClientBegin(tel, nombre, dni, a);
                            controlador.AddClientEnd();
                            break;
                            //TODO: ALMACENAR CLIENTES EN UN FICHERO
                        case("e"):
                            //Hemos escogido la opcion de editar los datos de un cliente                          
                            //Se pedira que cliente quiere editar y que parametro o borrar cliente
                            //TODO: Preguntar que cliente queremos editar
                            //TODO: Preguntar que caracteristica vamos a editar
                            //TODO: BORRAR CLIENTES
                            System.out.println("hola");
                            System.out.println(strings.getOpcionesClientes());
                            break;
                        case("s"):
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
>>>>>>> a44903ee717b223a31ef9be600de25466ac5291c
    }
}
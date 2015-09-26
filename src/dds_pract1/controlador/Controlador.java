/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.controlador;

import dds_pract1.modelo.Cliente;
import dds_pract1.modelo.Piso;
import dds_pract1.modelo.Piso_Nuevo;
import dds_pract1.modelo.Piso_Prot_Oficial;
import java.util.ArrayList;

/**
 * Clase controlador, encargada de gestionar todo lo que introduce el usuario
 * @author Leiva
 */
public class Controlador
{   
    /**
     * ArrayList de objetos de tipo cliente     */
    ArrayList<Cliente> llistaClients;
    /**
     * ArrayList de objetos de tipo cliente
     */
    ArrayList<Cliente> tmpllistaClients;
    /**
     * Cliente temporal
     */
    Cliente tmpClient;
    /**
     * Piso temporal
     */
    Piso tmpPiso;
    /**
     * Piso nuevo temporal
     */
    Piso_Nuevo tmpPisoN;
    /**
     * Piso de proteccion oficial temporal
     */
    Piso_Prot_Oficial tmpPisoP;
    /**
     * ArrayList de objetos del tipo Piso
     */
    ArrayList<Piso> llistaPisos;
    
    /**
     * Constructor de la clase controlador
     */
    public Controlador ()
    {
        llistaClients = new ArrayList<Cliente> ();
        llistaPisos = new ArrayList<Piso>();
    }
    
    //PISOS//
    /**
     * Metodo que sirve para anadir un piso nuevo
     * @param s direccion del piso
     * @param n numero del piso
     * @param p precio del piso
     * @param sp superficie del piso
     * @param porcentaje porcetnaje que se lleva la inmobiliaria
     */
    public void AddPisoNuevo(String s, int n, double p, double sp, int porcentaje) {
        tmpPiso = new Piso_Nuevo(p,n,sp,s,porcentaje);
        llistaPisos.add(tmpPiso);
    }
    /**
     * Metodo que sirve para anadir un piso de proteccion oficial
     * @param s direccion del piso
     * @param n numero del piso
     * @param p precio del piso
     * @param sp Superficie del piso
     * @param id Numero de identificacion del piso
     */
    public void AddPisoProtOficial(String s, int n, double p, double sp, int id) {
        tmpPiso = new Piso_Prot_Oficial(p,n,sp,s,id);
        llistaPisos.add(tmpPiso);
    }
    /**
     * Metodo que sirve para mostrar una lista de pisos
     * @return 
     */
    public String ShowListPisos () {
        String lista = "";
        for(int i = 0; i < llistaPisos.size(); ++i) {
            lista += i + "- \n" + llistaPisos.get(i);
        }
        return lista;
    }
    /**
     * Metodo que sirve para mostrar por pantalla un piso
     * @return String con todos los datos de un piso
     */
    public String ShowPiso() {
        return tmpPiso.toString();
    }
    /**
     * Metodo que sirve para seleccionar un piso para posteriormente editarlo
     * @param k int con el piso que hay que editar
     */
    public void SeleccionarPiso(int k) {
        tmpPiso = llistaPisos.get(k);
    }
    /**
     * Metodo que sirve para editar el precio de un piso
     * @param k double con el nuevo valor del precio del piso
     */
    public void EditPrecio(double k) {
        tmpPiso.setPrecio(k);
    }
    /**
     * Metodo que sirve para editar el numero de piso que es
     * @param k  int con el nuevo valor del numero del pìso
     */
    public void EditNum(int k) {
        tmpPiso.setNum(k);
    }
    /**
     * Metodo que sirve para editar la direccion de un piso seleccionado
     * @param s String con la nueva direccion del piso
     */
    public void EditDireccion(String s) {
        tmpPiso.setDireccion(s);
    }
    /**
     * Metodo que sirve para editar la superficie del piso seleccionado
     * @param k double con la nueva superficie del piso
     */
    public void EditSuperficie(double k) {
        tmpPiso.setSuperficie(k);
    }
    /**
     * Metodo que permite editar los valores unicos de los pisos, tanto si es de prot. oficial como si no
     * @param k int con el valor que queremos cambiar
     */
    public void EditPorcentajeIdentificador(int k) {
        //Miramos el tipo de piso que es
        boolean nuevo = tmpPiso.tipoPiso();
        //Depende del tipo de piso llamamos a un metodo u otro para editarlo
        if(nuevo) {
            tmpPisoN = (Piso_Nuevo) tmpPiso;
            tmpPisoN.setPorcentaje(k);
            tmpPiso = tmpPisoN;
        }
        else {
            tmpPisoP = (Piso_Prot_Oficial) tmpPiso;
            tmpPisoP.setIdprot(k);
            tmpPiso = tmpPisoP;
        }
    }
    /**
     * Metodo que muestra por pantalla los clientes que han visitado el piso seleccionado
     * @return 
     */
    public String ShowListaClientesPiso() {
        return tmpPiso.ShowVisitas();
    }
    
    /***********************************/
    /*********** clients ***************/
    /***********************************/

    /*********** ADD client ***********/
    /**
     * Metodo que inicia el evento de anadir un cliente, crea un objeto de la clase cliente
     */
    public void AddClientBegin ()
    {   tmpClient = new Cliente (); }
    /**
     * Metodo que anade un cliente a la lista de clientes
     */
    public void AddClientEnd ()
    {   llistaClients.add ( tmpClient ); }

    /*********** Show client **********/
    /**
     * Metodo que muestra una lista de todos los clientes que tiene la empresa
     * @return String con todos los clientes
     */
    public String ShowListClients ()
    {
        String o = "";
        int i;
        if (llistaClients.size() > 0)
        {
            for (i = 0; i < llistaClients.size(); i++)
                o += i + "- \n" + llistaClients.get(i);
        } else
            return "None";
        return o;
    }
    /**
     * Metodo que sirve para imprimir un cliente
     * @return String formatado que muestra toda la informacion de un cliente
     */
    public String ShowCliente ()
    { return tmpClient.toString(); }
    
    /*********** Edit client ***********/
    /**
     * Metodo que sirve para escoger el cliente a editar
     * @param e int con el numero de cliente que aparece por pantalla para editar
     * @throws IndexOutOfBoundsException El usuario pone un numero que no esta en la lista
     */
    public void SelectionClient (int e) throws IndexOutOfBoundsException
    {   tmpClient = llistaClients.get(e); }
    /**
     * Metodo que sirve para editar el nombre del cliente
     * @param e int con el nuevo nombre del cliente
     */
    public void EditClientName (String e)
    {   tmpClient.setName(e); }
    /**
     * Metodo que sirve para editar el DNI del cliente
     * @param e int con el nuevo DNI del cliente
     */
    public void EditClientDNI (String e)
    {   tmpClient.setDNI(e); }
    /**
     * Metodo que sirve para editar el telefono del cliente
     * @param e int con el numero de telefono del cliente
     */
    public void EditClientNumberPhone (int e)
    {   tmpClient.setNumberPhone(e); }
    public void EditClientBirth(String e) 
    {   tmpClient.setAniversari(e); }
    
    
    /**
     * Metodo que anade al piso el cliente que lo ha visitado.
     * Tambien anade el piso al cliente
     */
    public void AnadirVisita() {
        tmpPiso.AddVisita(tmpClient);
        tmpClient.anadirvisitapiso();
    }
    
    /**
     * Metodo que imprime por pantalla el piso mas visitado de todos
     */
    public void maxPiso() {
        //Cogemos el primer piso de la lista
        Piso n = llistaPisos.get(0);
        //Repasamos la lista de pisos para encontrar cual es el que mas visitas ha recibido
        for(int i = 1; i < llistaPisos.size(); ++i) {
            if(n.getNumVisitas() < llistaPisos.get(i).getNumVisitas()){
                n = llistaPisos.get(i);
            }
        }
        //Imprimimos el piso en cuestion
        System.out.println("El piso más visitado es el siguiente: ");
        System.out.println(n);
    }
    
    /**
     * Metodo que imprime por pantalla el cliente que mas pisos ha visitado
     */
    public void maxCliente() {
        //Cogemos el primer cliente de la lista
        Cliente c = llistaClients.get(0);
        //Repasamos la lista para ver que cliente ha visitado mas pisos
        for(int i = 1; i < llistaClients.size(); ++i) {
            if(c.getvisitaspiso() < llistaClients.get(i).getvisitaspiso()) {
                c= llistaClients.get(i);
            }
        }
        //Imprimimos por pantalla el cliente buscado
        System.out.println("El cliente que más pisos ha visitado es el siguiente: ");
        System.out.println(c);
    }
}

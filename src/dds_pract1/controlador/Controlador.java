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
 *
 * @author asistare7.alumnes
 */
public class Controlador
{
    ArrayList<Cliente> llistaClients;
    ArrayList<Cliente> tmpllistaClients;
    Cliente tmpClient;
    Piso tmpPiso;
    Piso_Nuevo tmpPisoN;
    Piso_Prot_Oficial tmpPisoP;
    ArrayList<Piso> llistaPisos;
    
    public Controlador ()
    {
        llistaClients = new ArrayList<Cliente> ();
        llistaPisos = new ArrayList<Piso>();
    }
    
    //PISOS//
    /*
    Añadir piso nuevo
    */
    public void AddPisoNuevo(String s, int n, double p, double sp, int porcentaje) {
        tmpPiso = new Piso_Nuevo(p,n,sp,s,porcentaje);
        llistaPisos.add(tmpPiso);
    }
    /*
    Añadir piso de proteccion oficial
    */
    public void AddPisoProtOficial(String s, int n, double p, double sp, int id) {
        tmpPiso = new Piso_Prot_Oficial(p,n,sp,s,id);
        llistaPisos.add(tmpPiso);
    }
    //Mostrar Lista de pisos
    public String ShowListPisos () {
        String lista = "";
        for(int i = 0; i < llistaPisos.size(); ++i) {
            lista += i + "- \n" + llistaPisos.get(i);
        }
        return lista;
    }
    /*
    Muestra el piso seleccionado
    */
    public String ShowPiso() {
        return tmpPiso.toString();
    }
    //Seleccionar piso para editar
    public void SeleccionarPiso(int k) {
        tmpPiso = llistaPisos.get(k);
    }
    //Editar precio del piso
    public void EdtiPrecio(double k) {
        tmpPiso.setPrecio(k);
    }
    //Editar numero del piso
    public void EditNum(int k) {
        tmpPiso.setNum(k);
    }
    //Editar Direccion del piso
    public void EditDireccion(String s) {
        tmpPiso.setDireccion(s);
    }
    //Editar superficie del piso
    public void EditSuperficie(double k) {
        tmpPiso.setSuperficie(k);
    }
    /*
    Editar identificador o porcentaje del piso seleccionado dependiendo de su tipo
    */
    public void EditPorcentajeIdentificador(int k) {
        boolean nuevo = tmpPiso.tipoPiso();
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
    //Mostrar lista de visitas de los clientes del piso seleccionado
    public String ShowListaClientesPiso() {
        return tmpPiso.ShowVisitas();
    }
    
    /***********************************/
    /*********** clients ***************/
    /***********************************/

    /*********** ADD client ***********/
    public void AddClientBegin ()
    {   tmpClient = new Cliente (); }
    public void AddClientEnd ()
    {   llistaClients.add ( tmpClient ); }

    /*********** Show client **********/
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
    public String ShowCliente ()
    { return tmpClient.toString(); }
    
    /*********** Edit client ***********/
    public void SelectionClient (int e) throws IndexOutOfBoundsException
    {   tmpClient = llistaClients.get(e); }
    public void EditClientName (String e)
    {   tmpClient.setName(e); }
    public void EditClientDNI (String e)
    {   tmpClient.setDNI(e); }
    public void EditClientNumberPhone (int e)
    {   tmpClient.setNumberPhone(e); }
    public void EditClientBirth(String e) 
    {   tmpClient.setAniversari(e); }
    
    /*
        Añade la visita del cliente en el piso seleccionado y añade que el  
        cliente ha visitado els piso
    */
    public void AnadirVisita() {
        tmpPiso.AddVisita(tmpClient);
        tmpClient.anadirvisitapiso();
    }
    
    /*
        Devuelve el piso con mayor visitas de los clientes.
    */
    public void maxPiso() {
        Piso n = llistaPisos.get(0);
        for(int i = 1; i < llistaPisos.size(); ++i) {
            if(n.getNumVisitas() < llistaPisos.get(i).getNumVisitas()){
                n = llistaPisos.get(i);
            }
        }
        System.out.println("El piso más visitado es el siguiente: ");
        System.out.println(n);
    }
    
    /*
        Devuelve el cliente que ha visitado mas pisos.
    */
    public void maxCliente() {
        Cliente c = llistaClients.get(0);
        for(int i = 1; i < llistaClients.size(); ++i) {
            if(c.getvisitaspiso() < llistaClients.get(i).getvisitaspiso()) {
                c= llistaClients.get(i);
            }
        }
        System.out.println("El cliente que más pisos ha visitado es el siguiente: ");
        System.out.println(c);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.controlador;

import dds_pract1.modelo.Cliente;
import dds_pract1.modelo.Piso;
import java.util.ArrayList;

/**
 *
 * @author asistare7.alumnes
 */
public class Controlador
{
    ArrayList<Cliente> llistaClients;
    Cliente tmpClient;
    Piso tmpPiso;
    ArrayList<Piso> llistaPisos;
    
    public Controlador ()
    {
        llistaClients = new ArrayList<Cliente> ();
        llistaPisos = new ArrayList<Piso>();
    }
    
    //PISOS//
    //Añadir Piso 
    public void AddPisoNuevo(String s, int n, double p, double sp) {
        tmpPiso = new Piso_Nuevo(p,n,sp,s);
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
    //Mostrar lista de visitas de los clientes del piso seleccionado
    public String ShowListaClientesPiso() {
        return tmpPiso.ShowVisitas();
    }
    
    /*********** clients ***************/

    /*********** ADD client ***********/
    public void AddClientBegin (int t, String n, String d, String a)
    {   tmpClient = new Cliente (t,n,d,a); }
    public void AddClientEnd ()
    {   llistaClients.add ( tmpClient ); }

    /*********** Show client **********/
    public String ShowListClients ()
    {
        String o = "";
        int i;
        
        for (i = 0; i < llistaClients.size(); i++)
            o += i + "- \n" + llistaClients.get(i);
        return o;
    }
    
    /*********** Edit client ***********/
    public void SelectionClient (int e)
    {   tmpClient = llistaClients.get(e); }
    public void EditClientName (String e)
    {   tmpClient.setName(e); }
    public void EditClientDNI (String e)
    {   tmpClient.setDNI(e); }
    public void EditClientNumberHotel (int e)
    {   tmpClient.setNumberHotel(e); }
}

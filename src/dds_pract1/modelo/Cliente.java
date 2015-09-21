/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 *
 * @author mferrema35.alumnes
 */
public class Cliente {
    int numeroTelefono;
    String DNI;
    String nombre;
    String aniversario;
    
    public Cliente () {
        numeroTelefono = 0;
        nombre = "";
        DNI = "";
        aniversario = "";
    }
    
    /* Concidero que normalment s'inicialitza sense saber que posar
    - Sistach -
    */
    
    public void setName (String name) {
        nombre = name;
    }
    
    public void setDNI(String dni) {
        DNI = dni;
    }
    
    public void setNumberPhone (int num) {
        numeroTelefono = num;
    }
    public void setAniversari(String a) {
        aniversario = a;
    }
    public String getAniversari() {
        return aniversario;
    }
    public String getName() {
        return nombre;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public int getNumero() {
        return numeroTelefono;
    }
    
    @Override
    public String toString() {
        String salida =
                "Nombre: " + nombre + "\n" +
                "Numero de telefono: " + numeroTelefono + "\n" +
                "DNI: " + DNI + "\n";
        return salida;
    }
}

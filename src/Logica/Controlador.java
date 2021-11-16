
package Logica;

import Persistencia.ControladorPersistencia;

public class Controlador {
    private ControladorPersistencia control = new ControladorPersistencia();
    
    public Boolean agregarCliente(int id, String nombre, String raza, String color, String alergico, String atencion, String nombreDueno, String celular, String observaciones){
        Cliente cliente = new Cliente(id, nombre, raza, color, alergico,atencion, nombreDueno, celular, observaciones);
        Boolean clienteAgregado = control.agregarCliente(cliente);
       
        return clienteAgregado;
    }
    
}

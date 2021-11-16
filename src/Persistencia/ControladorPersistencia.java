
package Persistencia;

import Logica.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {

    ClienteJpaController cliJPA = new ClienteJpaController();
    
    public Boolean agregarCliente(Cliente cliente) {
        try {
            cliJPA.create(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    
    
}

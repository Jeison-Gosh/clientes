package gdi.clientes;

import conexiondb.Postgresdb;
import daoclienteimpl.ClienteImpl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Cliente;

public class Clientes {

    public static void main(String[] args) {
        try {
            Postgresdb.createConection("jdbc:postgresql://localhost:5432/clientes", "postgres", "58B69F8CDCE6A");
            System.out.println("estamos en conexion con BD");
            Cliente c = new Cliente();
            c.setId(1);
            c.setNombre("test1");
            c.setTelefono(1234556789);
            c.setDirección("cualquiera");
            c.setCorreo("emaril");
            c.setTipoCliente((short) 1);
            
            ClienteImpl ci = new ClienteImpl();
            ci.eliminarCliente(c);
            
            ci.listarClientes().forEach((t) -> {
                System.out.println(t.toString());
            });
        } catch (SQLException ex) {
            System.out.println("sin conexion con BD");
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

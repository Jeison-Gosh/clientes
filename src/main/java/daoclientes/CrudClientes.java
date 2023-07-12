package daoclientes;

import java.sql.SQLException;
import java.util.LinkedList;
import modelos.Cliente;

public interface CrudClientes <T> {
    
    public T listarCliente(long cedula) throws SQLException;
    public int registrarCliente(Cliente cliente) throws SQLException;
    public int actualizarCliente(Cliente cliente) throws SQLException;
    public int eliminarCliente(Cliente cliente) throws SQLException;
    
    
}

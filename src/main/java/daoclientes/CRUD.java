package daoclientes;

import java.sql.SQLException;
import java.util.LinkedList;
import modelos.Cliente;

public interface CRUD <T> {
    
    public LinkedList<T> listarClientes() throws SQLException;
    public T listarPorId(int id) throws SQLException;
    public boolean registrarCliente(Cliente cliente) throws SQLException;
    public boolean actualizarCliente(Cliente cliente) throws SQLException;
    public boolean eliminarCliente(Cliente cliente) throws SQLException;
    
    
}

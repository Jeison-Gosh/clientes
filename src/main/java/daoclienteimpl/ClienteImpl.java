package daoclienteimpl;

import conexiondb.Postgresdb;
import daoclientes.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import modelos.Cliente;

public class ClienteImpl implements CRUD<Cliente> {

    private Connection con;
    private ResultSet rs;
    private Statement st;

    public ClienteImpl() throws SQLException {
        con = Postgresdb.createConection("jdbc:postgresql://localhost:5432/clientes", "postgres", "58B69F8CDCE6A");
    }

    @Override
    public LinkedList<Cliente> listarClientes() throws SQLException {
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM public.clientes");
        LinkedList<Cliente> ls = new LinkedList<>();
        while (rs.next()) {
            Cliente c = new Cliente();
            c.setId(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setTelefono(rs.getLong(3));
            c.setDirección(rs.getString(4));
            c.setCorreo(rs.getString(5));
            c.setTipoCliente(rs.getShort(6));
            System.out.println(c.toString());
            ls.add(c);
        }

        return ls;
    }

    @Override
    public Cliente listarPorId(int id) throws SQLException {
        throw new SQLException();
    }

    @Override
    public boolean registrarCliente(Cliente cliente) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO clientes (id, nombre, telefono, direccion, correo, tipo_cliente)VALUES(?, ?, ?, ?, ?, ?);");
        try {
           ps.setInt(1, cliente.getId());
           ps.setString(2, cliente.getNombre());
           ps.setLong(3, cliente.getTelefono());
           ps.setString(4, cliente.getDirección());
           ps.setString(5, cliente.getCorreo());
           ps.setShort(6, cliente.getTipoCliente());
           ps.execute();
           return true;
        } catch (Exception e) {
            
        }
        
        return false;
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) throws SQLException {
           con.setAutoCommit(false);
        int id;
        if (cliente != null) {
            id = cliente.getId();
        } else {
            id = -1;
        }

        PreparedStatement pst = con.prepareStatement("UPDATE clientes SET nombre=? , telefono=?, direccion=?, correo=?, tipo_cliente=? WHERE id =?");
        try {
            pst.setString(1, cliente.getNombre());
            pst.setLong(2, cliente.getTelefono());
            pst.setString(3, cliente.getDirección());
            pst.setString(4, cliente.getCorreo());
            pst.setShort(5, cliente.getTipoCliente());
            pst.setInt(6, id);
            pst.execute();
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
        }
        return false;

    }

    @Override
    public boolean eliminarCliente(Cliente cliente) throws SQLException {
        con.setAutoCommit(false);
        int id;
        if (cliente != null) {
            id = cliente.getId();
        } else {
            id = -1;
        }

        PreparedStatement pst = con.prepareStatement("DELETE FROM clientes WHERE id =?");
        try {
            pst.setInt(1, id);
            pst.execute();
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
        }
        return false;
    }

}

package daoclienteimpl;

import conexiondb.Postgresdb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelos.Cliente;
import daoclientes.CrudClientes;

public class ClienteImpl implements CrudClientes<Cliente> {

    private Connection con;
    private ResultSet rs;
    private Statement st;

    public ClienteImpl() throws SQLException {
        con = Postgresdb.createConection("jdbc:postgresql://localhost:5432/clientes", "postgres", "58B69F8CDCE6A");
    }

    @Override
    public Cliente listarCliente(long cedula) throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM public.clientes WHERE cedula = ?");
        ps.setLong(1, cedula);
        rs = ps.executeQuery();
        Cliente c = new Cliente();
        if (rs.next()) {
            c.setId(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setTelefono(rs.getLong(3));
            c.setDirección(rs.getString(4));
            c.setCorreo(rs.getString(5));
            c.setTipoCliente(rs.getShort(6));
            c.setCedula(rs.getLong(7));
            System.out.println(c.toString());
        }
        return c;
    }

    @Override
    public int registrarCliente(Cliente cliente) throws SQLException {
        int clienteId = -1;
        con.setAutoCommit(false);
        try ( PreparedStatement ps = con.prepareStatement(
                "INSERT INTO clientes\n"
                + "(id, nombre, telefono, direccion, correo, tipo_cliente, cedula)"
                + "VALUES((nextval('clientes_id_seq')),?,?,?,?,?,?)",
                Statement.RETURN_GENERATED_KEYS)) {
            System.out.println(cliente);
            ps.setString(1, cliente.getNombre());
            ps.setLong(2, cliente.getTelefono());
            ps.setString(3, cliente.getDirección());
            ps.setString(4, cliente.getCorreo());
            ps.setShort(5, cliente.getTipoCliente());
            ps.setLong(6, cliente.getCedula());
            ps.execute();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                clienteId = rs.getInt(1);
            }
            con.commit();
            return clienteId;
        } catch (SQLException e) {
            con.rollback();
            throw new SQLException();
        }
    }

    @Override
    public int actualizarCliente(Cliente cliente) throws SQLException {
        int clienteId = -1;
        con.setAutoCommit(false);
        try ( PreparedStatement ps = con.prepareStatement("UPDATE clientes SET nombre=? , telefono=?, direccion=?, correo=?, tipo_cliente=? WHERE cedula =?",
                Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, cliente.getNombre());
            ps.setLong(2, cliente.getTelefono());
            ps.setString(3, cliente.getDirección());
            ps.setString(4, cliente.getCorreo());
            ps.setShort(5, cliente.getTipoCliente());
            ps.setLong(6, cliente.getCedula());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                clienteId = rs.getInt(1);
            }
            con.commit();
            return clienteId;
        } catch (Exception e) {
            con.rollback();
            throw new SQLException();
        }

    }

    @Override
    public int eliminarCliente(Cliente cliente) throws SQLException {
        int clienteId = -1;
        con.setAutoCommit(false);
        if (cliente != null) {

            try ( PreparedStatement ps = con.prepareStatement("DELETE FROM clientes WHERE cedula =?",
                    Statement.RETURN_GENERATED_KEYS);) {
                ps.setLong(1, cliente.getCedula());
                ps.executeUpdate();
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    clienteId = rs.getInt(1);
                }
                con.commit();
                return clienteId;
            } catch (Exception e) {
                con.rollback();
                throw new SQLException();
            }
        }
        return clienteId;
    }

}

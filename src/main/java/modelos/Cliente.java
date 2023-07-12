package modelos;

public class Cliente {

    private int id;
    private String nombre;
    private long cedula;
    private long telefono;
    private String direccion;
    private String correo;
    private short tipoCliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String dirección) {
        this.direccion = dirección;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    public short getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(short tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direcci\u00f3n=" + direccion + ", correo=" + correo + ", tipoCliente=" + tipoCliente + '}';
    }

}

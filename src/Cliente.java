public class Cliente implements Autenticable {

    public String nombre;
    public String documento;
    public double telefono;
    public String clave;
    private AutUtil util;

    public Cliente(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
        this.util = new AutUtil();

    }

    @Override
    public boolean iniciarSeccion(String clave) {
        return util.iniciarSeccion(clave);
    }

    @Override
    public void setClave(String clave) {
        util.setClave(clave);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

}

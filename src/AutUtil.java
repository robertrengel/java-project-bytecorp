public class AutUtil {
    public String clave;
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSeccion(String clave) {
        return clave.equals(this.clave);
    }
}

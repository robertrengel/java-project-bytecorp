public class Administrador extends Funcionario implements Autenticable {

    private AutUtil util;

    public Administrador(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        this.util = new AutUtil();
    }

    @Override
    public double getBono(double porcentaje) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean iniciarSeccion(String clave) {
        return util.iniciarSeccion(clave);
    }

    @Override
    public void setClave(String clave) {
        util.setClave(clave);
    }

}

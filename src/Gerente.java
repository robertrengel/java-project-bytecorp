public class Gerente extends Funcionario implements Autenticable {
    private String departamento;
    private String cargo;
    private AutUtil util;

    public Gerente(String nombre, String documento, double salario, String departamento, String cargo) {
        super(nombre, documento, salario);
        this.departamento = departamento;
        this.cargo = cargo;
        this.util = new AutUtil();
    }

    @Override
    public double getBono(double porcentaje) {
        return super.getSalario() * porcentaje / 100 + super.getSalario() * 0.1;
    }

    @Override
    public void setClave(String clave) {
        util.setClave(clave);
    }

    @Override
    public boolean iniciarSeccion(String clave) {
        return util.iniciarSeccion(clave);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

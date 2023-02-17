public class Gerente extends Autenticable {
    private String departamento;
    private String cargo;
    private String clave;
    
    public Gerente(String nombre, String documento, double salario, String departamento, String cargo) {
        super(nombre, documento, salario);
        this.departamento = departamento;
        this.cargo = cargo;
    }
    
    @Override
    public double getBono(double porcentaje) {
        return super.getSalario() * porcentaje / 100 + super.getSalario() * 0.1;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean iniciarSeccion(String clave) {
        return clave == "La clave";
    }
    
}

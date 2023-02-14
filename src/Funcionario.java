
public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;

    public Funcionario(String nombre, String documento, double salario) {
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
    }

    public double getBono(double porcentaje) {
        return salario * porcentaje / 100;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public double getSalario() {
        return salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
}
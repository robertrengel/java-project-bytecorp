public class Contador extends Funcionario {

    public Contador(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        
    }

    @Override
    public double getBono(double porcentaje) {
        return super.getSalario() * porcentaje / 100;
    }
    
}

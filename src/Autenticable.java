public class Autenticable extends Funcionario{

    private String clave;

    public Autenticable(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getBono(double porcentaje) {
        // TODO Auto-generated method stub
        return 0;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSeccion(String clave) {
        return clave == "La clave";
    }



    
}

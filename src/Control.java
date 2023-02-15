public class Control {

    private double suma;
    public double getControlBono(Funcionario funcionario) {
        this.suma = funcionario.getBono(10) + this.suma;
        System.out.println("Calculo de total de bonos: " + suma);
        return this.suma;
    }
}

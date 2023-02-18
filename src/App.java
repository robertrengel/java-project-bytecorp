public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", "12345678", 5000, "Sistemas", "Gerente");
        Administrador administrador = new Administrador("Juan", "12345678", 5000);
        Cliente cliente = new Cliente("Juan", "12345678");
        SistemaInterno sistemaInterno = new SistemaInterno();
        cliente.setClave("La clave");
        gerente.setClave("La clave");
        administrador.setClave("La clave");
        sistemaInterno.autenticar(cliente);
        sistemaInterno.autenticar(gerente);
        sistemaInterno.autenticar(administrador);
        // Funcionario funcionario = new Contador("Juan", "12345678", 2000);
        // System.out.println();
        // System.out.println("Nombre de funcionario: "+funcionario.getNombre());
        // System.out.println("Documento de funcionario: "+funcionario.getDocumento());
        // System.out.println("Salario de funcionario: "+funcionario.getSalario());
        // System.out.println("Bono de funcionario: "+funcionario.getBono(10));
        // System.out.println();

        // Gerente gerente = new Gerente("Juan", "12345678", 5000, "IT", "Programador");
        // System.out.println("Nombre de Gerente: "+ gerente.getNombre());
        // System.out.println("Documento de Gerente: "+ gerente.getDocumento());
        // System.out.println("Salario de Gerente: "+ gerente.getSalario());
        // System.out.println("Departamento de Gerente: "+ gerente.getDepartamento());
        // System.out.println("Cargo de Gerente: "+ gerente.getCargo());
        // System.out.println("Bono de Gerente: "+ gerente.getBono(100));
        // System.out.println();
        // Control control = new Control();
        // control.getControlBono(funcionario);
        // control.getControlBono(gerente);
        

    }
}

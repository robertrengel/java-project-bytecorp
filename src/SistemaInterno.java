public class SistemaInterno {
    private String clave = "La clave";

    // public boolean autenticar(Autenticar gerente) {
    // boolean autenticado = gerente.iniciarSeccion(clave);
    // return this.clave.equals(clave);
    // }

    public boolean autenticar(Autenticable autenticable) {
        boolean autenticado = autenticable.iniciarSeccion(clave);
        if (autenticado) {
            System.out.println("Autenticado");
            return true;
        }
        System.out.println("No autenticado");
        return false;
    }
}

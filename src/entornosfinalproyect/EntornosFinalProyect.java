package entornosfinalproyect;

/**
 *
 * @author Jaime Martín Soto
 * @version 1.0.14
 */
public class EntornosFinalProyect {

    /**
     * main es la clase principal del programa donde ejecutaremos los métodos de las demás
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria c1 = new CuentaBancaria (100,"jaime","martin soto", 
                "mostoles", "1234567F", 666666666, 19, 150, 12, 777777);
        GestorCuenta g1 = new GestorCuenta(c1);
        g1.consultar();
        g1.ingresar(20);
        g1.retirar(10);
        g1.consultar();
        g1.modificar();
        g1.consultar();
    }
    
}

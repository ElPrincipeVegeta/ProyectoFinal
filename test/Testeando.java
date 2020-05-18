import entornosfinalproyect.CuentaBancaria;
import entornosfinalproyect.GestorCuenta;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Jaime Martín Soto
 * @version 1.0.14
 * @param Testeando
 * En esta clase comprobamos que todas las demás funcionan correctamente
 */
public class Testeando {
    @Test
	public void test() {
            CuentaBancaria c1 = new CuentaBancaria (100,"jaime","martin soto", 
                "mostoles", "1234567F", 666666666, 19, 150, 12, 777777);
            GestorCuenta g1 = new GestorCuenta(c1);
        g1.consultar();
        g1.ingresar(20);
        assertTrue(g1.comprobarDinero()==120);
        g1.retirar(10);
        assertTrue(g1.comprobarDinero()==110);
        g1.consultar();
        assertTrue(c1.getDireccion().equals("mostoles"));
        assertTrue(c1.getEdad()==19);
        }   
}

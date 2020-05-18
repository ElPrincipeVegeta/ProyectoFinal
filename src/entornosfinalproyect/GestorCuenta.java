package entornosfinalproyect;

import java.util.Scanner;

/**
 *
 * @author Jaime Martín Soto
 * @version 1.0.14
 * 
 * La clase GestorCuenta sirve para manejar una cuenta bancaria, desde esta 
 * podremos ingresar o retirar el dinero además de modificar y consultar los datos
 * de la propia cuenta.
 */
public class GestorCuenta {
    
    private CuentaBancaria c1 = new CuentaBancaria();
/**
 * CuentaBancaria
 * constructor que asigna una cuenta para ser utilizada en los métodos posteriormente
 * @param cuenta 
 * Cuenta que asignaremos de manera externa
 */
    public GestorCuenta(CuentaBancaria cuenta) {
        c1 = cuenta;
    }
    /**
     * ingresar
     * Método para añadir dinero a una cuenta
     * @param cant 
     * Parámetro con el cual indicaremos la cantidad a ingresar
     */
   public void ingresar(float cant){
       cant=cant+c1.getSaldo();
       c1.setSaldo(cant);
   }
   /**
    * retirar
    * Método para desembolsar el dinero de la cuenta que además comprueba si se dispone del mismo
    * @param cant 
    * Canttidad a desembolsar
    */
   public void retirar(float cant){
       if(comprobarDinero()<0)
           System.out.println("NO HAY SUFICIENTE DINERO");
       else
       cant=c1.getSaldo()-cant;
       c1.setSaldo(cant);
   }
   /**
    * consultar
    * Método que no sofrecerá la información detallada de la cuenta
    */
   public void consultar(){
       System.out.println("MOSTRANDO INFORMACION");
       System.out.println(c1.mostrarInfo());
   }
   /**
    * modificar
    * Método que permite elegir entre modificar los datos personales o los bancarios
    */
   public void modificar(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Modificar.. (1) datos personales (2) datos de la cuenta");
        int caso = sc.nextInt();
       switch (caso) {
           case 1 :
               System.out.print("Introduce un nuevo nombre: ");
               c1.setNombre(sc.next());
               System.out.print("Introduce nuevos apellidos: ");
               c1.setApellidos(sc.next());
               System.out.print("Introduce una nueva edad: ");
               c1.setEdad(sc.nextInt());
               System.out.print("Introduce una nueva dirección: ");
               c1.setDireccion(sc.next());
               System.out.print("Introduce un nuevo NIF: ");
               c1.setNIF(sc.next());
               System.out.print("Introduce un nuevo teléfono: ");
               c1.setTelf(sc.nextInt());
               break;
           case 2 :
               System.out.print("Introduce un nuevo saldo: ");
               c1.setSaldo(sc.nextFloat());
               System.out.print("Introduce un nuevo numero de tarjeta: ");
               c1.setNumeroTarjeta(sc.nextInt());
               System.out.print("Introduce un nuevo limite de gasto por internet: ");
               c1.setLimiteInternet(sc.nextFloat());
               break;
           default:
               System.out.println("Error");
               break;
       }
   }
   /**
    * comprobarDinero
    * Método que nos devuelve la cantidad de saldo de la cuenta
    * @return devuelve el saldo de la cuenta
    * 
    */
   public float comprobarDinero(){
       return c1.getSaldo();
   }
}
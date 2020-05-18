package entornosfinalproyect;

import java.util.Scanner;

/**
 *
 * @author Jaime Martín Soto
 */
public class GestorCuenta {
    
    private CuentaBancaria c1 = new CuentaBancaria();

    public GestorCuenta(CuentaBancaria cuenta) {
        c1 = cuenta;
    }
    
   public void ingresar(float cant){
       cant=cant+c1.getSaldo();
       c1.setSaldo(cant);
   }
   
   public void retirar(float cant){
       if(comprobarDinero()<0)
           System.out.println("NO HAY SUFICIENTE DINERO");
       else
       cant=c1.getSaldo()-cant;
       c1.setSaldo(cant);
   }
   public void consultar(){
       System.out.println("MOSTRANDO INFORMACION");
       System.out.println(c1.mostrarInfo());
   }
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
   public float comprobarDinero(){
       return c1.getSaldo();
   }
}
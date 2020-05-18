package entornosfinalproyect;
/**
 *
 * @author Jaime Martín Soto
 */
public class CuentaBancaria {
    private float saldo;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String NIF;
    private int telf;
    private int edad;
    private float limiteInternet;
    private int cantidadPagosTarjeta;
    private int numeroTarjeta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(float saldo, String nombre, String apellidos, 
            String direccion, String NIF, int telf, int edad, 
            float limiteInternet, int cantidadPagosTarjeta, int numeroTarjeta) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.NIF = NIF;
        this.telf = telf;
        this.edad = edad;
        this.limiteInternet = limiteInternet;
        this.cantidadPagosTarjeta = cantidadPagosTarjeta;
        this.numeroTarjeta = numeroTarjeta;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNIF() {
        return NIF;
    }
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getTelf() {
        return telf;
    }
    public void setTelf(int telf) {
        this.telf = telf;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getLimiteInternet() {
        return limiteInternet;
    }
    public void setLimiteInternet(float limiteInternet) {
        this.limiteInternet = limiteInternet;
    }

    public int getCantidadPagosTarjeta() {
        return cantidadPagosTarjeta;
    }
    public void setCantidadPagosTarjeta(int cantidadPagosTarjeta) {
        this.cantidadPagosTarjeta = cantidadPagosTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    /*
    public float saldoMedio(){
        float saldoMedio=(saldo_enero+saldo_febrero+...+saldo_diciembre)/12;
        return saldoMedio;
    }*/
    
    public String mostrarInfo() {
        return "CuentaBancaria{" + "saldo=" + saldo + ", nombre=" + nombre + 
                ", apellidos=" + apellidos + ", direccion=" + direccion + 
                ", NIF=" + NIF + ", telf=" + telf + ", edad=" + edad + 
                ", limiteInternet=" + limiteInternet + 
                ", cantidadPagosTarjeta=" + cantidadPagosTarjeta + 
                ", numeroTarjeta=" + numeroTarjeta + '}';
    }
    
    
    
    
}

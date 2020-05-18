package entornosfinalproyect;
/**
 *
 * @author Jaime Martín Soto
 * @version 1.0.14
 * 
 * En esta clase se almacenan todos los datos referentes a una cuenta bancaria
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
    /**
     * CuentaBancaria
     * Constructor vacio
     */
    public CuentaBancaria() {
    }
    /**
     * Constructor de todos los datos necesarios para la cuenta 
     * @param saldo 
     * @param nombre
     * @param apellidos
     * @param direccion
     * @param NIF
     * @param telf
     * @param edad
     * @param limiteInternet
     * @param cantidadPagosTarjeta
     * @param numeroTarjeta 
     */
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
    /**
     * 
     * @return devueve el saldo de la cuenta
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * setSaldo método para establecer un nuevo saldo
     * @param saldo parámetro para dar un saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    /**
     * 
     * @return devuelve el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * setNombre método para establecer un nuevo nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return devuelve los apellidos del titular de la cuenta
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * setApellidos sirve para establecer otro apellido
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return devuelve la direccion del titular de la cuenta
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * setDireccion metodo que establece una nueva direccion del titular de la cuenta
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * 
     * @return devuelve el NIF del titular de a cuenta
     */
    public String getNIF() {
        return NIF;
    }
    /**
     * setNIF sirve para establecer un nuevo NIF de la cuenta
     * @param NIF 
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    /**
     * 
     * @return devuelve el telefono del titular
     */
    public int getTelf() {
        return telf;
    }
    /**
     * setTelf establece un nuevo telefono del titular de la cuenta
     * @param telf 
     */
    public void setTelf(int telf) {
        this.telf = telf;
    }
    /**
     * 
     * @return devuelve la edad de titular de la cuenta
     */
    public int getEdad() {
        return edad;
    }
    /**
     * setEdad se utiliza para establecer la edad del titular de la cuenta
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return devuelve el credito limite para gastar en internet
     */
    public float getLimiteInternet() {
        return limiteInternet;
    }
    /**
     * setLimiteInternet se utiliza para establecer un limite de gastos por internet
     * @param limiteInternet 
     */
    public void setLimiteInternet(float limiteInternet) {
        this.limiteInternet = limiteInternet;
    }
    /**
     * 
     * @return devuelve la cantidad de pagos hechos por tarjeta
     */
    public int getCantidadPagosTarjeta() {
        return cantidadPagosTarjeta;
    }
    /**
     * setCantidadPagosTarjeta sirve para establecer la cantidad de pagos hechos por tarjeta
     * @param cantidadPagosTarjeta 
     */
    public void setCantidadPagosTarjeta(int cantidadPagosTarjeta) {
        this.cantidadPagosTarjeta = cantidadPagosTarjeta;
    }
    /**
     * 
     * @return devuelve el numero de tarjeta del cliente
     */
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }
    /**
     * setNumeroTarjeta se utiliza para establecer un numero de tarjeta nuevo
     * @param numeroTarjeta 
     */
    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    /*
    public float saldoMedio(){
        float saldoMedio=(saldo_enero+saldo_febrero+...+saldo_diciembre)/12;
        return saldoMedio;
    }*/
    
    /**
     * 
     * @return devuelve un string que contiene toda la informacion referente al titular de la cuenta y sus datos
     */
    public String mostrarInfo() {
        return "CuentaBancaria{" + "saldo=" + saldo + ", nombre=" + nombre + 
                ", apellidos=" + apellidos + ", direccion=" + direccion + 
                ", NIF=" + NIF + ", telf=" + telf + ", edad=" + edad + 
                ", limiteInternet=" + limiteInternet + 
                ", cantidadPagosTarjeta=" + cantidadPagosTarjeta + 
                ", numeroTarjeta=" + numeroTarjeta + '}';
    }
}

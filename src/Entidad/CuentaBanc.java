/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.*/
package Entidad;

//import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author HectorJ
 */
public class CuentaBanc {
    private int numeroCuenta;
    private double dniCliente;
    private double saldoActual;
    //private Date fecha;

    public CuentaBanc() {
    }
    public CuentaBanc(int numeroCuenta, double dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        //this.fecha = fecha;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(double dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBanc{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
    }
 }

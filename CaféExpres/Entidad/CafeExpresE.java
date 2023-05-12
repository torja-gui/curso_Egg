/*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que
hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase */
package Entidad;

/**
 *
 * @author HectorJ
 */
public class CafeExpresE {
    private double capacidadMaxima;
    private double cantidadActual;

    public CafeExpresE() {
    }

    public CafeExpresE(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
         
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "CafeExpresE{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}

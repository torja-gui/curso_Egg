/*CafeteraServicio en el paquete Servicios con los siguiente:
    *Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    *Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño
    de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad 
    actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    *Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    *Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe
y se añade a la cafetera la cantidad de café indicada..*/
package Servicio;

import Entidad.CafeExpresE;
import java.util.Scanner;

/* @author HectorJ*/
public class CafeExpresS {

    private Scanner dato = new Scanner(System.in).useDelimiter("\n");
    private double uservis;
    public CafeExpresE llenarCafetera() {
        CafeExpresE cnt = new CafeExpresE();//Instan...
        double llenado = (80 * 50);
        cnt.setCapacidadMaxima(llenado);
        cnt.setCantidadActual(llenado);
        System.out.println(cnt.getCantidadActual() + "\n" + cnt.getCapacidadMaxima() + "\n\n ###########################\n");
        return cnt;
    }

    public double llenarTaza(CafeExpresE cnt) {/*Cexpres60-80ml; clargo--100 a 200ml;  CLatte--240 a 300ml*/
        
        double cantidad, cntactl;
        System.out.println("Cantidad maxima 80ml \n--->>>indique la cantidad a servir");
        do {
            cantidad = dato.nextInt();
            if (cnt.getCantidadActual() < cantidad && cnt.getCantidadActual() > 20) {
                System.out.println("La maquina no contiene esa cantidad ");
                System.out.println("La maquina contiene: " + cnt.getCantidadActual() + "ml \n");
            } else if (cnt.getCantidadActual()< 20) {
                System.out.println("La maquina esta en espera de recarga");
                break;
            }
            if (cantidad <= 0) {
                System.out.println("No ha indicado la cantida!!! \n *ingrese la cantidad en ml");
            } else if (cantidad > 80) {
                System.out.println("Has superado la capacidad por taza \n**tazas tipo expres (80ml) \n *ingrese la cantidad en ml");
            }
        } while (cantidad <= 0 && cantidad > 80);
        
        
        cntactl = cnt.getCantidadActual() - cantidad;
        cnt.setCantidadActual(cntactl);
        if (cantidad == 80) {
            System.out.println("Taza llena");
        } else if (cnt.getCantidadActual() > 20) {
            System.out.println("Contenido " + cantidad + " ml");
        }
        uservis=cantidad;

        return cnt.getCantidadActual();
             

    }
    public void DatosCafetera(CafeExpresE cnt) {
        
        System.out.println("\nDatos de la maquina\n");
        System.out.println("Cantidaad que contiene la maquina"+cnt.getCantidadActual());
        System.out.println("Capacidad maxima de la maquina"+cnt.getCapacidadMaxima());
        System.out.println("Cantida de la ultima taza |-->>"+uservis);
    }

    public double VaciarCafetera(CafeExpresE cnt) {
         System.out.println("\nVaciar Cafetera \n");
        cnt.setCantidadActual(0);
        System.out.println("La Maquina contiene :" + cnt.getCantidadActual() + " ml");
        return cnt.getCantidadActual();
    }

    public double recargaCafe(CafeExpresE cnt) {
        System.out.println("\nReponer cafe \n");
        System.out.println("coloque la cantidad de cafe que va a ingresar a la maquina \n Cantidad maxima a ingresar es 4000 ml");
        double llenado= cnt.getCantidadActual()+ dato.nextDouble();
        if (llenado>4000) {
            System.out.println("ha superado la capacidad maxima!!!"); 
        }else{
            cnt.setCantidadActual(llenado);}
        return cnt.getCantidadActual();
    }

}

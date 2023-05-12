        /*Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
        Método para crear cuenta pidiéndole los datos al usuario.
        Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
        Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
        Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
        Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
        Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
        Método consultarDatos: permitirá mostrar todos los datos de la cuenta.. */

package Servicio;

import Entidad.CuentaBanc;
import java.util.Scanner;
import javax.swing.JOptionPane;
/** @author HectorJ*/
public class CuentaBancServicio {   //nombre de la class.java
private Scanner dato=new Scanner(System.in) . useDelimiter ("\n");
    
     public  CuentaBanc cliente(){
//nombre del metodo
         CuentaBanc cbc=new CuentaBanc();/**<cbc es el identificados del objeto creado>*/
        
         int numCuent=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el N° de Cueta"));
         cbc.setNumeroCuenta(numCuent);
         double dni=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de DNI"));
         cbc.setDniCliente(dni);
         double saldoActual=500000;//Double.parseDouble(JOptionPane.showInputDialog/*System.out.println*/("Ingrese el número de cuenta del cliente"));
         cbc.setSaldoActual(saldoActual);
         
         
         return cbc;
        }
     
     
     public double ingresarDinero(CuentaBanc cbc){
         double montoIngresado=Double.parseDouble(JOptionPane.showInputDialog("Monto a Ingresar "));//Ingreso de dato
         double actualSaldo= montoIngresado+cbc.getSaldoActual();//Operacion
         cbc.setSaldoActual(actualSaldo);//Cambio de valor al parametro en cuestion
         JOptionPane.showMessageDialog(null,"Ha ingresado "+montoIngresado+"\nSaldo actualisado: "+actualSaldo);//Visualisacion de datos
         System.out.println("Ha ingresado "+montoIngresado+"\nSaldo actualisado: " + cbc.getSaldoActual());//registro
         return actualSaldo;//retorno del metodo ingreesasrDinero del objeto cbc CuentaBanc
     }
     
     public double retirarDinero(CuentaBanc cbc){
         double montoARetirar=Double.parseDouble(JOptionPane.showInputDialog("Itrodusca: Monto a retirar"));
         double actualSaldo=0.0;          
          if (cbc.getSaldoActual()-montoARetirar<0) {
              do{
                  System.out.println("Retiro negado "+montoARetirar+" \n Retiro por default: "+ cbc.getSaldoActual());
              montoARetirar=Double.parseDouble(JOptionPane.showInputDialog(" El monto a retirar es mayor al saldo disponible "
                                  + "\n Monto maximo a retirar: "+cbc.getSaldoActual()+" \nnuevo monto a retirar:"));              
              }while(cbc.getSaldoActual()-montoARetirar<0);              
             JOptionPane.showMessageDialog(null," Monto retirado: "+montoARetirar+"\n Saldo actual  "+//->>
                                 (cbc.getSaldoActual()-montoARetirar));
              System.out.println("Retiro: "+montoARetirar+"\nSaldo: "+(cbc.getSaldoActual()-montoARetirar));
          }//}else  if (cbc.getSaldoActual()-montoARetirar>0) {
           actualSaldo= cbc.getSaldoActual()-montoARetirar; 
                     cbc.setSaldoActual(actualSaldo);
         JOptionPane.showMessageDialog(null,"<html><p style= \" color:black; font:24px \">Monto a retirar: " +montoARetirar+ "</p></html>");
         System.out.println("Retiro: "+montoARetirar+"\nSaldo:  " + cbc.getSaldoActual());
    
         return actualSaldo;
   }
     
     public double extraccionRapida(CuentaBanc cbc){
         double montoRetiroR=Double.parseDouble(JOptionPane.showInputDialog("Itrodusca el monto  a retirar"));
          double actualSaldo=0.0;
          
          if (montoRetiroR>cbc.getSaldoActual()*0.2) {
              do{
                  System.out.println("Retiro failed "+ montoRetiroR);
              JOptionPane.showMessageDialog(null,"<html><p style= \" color : red; font:18px \">Has superado lo disponible"+"\n"+"<html><p style= \" color:gray; font:18px \"> Monto maximo a retirar "+(cbc.getSaldoActual()*0.2)+ "</p></html>");
              montoRetiroR=Double.parseDouble(JOptionPane.showInputDialog("Monto a retirar: "));
              }while(montoRetiroR>cbc.getSaldoActual()*0.2);
          }
          actualSaldo=cbc.getSaldoActual()-montoRetiroR;
              cbc.setSaldoActual(actualSaldo);
           JOptionPane.showMessageDialog(null,"Extraccion exitosa: "+montoRetiroR+"\n Saldo: "+cbc.getSaldoActual());
              System.out.println("Extraccion exitosa: "+montoRetiroR+"\nSaldo:"+cbc.getSaldoActual());
         
     return actualSaldo;
     }
     public void consultarSaldo(CuentaBanc cbc){
     JOptionPane.showMessageDialog(null, "Saldo: "+cbc.getSaldoActual());
         System.out.println("Saldo: "+cbc.getSaldoActual());
     }
     public void consultarDatos(CuentaBanc cbc){
     JOptionPane.showMessageDialog(null, "DNI: "+cbc.getDniCliente());
         System.out.println("DNI: "+ cbc.getDniCliente());
     JOptionPane.showMessageDialog(null, "N° de cuenta: "+cbc.getNumeroCuenta());
         System.out.println("N° de cuenta: "+cbc.getNumeroCuenta());
     JOptionPane.showMessageDialog(null, "Saldo: "+cbc.getSaldoActual());
         System.out.println("Saldo: "+cbc.getSaldoActual());
     }
     
}
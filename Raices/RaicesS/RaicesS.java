/*
Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única
solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, 
imprime las 2 posibles soluciones.
 */
package RaicesS;

import RaicesE.RaicesE;
import java.util.Scanner;

/**
 *
 * @author HectorJ
 */
public class RaicesS {
     Scanner leer=new Scanner(System.in).useDelimiter("\n");
     
     public RaicesE Valor(){
         System.out.println("a");
         int a=leer.nextInt();
         System.out.println("b");
         int b=leer.nextInt();
         System.out.println("c");
         int c=leer.nextInt();
         return new RaicesE(a,b,c);
     }
    public double getDiscriminante(RaicesE va){
    return (Math.pow(va.getB(),2)-(4*va.getA()*va.getC()));
    }
     public boolean tieneRaices(RaicesE va){
         return (getDiscriminante(va))>=0;  
     }
     public boolean tieneRaiz(RaicesE va){
         return (getDiscriminante(va))==0;  
         }
     public void obtenerRaices(RaicesE va){
         if (tieneRaices(va)){
          System.out.println((-va.getB()+Math.sqrt((Math.pow(va.getB(), 2)-(4 * va.getA() *va.getC()))))/(2*va.getA()));
          System.out.println((-va.getB()-Math.sqrt((Math.pow(va.getB(), 2)-(4 * va.getA() *va.getC()))))/(2*va.getA()));
         }
     }
/**Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
 Es en el caso en que se tenga una única solución posible.*/ 
     public void obtenerRaiZ(RaicesE va){
         if (tieneRaiz(va)){
          System.out.println((-va.getB()+Math.sqrt((Math.pow(va.getB(), 2)-(4 * va.getA() *va.getC()))))/(2*va.getA()));
         }
      }
/***Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
      * por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
      * obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
      * de no existir solución, se mostrará un mensaje.*/
     
     public void calcular(RaicesE va){
         if (tieneRaices(va)) {
             obtenerRaices(va); 
           
         }else if(tieneRaiz(va)){
             obtenerRaiZ(va);
         }else{
             System.out.println("Sin solución");
         }
     
     }
   }

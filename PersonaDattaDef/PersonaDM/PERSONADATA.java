/*Método calcularIMC(): calculara si la persona 
está en su peso ideal (peso en kg/(altura^2 en 
mt2)). Si esta fórmula da por resultado un valor 
menor que 20, significa que la persona está por 
debajo de su peso ideal y la función devuelve un 
-1. Si la fórmula da por resultado un número 
entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función 
devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelveun 1.
 */
package PersonaDM;

import PersonaDE.PersonaDataE;
import PersonaDS.PersonaDataS;

/** @author HectorJ*/
public class PERSONADATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Acceso al servicio PersonDataS
        PersonaDataS prsn=new PersonaDataS();
        
        //Lo que devuelba la funcion prsn.crearPersona() se guarda en la variable p1
        PersonaDataE p1=prsn.crerPersona();
        PersonaDataE p2=prsn.crerPersona();
        PersonaDataE p3=prsn.crerPersona();
        PersonaDataE p4=prsn.crerPersona();
        //Ingresarle variables al arreglo por cordenadas absolutas
        int[] IMC=new int[4]; 
        IMC[0]= prsn.calcularIMC(p1);
        IMC[1]= prsn.calcularIMC(p2);
       IMC[2]= prsn.calcularIMC(p3);
        IMC[3]= prsn.calcularIMC(p4);
        //Ingresale variables a un arreglo por orden ascendente
        boolean MYedad[]={prsn.MayorEdad(p1),prsn.MayorEdad(p2),prsn.MayorEdad(p3),prsn.MayorEdad(p4)};
        //Asignacion de tipo de datos a variable del mismo tipo
        int ideal=0, bajo=0, sobre=0, mayor=0, menor=0;
        //Bucle para verificar el valor de los elementos del arreglo
        for (int i = 0; i < 4; i++) {
            if (MYedad[i]==true) {
                mayor++;
            }else{
            menor++;
            }
        }
        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                default:
                    sobre++;
                    break;
            }
        }            
        System.out.println("EDADES\n");
        System.out.println("Las personas Mayores son:"+ ((mayor*100)/4)+ "%");
        System.out.println("Las personas Menores son:"+ ((menor*100)/4)+ "%");
        System.out.println("PESO \n");
        System.out.println("Las personas con bajo peso son:"+ ((bajo*100)/4)+"%");
        System.out.println("Las personas con peso ideal son:"+ ((ideal*100)/4)+"%");
        System.out.println("Las personas con sobre peso son:"+ ((sobre*100)/4)+"%");
    }
    
}

/*En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
        *Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
        *Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para
 llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
*Método calcularIMC(): calculara si la persona 
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
package PersonaDS;

import PersonaDE.PersonaDataEU;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author HectorJ
 */
public class PersonaDataS1 {

    private Scanner dato = new Scanner(System.in).useDelimiter("\n");
/**public PersonaDataEU persona(){
//        PersonaDataEU prs=new PersonaDataEU();
//        System.out.println("Nombre...");
//        prs.setNombre(dato.nextLine());
//        System.out.println("edad...");
//        prs.setEdad(dato.nextInt());
//        prs.setSexo(JOptionPane.showInputDialog("Sexo..").charAt(0));
//        System.out.println("Sexo...");
//        boolean cond=false;
//         do{
//        char sexo = dato.next().charAt(0);
//                    cond=false;
//            if (sexo=='H'||sexo=='M'||sexo=='O') {
//              cond=true;
//            }
//            System.out.println("SEXO NO EXISTENTE");
//        }while (cond);
//        prs.setSexo(dato.next().charAt(0));
//        System.out.println("sexo= "+prs.getSexo());
//        System.out.println("Altura...");
//        prs.setAltura(dato.nextDouble());
//        System.out.println("Altura= "+prs.getAltura());
//        return prs;
//}Retorno de valores por referencia
    String nombre[]={"Marta","Beto","Carmelo","Maria"};nombre[i];*/
   public PersonaDataEU crerPersona() {
        //JOptionPane.showInputDialog("Inicie introduciendo los datosd")
        System.out.println("Nombre:");//mensaje
        String nombre = dato.next();//igualar 
        System.out.println("Edad:");//mensaje
        //int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        int edad = dato.nextInt();//igualar
        System.out.println("Sexo:");
        char sexo;
        boolean cond = false; //creacion de variables
        do {//Inicio bucle 
            sexo = dato.next().charAt(0);//igualar tipo caracter
            if (sexo == 'H' || sexo == 'M' || sexo == 'O') { //Condiciones
                cond = true;break;//Igualacion de variable
            }else{
            System.out.println("Respuesta no valida\n Sexo:");}//Mensaje 
        } while (cond); //Fin bucle si la variable es verdadera "True"
        System.out.println("Peso:");//Mensaje 
        double peso = dato.nextInt();//Igualdad
        System.out.println("Altura:");//Mensaje 
        double altura = dato.nextDouble();//Igualdad
        return new PersonaDataEU(nombre, edad, sexo, peso, altura);
        /*Retorno de valores por parametros*/
    }
    public boolean MayorEdad(PersonaDataEU prs) {
        boolean mayor = true;
        if (prs.getEdad() < 18) {
            mayor = false;
        }
        return mayor;
    }
  public int calcularIMC(PersonaDataEU prs){
      double IMC = prs.getPeso()/(Math.pow(prs.getAltura(),2));
      if (IMC<20) {
          return-1;
      }else if (IMC>19&&IMC<26){
       return 0;
      }else{
  return 1;
  }

 }
  
}
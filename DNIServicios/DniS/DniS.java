/*Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI 
calcula la letra que le corresponderá. Una vez calculado, le asigna la 
letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, 
un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método
que funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir
el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe 
buscar en un array (vector) de caracteres la posición que corresponda al resto de la 
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:*/
package DniS;
import DNIE.DniE;
import java.util.Scanner;
/**
 * Class-Servis~Class-Servis /** @author HectorJClass-ServisClass-Servis
 */
public class DniS {
    private Scanner dato=new Scanner(System.in).useDelimiter("\n");
    /*Meto~Metodo~Meto~Metodo~Meto~Metodo~Meto~Metodo~Meto~Metodo~*/
         public DniE Valor(){/*Crea un metodo para el sevicio Metodo
                            que da valores a el/los parametros del servicio*/
    
            /* DniE bc=new DniE();/*Crea un objeto que refiere a la clase Entidades
                                  Objeto por el cual podemos acceder a los 
                                  parametros por medio del set o get*/
         System.out.println("DNI");//Mensaje
         //bc.setDNI(dato.nextInt());/*Se invoca el parametro  de la calse Entidad (private)*/
                                     /*por medio del objeto que refiere a la clase entidades
                                     con el metodo set le enviamos un valor el cual sustituye 
                                     cualquier otro valor que tenga*/
         
         int deeni=dato.nextInt(); /*Se guarda el valor en una variable para luego enviarle 
                                     al parametro del molde en la entidad como variable*/
    String vocales="TRWAGMYFPDXBJZSQVHLCKE";
    int nif=(deeni%23);/*Calculo por medio de uina variable*/
    //int nif=(bc.getDNI()%23);/*Calculo por medio del parametro del objeto*/
    String car=vocales.substring(nif,nif+1);/*Variable de retorno*/
    //bc.setLetra(vocales.substring(nif,nif+1));/*Retorno sin variable*/
         /*return bc;/*Retonar objeto*/ 
         return new DniE(deeni,car); /*Retorno por variables*/
     }
    
     public void DNINIF(DniE v){        
         System.out.println(v.getDNI()+"-"+v.getLetra());
        }
     
     public String DNIsNIF(DniE v){
    String vocales="TRWAGMYFPDXBJZSQVHLCKE";
    int nif=(v.getDNI()%23);
    v.setLetra(vocales.substring(nif,nif+1));
         return v.getLetra();
        }
}


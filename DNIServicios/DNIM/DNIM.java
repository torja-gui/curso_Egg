package DNIM;

import DNIE.DniE;
import DniS.DniS;

/**
 *
 * @author HectorJ
 */
public class DNIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DniS d=new DniS();/*conectar al Servis*/
       DniE p= d.Valor();/*Lo que contenga el metodo Valor se guarde en (p)
                           Esta linea Hace que el metodo Valor de la clase 
                           Serv se ejecute una ves*/
        DniE q= d.Valor();

       System.out.println("Contenido del metodo Valor:"+d.DNIsNIF(p));
       System.out.println("Contenido del metodo Valor:"+d.DNIsNIF(q));
        //System.out.println(p.toString());
        System.out.println(q.getDNI()+"-"+q.getLetra());
        System.out.println(p.getDNI()+"-"+p.getLetra());
    }
}

/* */
package CuentaBancMain;

import Entidad.CuentaBanc;
import Servicio.CuentaBancServicio;
import javax.swing.JOptionPane;

/**
 *
 * @author HectorJ
 */
public class CUENTABANC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaBancServicio/*Class Ser*/ cbnc = new CuentaBancServicio()/*Class Ser*/;
       CuentaBanc cue = cbnc.cliente();
       
       int op=0; 
       String[] array={"Ingrsar","Extraxion","Extraxion_Rapida","Consultar_Saldo","Datos_Usuario"};
       op=JOptionPane.showOptionDialog(null, "Seleccione la operacion a realizar", "Titulo", 0, JOptionPane.QUESTION_MESSAGE, null, array, "Datos_Usuario");
       switch (op+1){
        case 1:
       cbnc.ingresarDinero(cue);break;
        case 2:
       cbnc.retirarDinero(cue);break;
        case 3:
       cbnc.extraccionRapida(cue);break;
        case 4:
       cbnc.consultarSaldo(cue);break;
        case 5:
       cbnc.consultarDatos(cue);break;
       default:
       JOptionPane.showMessageDialog(null,"Has salido de la cuenta\n Para realizar otra operacion vuelva a ingresar ");
    }
    }
}

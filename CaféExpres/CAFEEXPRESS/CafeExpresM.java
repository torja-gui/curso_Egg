/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAFEEXPRESS;

import Entidad.CafeExpresE;
import Servicio.CafeExpresS;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HectorJ
 */
public class CafeExpresM {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);                                                                                      
        CafeExpresS taza = new CafeExpresS();
        CafeExpresE tz = taza.llenarCafetera();
        
        boolean v = true;
        do {
        int op = 0;
        
        String[] array = {"Coffe", "Data", "replenish", "Empty", "SALIR"};
        op = JOptionPane.showOptionDialog(null, "<html><p style= \" color:black; font:24px \">Seleccione la operacion a realizar</p></html>\"", "ESPRESSO COFFE", 0, JOptionPane.QUESTION_MESSAGE, null, array, "Coffe");

            switch (op + 1) {
                case 1:
                    taza.llenarTaza(tz);

                    break;
                case 2:
                    taza.DatosCafetera(tz);

                    break;
                case 3:
                    taza.recargaCafe(tz);

                    break;
                case 4:
                    taza.VaciarCafetera(tz);

                    break;
                case 5:
                        v = false;
                    }
                    
                    } while (v);
            }
}


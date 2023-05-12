/* Vamos a realizar una clase llamada Raices, donde representaremos
los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes 
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores 
para construir el objeto a través de un método constructor. Luego, en 
RaicesServicio las operaciones que se podrán realizar son las siguientes: */
package RaicesE;

/**
 *
 * @author HectorJ
 */
public class RaicesE {
    private double a;
    private double b;
    private double c;

    public RaicesE() {
    }

    public RaicesE(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "RaicesE{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}

/*Dígito Verificador. Crear una clase NIF que se usará para mantener 
DNIs con su correspondiente letra (NIF). Los atributos serán el número
de DNI (entero largo) y la letra (String o char) que le corresponde.
En NIFService se dispondrá de los siguientes métodos:*/

package DNIE;

/*** @author HectorJ*/

public class DniE {
    private int DNI;
    private String letra;

    public DniE() {
    }

    public DniE(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "dniE{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
}

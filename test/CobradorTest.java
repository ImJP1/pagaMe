
import pagame.domain.Deudor;
import pagame.domain.Cobrador;


public class CobradorTest {
    public static void main(String[] args) {
        Cobrador cobrador = new Cobrador(1, "Juan JJ");   
        
        Deudor deudor1 = new Deudor(1, "Juan Perez", "Calle falsa 112", -4000.1f);
        Deudor deudor2 = new Deudor(1, "Maria Lopez", "Calle falsa 3");
           
        cobrador.addDeudor(deudor1);
        cobrador.addDeudor(deudor2);
    }
    
    public static void printDeudor(Deudor deudor) {
        System.out.println("       Deudor id: " + deudor.getId());
        System.out.println("   Deudor nombre: " + deudor.getNombre());
        System.out.println("Deudor direccion: " + deudor.getDireccion());
        System.out.println(" Deudor cantidad: " + deudor.getSaldo());
    }
}

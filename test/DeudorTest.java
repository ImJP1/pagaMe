import pagame.domain.Deudor;

public class DeudorTest {
    public static void main(String[] args) {
           Deudor deudor1 = new Deudor(1, "Juan Perez", "Calle falsa 112", -4000.1f);
           Deudor deudor2 = new Deudor(1, "Maria Lopez", "Calle falsa 3");
           
          printDeudor(deudor1);
          printDeudor(deudor2);     
    }
    
    public static void printDeudor(Deudor deudor) {
        System.out.println("       Deudor id: " + deudor.getId());
        System.out.println("   Deudor nombre: " + deudor.getNombre());
        System.out.println("Deudor direccion: " + deudor.getDireccion());
        System.out.println(" Deudor cantidad: " + deudor.getSaldo());
    }
}

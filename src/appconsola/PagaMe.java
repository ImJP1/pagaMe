package appconsola;

import pagame.domain.*;
import java.util.Scanner;



public class PagaMe {
    // Datos
    Deudor deudor[] = new Deudor[100];
    int numDeudor = 0;
    
    public static void main(String [] args) {
        PagaMe pagame = new PagaMe();
     
        int opcion;
        while ( (opcion = pagame.menuPrincipal()) != 0) {
            switch (opcion) {
                case 1: pagame.crearDeudor();break;
                case 2: pagame.mostrarDeudores();break;
                case 0: pagame.salir(); return;
            }
        }
    }
    
    public PagaMe() {
        init();
    }
    public int menuPrincipal() {
        System.out.println("---------PagaMe-----------");
        
        System.out.println("1. Crear deudor.");
        System.out.println("2. Ver deudores. ");
        System.out.println("0. Salir");
        
        System.out.println();
        System.out.print("Introducir opcion: ");
        
        // leer opcion
        Scanner sc = new Scanner(System.in);
        
        // entrada de una cadena
        String opcion = sc.nextLine();
        
        //System.out.println("Tu opcion es:" + opcion);
        
        return Integer.parseInt(opcion);
    }
    
    public void crearDeudor() {
        System.out.println("-------PagaMe: Crear Deudor----------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Introduzca dirección: ");
        String direccion = sc.nextLine();
        
        System.out.print("Introduzca saldo: ");
        float saldo = Float.parseFloat(sc.nextLine());
        
        // numDeudor es su id
        deudor[numDeudor] = new Deudor(numDeudor, nombre, direccion, saldo);
        numDeudor++;
        
        System.out.println("Deudor agregado.....<presione enter>");
        sc.nextLine();
    }
    
    public void mostrarDeudores() {
        System.out.println("-------PagaMe: Mostrar Deudores----------");
        for (int i = 0; i < numDeudor; i++) {
            System.out.println("       Deudor id: " + deudor[i].getId());
            System.out.println("   Deudor nombre: " + deudor[i].getNombre());
            System.out.println("Deudor direccion: " + deudor[i].getDireccion());
            System.out.println(" Deudor cantidad: " + deudor[i].getSaldo());
            System.out.println();
        }
    }
    public void init() {
        deudor[numDeudor] = new Deudor(1, "Juan Perez", "Calle falsa 112", -4000.1f);
        numDeudor++;
        deudor[numDeudor++] = new Deudor(1, "Maria Lopez", "Calle falsa 3");
    }
    
    public void salir() {
        System.out.println("Bye. Gracias.");
    }
}

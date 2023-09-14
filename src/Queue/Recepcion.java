package Queue;

import java.util.Scanner;
public class Recepcion {
    private static int cantidad;
    
    public static void main(String[] args){
        Scanner tc=new Scanner(System.in);
        int size;
        
    System.out.println("Cuantos clientes va a registrar? ");
    size=tc.nextInt();
    
    Cola<Cliente> cola=new Cola<>(size);
    
    for(int i=0;i<size;i++){
        System.out.println("Nombre del cliente: ");
        String name=tc.next();
        System.out.println("Cantidad de productos a comprar: ");
        int cantidadProd=tc.nextInt();
        cola.add(new Cliente(name,cantidadProd));
    }
    
    
    Cliente pk=cola.remove();
    System.out.println("Cliente proximo a pasar: "+pk.toString());
    
    pk=cola.remove();
    System.out.println("Cliente proximo a pasar: "+pk.toString());
    
    
    
    System.out.println("Cantidad de ordenes a procesar: "+Recepcion.getCantidadOrdenes(cola, size));
    
    } 
    
    //le llega una cola, saca todo, luego lo vuelve a meter para contar la cantidad
    public static int getCantidadOrdenes(Cola<Cliente> cola, int size) {
    int count = 0;
    Cola<Cliente> tempCola = new Cola<>(size); 
    
    while (!cola.isEmpty()) {
        tempCola.add(cola.remove()); 
        count++;
    }
    
        //System.out.println("CONTADOR: "+count);
    
    while (!tempCola.isEmpty()) {
        cola.add(tempCola.remove()); 
    }
    
    return count;
}
    
}

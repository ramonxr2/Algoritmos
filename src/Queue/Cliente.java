
package Queue;

public class Cliente{
    String nombre;
    int cantidadProductos;

    public Cliente(String nombre, int cantidadProductos) {
        this.nombre = nombre;
        this.cantidadProductos = cantidadProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcantidadProductos() {
        return cantidadProductos;
    }

    public void setcantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    
    @Override
    public String toString(){
    return "Nombre: "+nombre+" Cantidad de productos: "+cantidadProductos;
    }
    
}

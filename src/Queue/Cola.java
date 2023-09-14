package Queue;
public class Cola<T> {

    private T[] cola;
    private int inicio;
    private int fin;
    private int size;

    public Cola(int size) {
        this.size = size;
        cola = (T[]) new Object[size];
        inicio = -1;
        fin = -1;
    }

    public void add(T dato) {
        if (!isFull()) {
            if (isEmpty()) {
                inicio = 0;
                fin = 0;
            } else {
                fin++;
            }
            cola[fin] = dato;
        } else {
            System.out.println("Desbordamiento");
        }
    }

    public T remove() {
        if (!isEmpty()) {
            T dato = cola[inicio];
            if (inicio == fin) {
                inicio = -1;
                fin = -1;
            } else {
                inicio++;
            }
            return dato;
        } else {
            System.out.println("Subdesbordamiento");
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return cola[inicio];
        } else {
            System.out.println("La cola está vacía");
            return null;
        }
    }

    public int getLength(){
        if (isEmpty()) {
            return 0;
        } else {
            return fin - inicio + 1;
        }    
    }
    
    public boolean isFull() {
        return fin == size - 1;
        }

    public boolean isEmpty() {
        return inicio == -1;
    }
}

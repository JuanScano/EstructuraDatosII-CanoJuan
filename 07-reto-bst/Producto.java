package 07-reto-bst;

public class Producto {
    private int codigo;
    private String nombre;
    private int cantidad;

    public Producto(int codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + " | Nombre: " + nombre + " | Stock: " + cantidad;
    }
}

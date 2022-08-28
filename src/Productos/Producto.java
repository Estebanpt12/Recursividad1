package Productos;

public class Producto{
    private int precio;
    private String nombre;
    private String color;


    public Producto() {
    }


    public Producto(int precio, String nombre, String color) {
        this.precio = precio;
        this.nombre = nombre;
        this.color = color;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRed(){
        return color.equals("Rojo");
    }

}
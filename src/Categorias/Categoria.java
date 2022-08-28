package Categorias;

import java.util.ArrayList;

import Productos.Producto;

public class Categoria {
    private ArrayList<Categoria> listaSubCategorias;
    private ArrayList<Producto> listaProductos;
    private String nombre;

    public Categoria(){
        listaSubCategorias = new ArrayList<>();
        listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCategoria(Categoria categoria){
        listaSubCategorias.add(categoria);
    }

    public void addProducto(Producto producto){
        listaProductos.add(producto);
    }


    public ArrayList<Categoria> getListaSubCategorias() {
        return this.listaSubCategorias;
    }

    public void setListaSubCategorias(ArrayList<Categoria> listaSubCategorias) {
        this.listaSubCategorias = listaSubCategorias;
    }

    public ArrayList<Producto> getListaProductos() {
        return this.listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


}

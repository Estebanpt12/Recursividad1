package Empresa;

import java.util.ArrayList;

import Categorias.Categoria;
import Productos.Producto;

public class Empresa{
    private String nombre;
    private ArrayList<Categoria> listaCategorias;

    public Empresa(){
        listaCategorias = new ArrayList<>();
    }

    public int validarProductosPrecio(){
        return recursivoCategoriaPrecio(listaCategorias, 0);
    }

    private int recursivoCategoriaPrecio(ArrayList<Categoria> categoria, int index){
        int cantidad = 0;
        if(!(categoria.get(index).getListaSubCategorias().isEmpty())){
            cantidad += recursivoCategoriaPrecio(categoria.get(index).getListaSubCategorias(), 0);
        }
        if(index + 1 < categoria.size()){
            cantidad += recursivoCategoriaPrecio(categoria, index + 1);
        }
        return cantidad += recursivoProductoPrecio(categoria.get(index).getListaProductos(), 0);
    }

    private int recursivoProductoPrecio(ArrayList<Producto> producto, int index){
        int cantidad = 0;
        if(producto.get(index).getPrecio() > 10000){
            cantidad++;
        }
        if(index + 1 < producto.size()){
            cantidad += recursivoProductoPrecio(producto, index + 1);
        }
        return cantidad;
    }

    public boolean validarRojo(){
        return recursivoCategoriaRojo(listaCategorias, 0);
    }

    private boolean recursivoProductoRojo(ArrayList<Producto> producto, int index){
        if(producto.get(index).isRed()){
            return true;
        }else{
            if(index + 1 < producto.size()){
                return recursivoProductoRojo(producto, index + 1);
            }
            return false;
        }
    }

    private boolean recursivoCategoriaRojo(ArrayList<Categoria> categoria, int index){
        if(!(categoria.get(index).getListaSubCategorias().isEmpty())){
            if(recursivoCategoriaRojo(categoria.get(index).getListaSubCategorias(), 0)){
                return true;
            }
        }
        if(index + 1 < categoria.size()){
            if(recursivoCategoriaRojo(categoria, index + 1)){
                return true;
            }
        }
        return recursivoProductoRojo(categoria.get(index).getListaProductos(), 0);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return this.listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

}
import java.util.ArrayList;

import Categorias.Categoria;
import Empresa.Empresa;
import Productos.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        Empresa empresa = new Empresa();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Categoria> categorias =  new ArrayList<>();
        Categoria categoria = new Categoria();
        Producto producto = new Producto(20000, "Juguete", "Blanco");
        productos.add(producto);
        Producto producto2 = new Producto(110000, "Juguete", "Amarillo");
        productos.add(producto2);
        Producto producto3 = new Producto(5000, "Juguete", "Rojo");
        productos.add(producto3);
        categoria.setListaProductos(productos);
        ArrayList<Producto> productos2 = new ArrayList<>();
        Categoria categoria2 = new Categoria();
        Producto producto4 = new Producto(2000000, "Carro", "Negro");
        productos2.add(producto4);
        Producto producto5 = new Producto(5000000, "Carro", "Azul");
        productos2.add(producto5);
        Producto producto6 = new Producto(1500000, "Carro", "Morado");
        productos2.add(producto6);
        categoria2.setListaProductos(productos2);
        ArrayList<Producto> productos3 = new ArrayList<>();
        Categoria categoria3 = new Categoria();
        Producto producto7 = new Producto(20000, "Gafas", "Blancas");
        productos3.add(producto7);
        Producto producto8 = new Producto(5000, "Gafas", "Negras");
        productos3.add(producto8);
        Producto producto9 = new Producto(7000, "Gafas", "Rojo");
        productos3.add(producto9);
        categoria3.setListaProductos(productos3);
        ArrayList<Producto> productos4 = new ArrayList<>();
        Categoria categoria4 = new Categoria();
        Producto producto10 = new Producto(2000, "Pelota", "Gris");
        productos4.add(producto10);
        Producto producto11 = new Producto(5000, "Pelota", "Blanca");
        productos4.add(producto11);
        Producto producto12 = new Producto(15000, "Pelota", "Rojo");
        productos4.add(producto12);
        categoria4.setListaProductos(productos4);
        ArrayList<Producto> productos5 = new ArrayList<>();
        Categoria categoria5 = new Categoria();
        Producto producto13 = new Producto(20000, "Lampara", "Verde");
        productos5.add(producto13);
        Producto producto14 = new Producto(50000, "Lampara", "Blanca");
        productos5.add(producto14);
        Producto producto15 = new Producto(10000, "Lampara", "Azul");
        productos5.add(producto15);
        categoria5.setListaProductos(productos5);
        ArrayList<Producto> productos6 = new ArrayList<>();
        Categoria categoria6 = new Categoria();
        Producto producto16 = new Producto(2000, "Botella", "Transparente");
        productos6.add(producto16);
        Producto producto17 = new Producto(11000, "Botella", "Azul");
        productos6.add(producto17);
        Producto producto18 = new Producto(1000, "Botella", "Transparente");
        productos6.add(producto18);
        categoria6.setListaProductos(productos6);
        categoria2.addCategoria(categoria3);
        categoria3.addCategoria(categoria4);
        categoria2.addCategoria(categoria5);
        categoria.addCategoria(categoria6);
        categorias.add(categoria);
        categorias.add(categoria2);
        empresa.setListaCategorias(categorias);

        System.out.println(empresa.validarRojo());
        System.out.println(empresa.validarProductosPrecio());
    }
}

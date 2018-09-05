package producto.control;

import java.util.HashSet;
import java.util.Iterator;

import producto.entity.Producto;

public class Productos {

	private HashSet<Producto> productos;
	

	public Productos(int tamaño) {
		productos = new HashSet<Producto>();
	}

	/****************************
	 * Ingresar un producto     *
	 ****************************/
	
	public void ingresar(Producto producto) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		productos.add(producto);
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/qqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
	

	/****************************
	 * Eliminar un producto     *
	 ****************************/
	
	public void eliminar(int codProducto) {
		Producto índice;
		índice = buscar(codProducto);
		productos.remove(índice);

	
	}
	
	
	/****************************
	 * Buscar un   producto     *
	 ****************************/

	private Producto buscar(int codProducto) {
		Producto índice = null;
		Producto producto;
		for (Iterator<Producto>iterator=productos.iterator(); iterator.hasNext();) {
			producto=iterator.next();
			if (codProducto == producto.getCodProducto()) {
				índice = producto;
			}
		}
		return índice;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * productos                *
	 ****************************/

	public Producto[] getProductos() {
		return productos;
	}
}

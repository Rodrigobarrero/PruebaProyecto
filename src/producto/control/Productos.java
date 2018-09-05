package producto.control;

import java.util.HashSet;
import java.util.Iterator;

import producto.entity.Producto;

public class Productos {

	private HashSet<Producto> productos;
	

	public Productos(int tama�o) {
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
		Producto �ndice;
		�ndice = buscar(codProducto);
		productos.remove(�ndice);

	
	}
	
	
	/****************************
	 * Buscar un   producto     *
	 ****************************/

	private Producto buscar(int codProducto) {
		Producto �ndice = null;
		Producto producto;
		for (Iterator<Producto>iterator=productos.iterator(); iterator.hasNext();) {
			producto=iterator.next();
			if (codProducto == producto.getCodProducto()) {
				�ndice = producto;
			}
		}
		return �ndice;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * productos                *
	 ****************************/

	public Producto[] getProductos() {
		return productos;
	}
}

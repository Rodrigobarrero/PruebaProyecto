package categoría.view;

import java.util.Iterator;
import java.util.Scanner;

import categoría.control.Categorías;
import categoría.entity.Categoría;
import categoría.entity.NoExisteCategoría;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class CategoríasIO {
	private Categorías categorías;
	private Scanner scanner;
	private Productos productos;

	
	/****************************
	 * Constructor              
	 * @param productos *
	 ****************************/
	
	public CategoríasIO(Categorías categorías, Productos productos, Scanner scanner) {
		
		this.categorías = categorías;
		this.scanner = scanner;
		this.productos = productos;
	}

	
	/****************************
	 * Agregar categorías        *
	 ****************************/
	
	public void add() {
		Categoría categoría = CategoríaIO.ingresar(scanner);
		try {
			categorías.ingresar(categoría);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No existe espacio!");
		}
	}
	
	
	/****************************
	 * Eliminar categorías       
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void delete() throws NoExisteCategoría {
		int codcategoría = InputTypes.readInt("Código de categoría: ", scanner);
		categorías.eliminar(codcategoría);
	}
	
	public void update() throws NoExisteCategoría{
		Categoría categoría;
		int codcategoría = InputTypes.readInt("Codigo de categoría: ", scanner);
		categoría= categorías.buscar(codcategoría);
		System.out.println(categoría);
		Menú.menúModificar(scanner, categoría);
	}
	

	
	/****************************
	 * Listar categorías         *
	 ****************************/
	
	public void list() {
		for (Iterator<Categoría> i = categorías.getCategorías().iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}

	
	/****************************
	 * Listar categorías         
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void listProducts() throws NoExisteCategoría {
		int codCategoría = InputTypes.readInt("Código de categoría: ", scanner);
		Producto producto;
		System.out.println(categorías.buscar(codCategoría));
		for (Iterator<Producto> iterator = productos.getProductos().iterator(); iterator.hasNext();) {
			producto=iterator.next();
			if (codCategoría == producto.getCodCategoría()) {
				System.out.println(producto);
			}
		}
	}

	/****************************
	 * Vector de categorías     *
	 ****************************/
	public Categorías getCategorías() {
		return categorías;
	}
	
	
}

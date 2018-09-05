package categor�a.view;

import java.util.Iterator;
import java.util.Scanner;

import categor�a.control.Categor�as;
import categor�a.entity.Categor�a;
import categor�a.entity.NoExisteCategor�a;
import producto.control.Productos;
import producto.entity.Producto;
import view.InputTypes;

public class Categor�asIO {
	private Categor�as categor�as;
	private Scanner scanner;
	private Productos productos;

	
	/****************************
	 * Constructor              
	 * @param productos *
	 ****************************/
	
	public Categor�asIO(Categor�as categor�as, Productos productos, Scanner scanner) {
		
		this.categor�as = categor�as;
		this.scanner = scanner;
		this.productos = productos;
	}

	
	/****************************
	 * Agregar categor�as        *
	 ****************************/
	
	public void add() {
		Categor�a categor�a = Categor�aIO.ingresar(scanner);
		try {
			categor�as.ingresar(categor�a);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("No existe espacio!");
		}
	}
	
	
	/****************************
	 * Eliminar categor�as       
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void delete() throws NoExisteCategor�a {
		int codcategor�a = InputTypes.readInt("C�digo de categor�a: ", scanner);
		categor�as.eliminar(codcategor�a);
	}
	
	public void update() throws NoExisteCategor�a{
		Categor�a categor�a;
		int codcategor�a = InputTypes.readInt("Codigo de categor�a: ", scanner);
		categor�a= categor�as.buscar(codcategor�a);
		System.out.println(categor�a);
		Men�.men�Modificar(scanner, categor�a);
	}
	

	
	/****************************
	 * Listar categor�as         *
	 ****************************/
	
	public void list() {
		for (Iterator<Categor�a> i = categor�as.getCategor�as().iterator();i.hasNext();) {
			System.out.println(i.next());
		}
	}

	
	/****************************
	 * Listar categor�as         
	 * @throws NoExisteCategor�a *
	 ****************************/
	
	public void listProducts() throws NoExisteCategor�a {
		int codCategor�a = InputTypes.readInt("C�digo de categor�a: ", scanner);
		Producto producto;
		System.out.println(categor�as.buscar(codCategor�a));
		for (Iterator<Producto> iterator = productos.getProductos().iterator(); iterator.hasNext();) {
			producto=iterator.next();
			if (codCategor�a == producto.getCodCategor�a()) {
				System.out.println(producto);
			}
		}
	}

	/****************************
	 * Vector de categor�as     *
	 ****************************/
	public Categor�as getCategor�as() {
		return categor�as;
	}
	
	
}

package categoría.control;

import java.util.HashSet;
import java.util.Iterator;

import categoría.entity.Categoría;
import categoría.entity.NoExisteCategoría;

public class Categorías {

	private HashSet<Categoría> categorías;


	public Categorías(int tamaño) {
		categorías = new HashSet<Categoría>();
		
	}

	/****************************
	 * Ingresar una Categoría    *
	 ****************************/
	
	public void ingresar(Categoría Categoría) throws  java.lang.ArrayIndexOutOfBoundsException{
		
		categorías.add(Categoría);
	}

	/****************************
	 * Devuelve la cantidad de  *
	 * elementos                *
	 ****************************/
	


	/****************************
	 * Eliminar una Categoría     
	 * @throws NoExisteCategoría *
	 ****************************/
	
	public void eliminar(int codCategoría) throws NoExisteCategoría {
		Categoría categoría;
		categoría =buscar(codCategoría);
		categorías.remove(categoría);
	}
	
	
	/****************************
	 * Buscar una   Categoría     
	 * @throws NoExisteCategoría *
	 ****************************/

	public Categoría buscar(int codCategoría) throws NoExisteCategoría {
		Categoría categoría;
		Categoría resultado=null;
		
		for (Iterator<Categoría> iterator=categorías.iterator();iterator.hasNext();) {
			categoría= iterator.next();
			if (categoría.getCodCategoría().equals(codCategoría)) {
				resultado=categoría;
			}
		}
		if (resultado == null) {
			throw new NoExisteCategoría();
		}
		return resultado;
	}
	
	
	/****************************
	 * Devuelve el vector de    * 
	 * Categorías                *
	 ****************************/

	public HashSet<Categoría> getCategorías() {
		return categorías;
	}
}

package view;

import java.util.Scanner;

public class Pantalla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		view.Men�.men�(scanner);
		
		scanner.close();
	}
}

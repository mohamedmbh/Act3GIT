package mainApp;

public class MainApp {

	private static int[] array = new int[30];

	public static void main(String[] args) {

	}

	public static void insertarNumeros() {
		for (int i = 0; i < 30; i++) {
			int n = (int) Math.random() * (10 + 1);
			array[i] = n;
		}
	}

	public static void verContenidoArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void numeroRepeticionesArray() {
		for (int i = 0; i < array.length; i++) {
			int contador = 0;

			for (int x = 0; x < array.length; x++) {
				if (array[i] == array[x])
					contador++;
			}

			System.out.println("El número " + array[i] + " se repite " + contador + " veces.");
		}
	}
}

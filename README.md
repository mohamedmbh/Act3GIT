# **Entorno de Desarrollo**
## **Ejercicio 3**
<br>

Método en java para agregar 20 números aleatorios a un array.

```java
public static void insertarNumeros() {
   for (int i = 0; i < 20; i++) {
      int n = (int) Math.random() * (10 + 1);
      array[i] = n;
   }
}
```

Método en java para ver el contenido del array.

```java
	public static void verContenidoArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
```

Método en java para ver las repeticiones de un número en el array.

```java
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
```

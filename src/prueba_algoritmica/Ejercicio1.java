package prueba_algoritmica;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero = leerNumero();
		imprimirEnterosDescendente(numero);
	}

	public static int leerNumero() {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        scanner.close();
		return numero;
	}

	public static void imprimirEnterosDescendente(int numero) {
		int resto = numero % 2; // 0 si es par, 1 si es impar
		for (int i = numero; i >= resto; i -= 2) {
				System.out.println(i);
		}
	}
}

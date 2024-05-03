package prueba_algoritmica;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		
        int horasTrabajadas = leerHorasTrabajadas();
        double tarifa = leerTarifa();

        if (horasTrabajadas > 40) {
            tarifa *= 1.5;
        }

        double salario = horasTrabajadas * tarifa;

        System.out.println("El salario del trabajador es: " + salario);

        scanner.close();
    }

	public static double leerTarifa() {
        System.out.print("Ingrese la tarifa por hora: ");
		return scanner.nextDouble();
	}

	public static int leerHorasTrabajadas() {
        System.out.print("Ingrese las horas trabajadas: ");
		return scanner.nextInt();
	}
}

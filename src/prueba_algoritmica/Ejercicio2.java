package prueba_algoritmica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Definición de variables para contadores
        int contadorMayoresEdad = 0;
        int contadorMenoresEdad = 0;
        int contadorMasculinosMayores = 0;
        int contadorFemeninosMenores = 0;
        int contadorFemeninos = 0;

        String rutaCsv = "./personas.csv";
        Persona[] personas = leerPersonas(rutaCsv);
        
        // Calcular Cantidades
        for(int i = 0; i < 50; i++) {
        	
        	if(personas[i].getEdad() >= 18) {
        		contadorMayoresEdad++; 
        		if(personas[i].getSexo().equalsIgnoreCase("femenino"))
        			contadorFemeninos++;
        		else {
        			contadorMasculinosMayores++;
        		}
        	}
        	else {
        		contadorMenoresEdad++;
        		if(personas[i].getSexo().equalsIgnoreCase("femenino")) {
        			contadorFemeninos++;
        			contadorFemeninosMenores++;
        		}
        	}
        	
        }
        
        System.out.println(contadorMayoresEdad);
        System.out.println(contadorMenoresEdad);
        System.out.println(contadorMasculinosMayores);
        System.out.println(contadorFemeninosMenores);
        System.out.println(contadorFemeninos);
        
        
        // Cálculo de porcentajes
        double porcentajeMayoresEdad = (contadorMayoresEdad / 50.0) * 100;
        double porcentajeMujeres = (contadorFemeninos / 50.0) * 100;

        // Resultados
        System.out.println("Cantidad de personas mayores de edad: " + contadorMayoresEdad);
        System.out.println("Cantidad de personas menores de edad: " + contadorMenoresEdad);
        System.out.println("Cantidad de personas masculinas mayores de edad: " + contadorMasculinosMayores);
        System.out.println("Cantidad de personas femeninas menores de edad: " + contadorFemeninosMenores);
        System.out.println("Porcentaje de personas mayores de edad respecto al total de personas: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de mujeres respecto al total de personas: " + porcentajeMujeres + "%");
	}

	public static Persona[] leerPersonas(String rutaCsv) {
        String line = "";
        String csvSplitBy = ",";
        
        Persona[] personas = new Persona[50];
        int numPersona = 0;
        
        
		// Leer personas
        try (BufferedReader br = new BufferedReader(new FileReader(rutaCsv))) {
        	line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] persona = line.split(csvSplitBy);
                
                String sexo = persona[0];
                int edad = Integer.parseInt(persona[1]);
                
                personas[numPersona++] = new Persona(sexo, edad);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return personas;
	}
	
	static class Persona {
        private String sexo;
        private int edad;

        public Persona(String sexo, int edad) {
            this.sexo = sexo;
            this.edad = edad;
        }

        public String getSexo() {
            return sexo;
        }
        public int getEdad() {
            return edad;
        }
    }

	
}

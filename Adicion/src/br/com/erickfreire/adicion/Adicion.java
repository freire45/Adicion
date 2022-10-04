package br.com.erickfreire.adicion;

import java.util.Scanner;

/**
 * Programa que calcula la suma de dos valores:
 * @author Erick Freire
 * @version 1 - Creado en 04-10-2022
 */

public class Adicion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int suma;
		
		System.out.println("Programa que calcula la suma de dos valores: ");
		System.out.print("Introduzca el primer valor: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduzca el segundo valor: ");
		numero2 = entrada.nextInt();
		
		suma = numero1 + numero2;
		
		System.out.printf("El resultado de la suma es: %d%n", suma);
		
		

	}

}

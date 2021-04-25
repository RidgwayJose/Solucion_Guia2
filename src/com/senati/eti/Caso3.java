package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese segundo número: ");
		int num2 = sc.nextInt();
		
		String resultado = "";
		
		if (num1 == num2)
			resultado = "Los números son iguales";
		else if (num1 > num2)
			resultado = "El primer número es mayor";
		else
			resultado = "El segundo número es mayor";
		
		System.out.println("\nResultado");
		System.out.println("-----------");
		System.out.println("Respuesta....: " + resultado);
		
		
		
		
	}

}

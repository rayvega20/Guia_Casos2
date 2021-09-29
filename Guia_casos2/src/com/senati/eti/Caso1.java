package com.senati.eti;

import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
		System.out.print("ingrese edad: ");
		int edad= sc.nextInt();
		
		String estado = "menor de edad";
		
		//condicional simple
		if (edad >= 18)
			estado = "mayor de edad";
		
		System.out.println("\nresultados");
		System.out.println("---------------");
		System.out.println("estado........: " + estado);
	}

}

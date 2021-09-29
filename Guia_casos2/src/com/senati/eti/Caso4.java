package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese el primer numero: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		int n2 = sc.nextInt();
		String mensaje ="";
		
		if (n1==n2)
			mensaje = "Los dos números son iguales";
		else if (n1<n2)
			mensaje = "El primer número es menor";
		else
			mensaje = "El segundo número es menor";
		
		System.out.println("\nRESULTADO");
		System.out.println("-----------");
		System.out.println("Resultado.....: "+ mensaje);

	}

}

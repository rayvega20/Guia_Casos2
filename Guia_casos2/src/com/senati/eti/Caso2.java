package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("ingrese numero: ");
			int n= sc.nextInt();
			
			String mensaje = "";
			
			//condicional compuesta
			if ((n % 2)== 0)
				mensaje = "el numero es par";
			else
				mensaje= "el numero es impar";


			System.out.println("\nresultados");
			System.out.println("---------------");
			System.out.println("resultado........: " + mensaje);

	}
}

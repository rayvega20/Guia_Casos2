package com.senati.eti;

import java.util.Scanner;


public class Caso7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			
			System.out.print("ingrese numero: ");
			float sueldo= sc.nextFloat();
			
			float impuesto = 0;
			
		
			if (sueldo <= 1500)
				impuesto  = 0.03f*sueldo;
			else if (sueldo <= 3000)
				impuesto= 0.08f*sueldo;
			else
				impuesto=0.12f*sueldo;
			
			System.out.println("\nresultados");
			System.out.println("---------------");
			System.out.println("impuesto........: " + impuesto);

	}

}

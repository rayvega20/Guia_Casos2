package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese nombre del alumno: ");
		String nombre= sc.nextLine();
		
		System.out.print("nota 1 [0-20]: ");
		int nota1 = sc.nextInt();
		
		System.out.print("nota 2 [0-20]: ");
		int nota2 = sc.nextInt();
		
		System.out.print("asistencias [0-12]: ");
		float na = sc.nextFloat();
		
		float promedio =(float)(nota1 * 0.3 + nota2*0.7);
		float porcentaje = na / 12 *100;
		String estado= "Aprobado";
	
		
		System.out.println("\nRESULTADOS");
		System.out.println("---------------");
		System.out.println("Alumno..........: " + nombre);
		System.out.println("Promedio........: " + promedio);
		System.out.println("Asistencia......: " + porcentaje + "%");
		System.out.println("Estado..........: " + estado); 

	}

}

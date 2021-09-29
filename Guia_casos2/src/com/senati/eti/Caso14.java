package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nombre de alumno :");
		String alumno= sc.nextLine();

		System.out.print("carrera[DS-RC-DG] :");
		String carrera= sc.nextLine();
		
		System.out.print("Turno [M-T-N] :");
		String turno= sc.nextLine();
		
		String nombre_carrera ="", nombre_turno ="";
		float monto = 0, dscto =0, total_sol = 0, total_dol= 0;
		
		switch (carrera) {
		    case "DS":
		        nombre_carrera = "Desarrollo de Software";
		        monto=1500;
		        break;
		    case "RC":
		        nombre_carrera = "Redes y Conectividad";
		        monto=1400;
		        break;  
		    case "DG":
		        nombre_carrera = "Diseño Grafico";
		        monto=1300;
		        break;  
		    default:
		    	nombre_carrera = "desconocido";
		    	monto=0;    
		}
		 switch (turno) {
		     case "M":
		    	 nombre_turno = "mañana";
		    	 dscto= 0.1f * monto;
		    	 break;
		 }
		
	}

}

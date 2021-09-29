package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese numero[1-7] :");
		int n= sc.nextInt();
		
		String nombre_dia="";
		
		//condicional multiple (selectiva)
		switch (n) {
		    case 1:
		    	nombre_dia="domingo";
		    	break;
		    case 2:
		    	nombre_dia="lunes";
		    	break;
		    case 3:
		    	nombre_dia="martes";
		    	break;
		    case 4:
		    	nombre_dia="miercoles";
		    	break;
		    case 5:
		    	nombre_dia="jueves";
		    	break;
		    case 6:
		    	nombre_dia="viernes";
		    	break;	
		    case 7:
		    	nombre_dia="sabado";
		    	break;
		    default:
		    	nombre_dia="desconocido";   	
		}


		System.out.println("\nRESULTADOS");
		System.out.println("---------------");
		System.out.println("dia de la semana..........: " + nombre_dia);
	}

}

package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
		System.out.print("nombre de empleado :");
		String empleado= sc.nextLine();
		
		System.out.print("nivel [1-4] :");
		int nivel= sc.nextInt();
		
		System.out.print("sueldo :");
		float sueldo= sc.nextFloat();
		
		float valor_inc = 0, nuevo_sueldo = 0;
		
		switch (nivel) {
		    case 1:
		    	valor_inc= 0.045f;
		    	break;
		    case 2:
		    	valor_inc= 0.06f;	
		    	break;
		    case 3:
		    	valor_inc= 0.85f;	
		    	break;	
		    case 4:
		    	valor_inc= 0.011f;	
		    	break;	
		}
		
		nuevo_sueldo=sueldo + sueldo * valor_inc;

		System.out.println("\nRESULTADOS");
		System.out.println("---------------");
		System.out.println("Empleado..........: " + empleado);
		System.out.println("Nivel........: " + nivel);
		System.out.println("Sueldo......: " +  df.format(sueldo));
		System.out.println("Incremento..........: " +  valor_inc * 100 + "%"); 
		System.out.println("Nuevo sueldo..........: " +  df.format(nuevo_sueldo)); 

	}

}

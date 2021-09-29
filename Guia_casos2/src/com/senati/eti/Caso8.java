package com.senati.eti;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese nota........: ");
		float nota = sc.nextFloat();
		
		String estado = "";
		
		if  (nota >= 18 && nota <= 20)
			estado = "Excelente";
		else if (nota >= 15 && nota <= 17)
    	   estado = "Notable";
		else if (nota >= 11 && nota <= 14)
    	   estado = "Regular";
		else if (nota >= 8 && nota <= 10)
    	   estado = "Malo";
		else if (nota >= 0 && nota <= 7)
    	   estado = "Sin palabras";
        else
    	   estado = "Estado no encontrado";
       
       System.out.println("Estado obtenido.....: " + estado);
	}

}

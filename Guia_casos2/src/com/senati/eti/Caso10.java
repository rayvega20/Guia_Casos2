package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Trabajador............: ");
		String trabajador = sc.nextLine();
		
		System.out.print("Horas trabajadas........: ");
		float h_t = sc.nextFloat();

		System.out.print("Tarifa por horas........: ");
		float t_h = sc.nextFloat();
		
		System.out.print("Minutos de tardanzas........: ");
		float nmt = sc.nextFloat();
		
		float importe = 0;
		float bono = 0;
		float dscto = 0;
		float m_a = 0;
		
		importe = h_t * t_h;
		
		if ( h_t > 60)
			bono = importe * 13 / 100;
		else bono = importe * 4 / 100;
		
		if (nmt > 15)
			dscto = importe * 3 / 100;
		else dscto = 0;
			
		m_a = h_t / 0.7f;
		

		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Trabajador.........: " + trabajador);
		System.out.println("Horas trabajadas...: " + h_t);
		System.out.println("Tarifa por horas...: " + t_h);
		System.out.println("Importe............: " + importe);
		System.out.println("Bono...............: " + bono);
		System.out.println("Descuento..........: " + dscto);
		System.out.println("Meta alcanzada.....: " + m_a + "%");
	}

}

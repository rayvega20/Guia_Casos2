package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.print("ingrese cantidad: ");
		float n1= sc.nextFloat();
		
		System.out.print("ingrese precio: ");
		float n2= sc.nextFloat();
		
		
		float total= (n1 * n2);
	    float dscto = 0;
	    

		if (n1 >= 8f)
			dscto =(float)(total*0.1);
		else if(n1 < 8f)
			dscto=0;
		
		float neto =(total-dscto);
		
		System.out.println("\nresultados");
		System.out.println("---------------");
		System.out.println("importe parcial.......: " + df.format(total));
		System.out.println("descuento.............: " + df.format(dscto));
		System.out.println("importe neto..........: " + df.format(neto));

	}

}

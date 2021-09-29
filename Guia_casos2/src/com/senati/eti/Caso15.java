package com.senati.eti;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("Nombre del cliente: ");
		String cliente = sc.nextLine();

		System.out.print("Ingrese producto [TB / LT / MN / IM]   : ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese forma de pago [c1/c2]: ");
		String forma_pago = sc.nextLine();
		
		System.out.print("Ingrese cantidad...............]: ");
		int cantidad = sc.nextInt();
		
		String nom_pro = "";
		float precio = 0;
		float importe = 0;
		float dscto = 0; 
		float incremento = 0;
		float total_pagar = 0;
		
		switch (producto) {
		case "TB":
			nom_pro = "Tablet";
			precio = 350;
			break;
			
		case "LT":
			nom_pro = "Laptop";
			precio = 2300;
			break;
		case "MN":
			nom_pro = "Monitor";
			precio = 850;
			break;
		case "IM":
			nom_pro = "Impresora";
			precio = 680;
			break;
	   default:
			nom_pro = "Producto no encontrado";
			precio = 0;		
		}
		
		importe = precio * cantidad;
		String f_pago = "";
		
		switch (forma_pago) {
		case "C1":
			f_pago = "Contado";
			dscto = importe * 5 / 100;
			break;
		case "C2":
			f_pago = "Credito";
			incremento = importe * 12 / 100;
			break;
				
		}
	
		System.out.println("Cliente...........: " +cliente);
		System.out.println("Producto..........: " + nom_pro);
		System.out.println("Precio............: " + precio);
		System.out.println("Cantidad..........: " + cantidad);
		System.out.println("importe...........: " + importe);
		System.out.println("Forma de pago.....: " + f_pago);
	
		if (f_pago == "Credito")
			System.out.println("Incremento.....: " + incremento);
		    total_pagar = importe + incremento;
		    System.out.println("Total a pagar.....: " +total_pagar);
		
		if (f_pago == "Contado")
		    System.out.println("Descuento.....: " + dscto);	
		 total_pagar = importe - dscto;
		    System.out.println("Total a pagar.....: " +total_pagar);

	}

}

/**********************
Proyecto POO 
Clase Controlador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Maneja la creación de los contactos y los guarda en una lista de arreglos dinámica.
Version: 1.0
Ultima actualizacion: 19 de septiembre
******************************************************************/

import java.util.Scanner;
import java.util.ArrayList;
class Libreta
{
	Scanner scan = new Scanner(System.in);
	private String nombre = "";
	private int numero = 0;
	private ArrayList<Contacto> contactoss = new ArrayList<Contacto>();

	public Libreta()
	{

	}

	public void NuevoContacto()
	{
		System.out.println("\nIngrese el nombre del contacto: ");
		nombre = scan.nextLine();
		System.out.println("\nIngrese el numero del contacto: ");
		numero = scan.nextInt();
		Contacto contacto = new Contacto(nombre, numero);
		contactoss.add(contacto);
		System.out.println("\nSe agregó el contacto.\n");
	}
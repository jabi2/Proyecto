/**********************
Proyecto POO 
Clase Contacto
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará del contacto de las tutorías.
Version: 1.0
Ultima actualizacion: 19 de septiembre
******************************************************************/

import java.util.Scanner;
public class Contacto
{
	Scanner scan = new Scanner(System.in);

	private String nombre = "";
  private String info = "";
  private int numero = 0;

	public Contacto(String nombre, int numero)
	{
		this.nombre = nombre;
		this.numero = numero;
		Infos();
	}
	
  public void Infos()
	{
		System.out.println("\n¿Desea agregar información adicional? (Si = 1, No = 0)");
		if (scan.nextInt()== 1)
		{
			info = scan.nextLine();
		} else
		{
			info = "";
		}

	}
  
}
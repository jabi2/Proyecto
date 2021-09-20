/**********************
Proyecto POO 
Clase Controlador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Crea y guarda contactos que se quieran agregar al programa.
Version: 1.0
Ultima actualizacion: 19 de septiembre
******************************************************************/

import java.util.Scanner;
class Contacto
{
	Scanner scan = new Scanner(System.in);

	private String nombre = "";
  private String info = "";
  private int numero = 0;

	public Contacto(String nombre, int numero)
	{
		this.nombre = nombre;
		this.numero = numero;
	}
	
  public void Infos()
	{
		System.out.println("¿Desea agregar información adicional? (Si = 1, No = 0)");
		if (scan.nextInt()== 1)
		{
			info = scan.nextLine();
		} else
		{
			info = "";
		}

	}
  
}
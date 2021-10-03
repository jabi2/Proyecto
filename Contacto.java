/**********************
Proyecto POO 
Clase Contacto
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará del contacto de las tutorías.
Version: 1.0
Ultima actualizacion: 19 de septiembre
******************************************************************/

public class Contacto
{
	private String nombre;
  private String correo;
  private int numero;
  private int cursoA;

	public Contacto(String nombre, String correo, int numero, int cursoA)
	{
		this.nombre = nombre;
    this.correo = correo;
		this.numero = numero;
    this.cursoA = cursoA;
	}

  public String toString(){
    return "Nombre del tutor: " + nombre + ", número de teléfono: " + numero + ", correo electrónico: " + correo + ".";
  }

  public int getCursoA(){
    return cursoA;
  }
}
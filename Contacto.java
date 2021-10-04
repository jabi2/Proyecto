/**********************
Proyecto POO 
Clase Contacto
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará del contacto de las tutorías.
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/

public class Contacto
{
  //Declaración de las propiedades.
	private String nombre;
  private String correo;
  private int numero;
  private int cursoA;

  /********************************
     * @param: El nombre, correo, número y número del curso que da el tutor.
     * @return: -
     */
  //Constructor de la clase.
	public Contacto(String nombre, String correo, int numero, int cursoA)
	{
		this.nombre = nombre;
    this.correo = correo;
		this.numero = numero;
    this.cursoA = cursoA;
	}

  /********************************
     * @param: -
     * @return: La descripción del tutor.
     */
  //Override del método toString para que se muestre el nombre, correo y número del tutor.
  public String toString(){
    return "Nombre del tutor: " + nombre + ", número de teléfono: " + numero + ", correo electrónico: " + correo + ".";
  }

  /********************************
     * @param: -
     * @return: Regresa si es tutor de matemática, física, química o biología.
     */
  //Regresa el valor entero de cursoA, que servirá para indicar si es tutor de matemática (1), física (2), química (3) o biología (4).
  public int getCursoA(){
    return cursoA;
  }
}
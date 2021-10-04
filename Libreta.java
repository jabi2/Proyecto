/**********************
Proyecto POO 
Clase Controlador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Maneja la creación de los contactos y los guarda en una lista de arreglos dinámica.
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/

import java.util.ArrayList;
public class Libreta{
	private ArrayList<Contacto> contactoss;

  /********************************
     * @param: -
     * @return: -
     */
  //Es el constructor de la clase.
	public Libreta()
	{
    contactoss = new ArrayList<Contacto>();

    //Registro de tutores de matemática.
    Contacto c = new Contacto("Pablo Rosa", "prosa@gmail.com", 78526321, 1);
    contactoss.add(c);

    c = new Contacto("Juan Marroquín", "jmarroquinma@gmail.com", 31613125, 1);
    contactoss.add(c);

    c = new Contacto("Ana Álvarez", "aalvarez@gmail.com", 45612309, 1);
    contactoss.add(c);

    //Registro de tutores de física.
    c = new Contacto("Javier Rucal", "jrucal@outlook.com", 96325871, 2);
    contactoss.add(c);

    c = new Contacto("Estuardo Hill", "ehill@hotmail.com", 48965132, 2);
    contactoss.add(c);

    c = new Contacto("Daniella Artemi", "dartemi@gmail.com", 45612395, 2);
    contactoss.add(c);

    //Registro de tutores de química.
    c = new Contacto("Carlos Escobar", "cescobar@uvg.edu.gt", 96325647, 3);
    contactoss.add(c);

    c = new Contacto("Óscar Melchor", "omelchor@gmail.com", 98456132, 3);
    contactoss.add(c);

    c = new Contacto("Sofía Ponce", "sponce@uvg.edu.gt", 98745612, 3);
    contactoss.add(c);

    //Registro de tutores de biología
    c = new Contacto("Rodrigo Ayala", "rayala@gmail.com", 98795166, 4);
    contactoss.add(c);

    c = new Contacto("Amy Argueta", "aargueta@gmail.com", 99968578, 4);
    contactoss.add(c);

    c = new Contacto("Marian López", "mlopez@hotmail.com", 48956123, 4);
    contactoss.add(c);
	}

  /********************************
     * @param: -
     * @return: Un ArrayList de contactos.
     */
  public ArrayList<Contacto> getLibretaC(){
    return contactoss;
  }
}
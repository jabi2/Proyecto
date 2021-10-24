/**********************
Proyecto POO 
Clase Guardador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Permite extraer los contactos de un archivo en donde estén guardados y así utilizarlos en el programa. 
Version: 1.2
Ultima actualizacion: 23 de octubre
******************************************************************/

/**
Placeholder por que se requiere investigar más acerca de la clase File y así importarla y utilizarla aca. Investigación en proceso.
**/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Guardador{

	private String path = "Tutores.csv";
	private String line = "";
	private int x = 1;
	private String[] values = new String[20];
	private Contacto contactos[] = new Contacto[15];
	private String nombre;
	private String email;
	private String tel;
	private String curso;


  /********************************
     * @param: -
     * @return: -
     */
  //Es el constructor de la clase.
	public Guardador()
	{
	}

	public void almacenarr()
	{
	try {
		BufferedReader br = new BufferedReader(new FileReader(path));

		//Ciclo while para leer el archivo seleccionado entero
		x = 0;
		while((line = br.readLine()) != null){
			//System.out.println(line);
			//Almacenador de datos en un array
			String[] values = line.split(",");
			//System.out.println(values);
			nombre  = values[0];
			email = values[1];
			tel = values[2];
			curso = values[3];
			Contacto ContactoActual = new Contacto(nombre, email, tel, curso);
			contactos[x] = ContactoActual;
			System.out.println("\n");
			System.out.println(contactos[x].getNombre());
			System.out.println(contactos[x].getNum());
			System.out.println(contactos[x].getCorreo());
			System.out.println(contactos[x].getCurso());
			x = x+1;
		}

		//Bloques de catch para detener el codigo cuando el archivo se acaba
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
//Documentacion de la clase BufferedReader: https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html

/**********************
Proyecto POO 
Clase Guardador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Permite extraer los contactos de un archivo en donde estén guardados y así utilizarlos en el programa. 
Version: 1.1
Ultima actualizacion: 17 de octubre
******************************************************************/

/** 
Placeholder por que se requiere investigar más acerca de la clase File y así importarla y utilizarla aca. Investigación en proceso.
**/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class Guardador{

	private String path = "";
	private String line = "";

  /********************************
     * @param: -
     * @return: -
     */
  //Es el constructor de la clase.
	public Guardador()
	{
	}

	try {
		BufferedReader br = new BufferedReader(new FileReader(path));	

		//Ciclo while para leer el archivo seleccionado entero
		while((line = br.readLine()) != null){
			//System.out.println(line);
			//Almacenador de datos en un array
			String[] values = line.split(",");
			System.out.println(values[0]);
		}

		//Bloques de catch para detener el codigo cuando el archivo se acaba
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

//Documentacion de la clase BufferedReader: https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html

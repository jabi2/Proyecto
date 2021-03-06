/**********************
Proyecto POO 
Clase Guardador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Permite extraer los contactos de un archivo en donde estén guardados y así utilizarlos en el programa. 
Version: 1.2
Ultima actualizacion: 7 de noviembre
******************************************************************/
//NOTA IMPORTANTE: La funcionalidad para leer csv solo aplica cuando el programa está descargado en la computadora.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Guardador{

	private String path = "Tutores.csv";
	private String line = "";
	private int x = 1;
	private int p = 0;
	private String[] values = new String[20];
	private Contacto[] contactos = new Contacto[15];
	private String nombre;
	private String email;
	private String tel;
	private String curso;
	private int cursoA;


  /********************************
     * @param: -
     * @return: -
     */
  //Es el constructor de la clase.
	public Guardador()
	{
		almacenarr();
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
        cursoA = Integer.parseInt(curso);
        Contacto ContactoActual = new Contacto(nombre, email, tel, cursoA);
        contactos[x] = ContactoActual;

        x++;
      }

      //Bloques de catch para detener el codigo cuando el archivo se acaba o no se encuentra
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
	}

  public Contacto[] getContactos(){
    return contactos;
  }

	public Contacto getContacto(int c)
	{
		return contactos[c];
	}

	public ArrayList<Contacto> getTutos(int c)
	{
    ArrayList<Contacto> tutos = new ArrayList<Contacto>();

		p = 0;
		try {
			while (p < x)
				if (c == contactos[p].getCurso()) {
					tutos.add(contactos[p]);
					p++;
				}
				else p++;
		} catch (Exception e){
			System.out.println("");
		}

    return tutos;
	}
}
//Documentacion de la clase BufferedReader: https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html

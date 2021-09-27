/**********************
Proyecto POO 
Clase Vista
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Vista del programa, permite al usuario interactuar con el programa y mostrar informacion relevante.
Version: 1.0
Ultima actualizacion: 12 de septiembre
******************************************************************/
/*Se importa scanner para poder leer los datos ingresados por el usuario*/
import java.util.Scanner;

public class Vista{
  private Scanner scan;

  public Vista(){
    scan = new Scanner(System.in);
  }

  public void bienvenida(){
    System.out.println("Bienvenido al programa que busca apoyar al rendimiento y desarrollo de los estudiantes.");
  }

  public int queOpcion(){
    System.out.println("¿Qué opción es la que deseas ejecutar?");
    int op = scan.nextInt();
    return op;
  }

  public void menuP(){
    /*Se crea el menú de opciones que se le presentará al usuario para que el mismo pueda escoger la opción deseada*/
    
    System.out.println("1. Cursos\n");
		System.out.println("2. Programas Universitarios\n");
		System.out.println("3. Contactos para tutorías\n");
		System.out.println("4. Salir\n");
    /*Se implementa un ciclo While el que leera el número de opción que desea ejecutar el usuario y asi ejecutarlo*/
  }

  public void despedida(){
    System.out.println("Esperamos que nuestro programa haya sido de utilidad. Hasta la próxima.\n");
  }

  public void valid1(){
    System.out.println("Elige una opción dentro del rango [1, 4].\n");
  }
}
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

class Vista{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int opcion = 0;

		Controlador controlador = new Controlador();


		while (opcion != 4){
/*Se crea el menú de opciones que se le presentará al usuario para que el mismo pueda escoger la opción deseada*/
			System.out.println("\n\n Bienvenido al programa que busca apoyar al rendimiento y desarrollo de los estudiantes.");
			System.out.println("1. Cursos\n");
			System.out.println("2. Programas Universitarios\n");
			System.out.println("3. Contactos para tutorías\n");
			System.out.println("4. Salir\n\n");
/*Se implementa un ciclo While el que leera el número de opción que desea ejecutar el usuario y asi ejecutarlo*/
			opcion = scan.nextInt();
/*cada condición permite el ingreso al método estipulado para cada opción*/
			if (opcion == 1){
        //controlador.cursos();
      }
			else if (opcion == 2){
				//controlador.programasU();
			}
			else if (opcion == 3){
				//controlador.contactosTutorias();
			}
			else if (opcion == 4){
				System.out.println("Esperamos que nuestro programa haya sido de utilidad. Hasta la próxima.");
			}
      else System.out.println("Elige una opción dentro del rango [1, 4].");
		}
	}
}
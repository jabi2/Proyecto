/**********************
Proyecto POO 

Descripcion: Vista del programa
******************************************************************/
import java.util.Scanner;

class Vista{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int opcion = 0;

		Controlador controlador = new Controlador();


		while (opcion != 4){

			System.out.println("\n\n Bienvenido al programa que busca apoyar al rendimiento y desarrollo de los estudiantes.");
			System.out.println("1. Cursos\n");
			System.out.println("2. Programas Universitarios\n");
			System.out.println("3. Contactos para tutorías\n");
			System.out.println("4. Salir\n\n");

			opcion = scan.nextInt();

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
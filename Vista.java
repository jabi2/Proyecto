/**********************
Proyecto POO 
Clase Vista
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Vista del programa, permite al usuario interactuar con el programa y mostrar informacion relevante.
Version: 1.0
Ultima actualizacion: 26 de septiembre
******************************************************************/
/*Se importa scanner para poder leer los datos ingresados por el usuario*/
import java.util.Scanner;
import java.util.ArrayList;

public class Vista{
  private Scanner scan;

  public Vista(){
    scan = new Scanner(System.in);
  }

  public void bienvenida(){
    System.out.println("\nBienvenido, estimado estudiante.");
    System.out.println("El objetivo del presente programa es brindar ayuda a la población guatemalteca para que se lleve a cabo el Objetivo de Desarrollo Sostenible 4: educación de calidad.");
    System.out.println("Esta aplicación tiene como servicios el dar información de un tema en específico para que pueda ser estudiado por ti, y luego evaluarte para darte una retroalimentación al respecto. Del mismo modo, también se pueden buscar universidades de acuerdo a la situación económica y el nivel que se desea cursar (licenciatura, maestría o doctorado). Asimismo, el programa también puede ofrecer números telefónicos y correos electrónicos de personas que puedan ofrecer tutorías de un curso con el que tengas dificultad.\nEsperamos que nuestro programa sea de utilidad.");
  }

  public int queOpcion(){
    System.out.println("¿Qué opción es la que deseas ejecutar?");
    int op = scan.nextInt();
    return op;
  }

  public void menuP(){
    /*Se crea el menú de opciones que se le presentará al usuario para que el mismo pueda escoger la opción deseada*/
    System.out.println("\n------------MENÚ-------------");
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
  public void mostrarCursos(String[][] c){
    //Ciclos anidados que recorrerán la matriz.
    for (int i = 0; i < 4; i++)
    {
      System.out.println("\nClases de " + c[0][i]);

      for (int j = 1; j < 4; j++) System.out.println(j+". "+c[j][i]+"\n");
    }
  }

  public int queCurso(){
    System.out.println("\n Tenemos personas especializadas en las siguientes áreas:");
    System.out.println("1. Matemática\n2. Física\n3. Química\n4. Biología");
    System.out.print("¿En qué curso necesitas ayuda? Ingresa el número de opción que te interese...");
    
    boolean bandera = false;
    int op = 0;

    op = scan.nextInt();

    return op;
  }

  public void mostrarTutores(int i, ArrayList<Contacto> v){
    System.out.print("\nTenemos registrados a los siguientes tutores en el área de ");
    if (i == 1) System.out.print("matemática:\n");
    else if (i == 2) System.out.print("física:\n");
    else if (i == 3) System.out.print("química:\n");
    else System.out.print("biología:\n");

    int cont = 1;

    for (int j = 0; j < v.size(); j++)
      if (v.get(j).getCursoA() == i)
      {
        System.out.println(cont + ". " + v.get(j).toString() + "\n");
        cont++;
      }
  }
}
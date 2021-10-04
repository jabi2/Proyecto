/**********************
Proyecto POO 
Clase Vista
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Vista del programa, permite al usuario interactuar con el programa y mostrar informacion relevante.
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/
/*Se importa scanner para poder leer los datos ingresados por el usuario*/
import java.util.Scanner;
import java.util.ArrayList;

public class Vista{
  private Scanner scan;

  //Constructor de vista.
  public Vista(){
    scan = new Scanner(System.in);
  }

  //Mensaje de bienvenida al usuario.
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
		System.out.println("2. Búsqueda de Universidades\n");
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
  
  public int mostrarCursos(String[][] c){
    int cont = 1;

    //Ciclos anidados que recorrerán la matriz.
    for (int i = 0; i < 4; i++)
    {
      System.out.println("\nClases de " + c[0][i]);

      for (int j = 1; j < 4; j++)
      {
        System.out.println(cont+". "+c[j][i]+"\n");
        cont++;
      }
    }

    boolean bandera = false;
    int op = 0;

    while (!bandera)
    {
      System.out.print("\n¿Qué número de curso quieres estudiar?");
      op = scan.nextInt();

      if ((op >= 1) && (op <= 12)) bandera = true;
      else System.out.println("\nIngresa únicamente números enteros dentro del rango [1, 12].");
    }

    return op;
  }

  public int queCurso(){
    System.out.println("\n Tenemos personas especializadas en las siguientes áreas:");
    System.out.println("1. Matemática\n2. Física\n3. Química\n4. Biología");
    
    boolean bandera = false;
    int op = 0;

    while (!bandera)
    {
      System.out.print("\n¿En qué curso necesitas ayuda? Ingresa el número de opción que te interese...");
      op = scan.nextInt();

      if ((op >= 1) && (op <= 3)) bandera = true;
      else System.out.println("Ingresa solo números dentro del rango [1, 4].");
    } 

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

  public int[] hacerCuestionario(Cuestionario c){
    
    int[] rs = new int[4];
    
    for (int i = 0 ; i < 4; i++)
    {
      System.out.println("\nPregunta " + (i + 1));
      c.getPregunta(i);
      boolean bandera = false;
      int op = 0;

      while (!bandera)
      {
        System.out.println("Respuesta (el número): ");
        op = scan.nextInt();

        if ((op >= 1) && (op <= 3)) bandera = true;
        else System.out.println("Ingresa solo opciones dentro del rango [1, 3].");
      }

      rs[i] = op;
    }

    return rs;
  }

  public void retroalimentacion(int resultado){
    System.out.println("\nTu calificación final en este cuestionario es " + resultado + "\nRetroalimentación:");

    if ((resultado == 0) || (resultado == 25)) System.out.println("\nDebes repasar mucho más este tema, ¡vamos! Tú puedes, solo vuelve a leer el documento y practicar.");
    else if (resultado == 50) System.out.println("\nTe aconsejamos que leas de nuevo la página, y practica mentalmente antes de hacer este cuestionario.");
    else if (resultado == 75) System.out.println("\n¡Bien hecho! Solo hace falta pulir pequeños detalles, pero ya casi lo tienes.");
    else System.out.println("\n¡Muchas felicidades! Sabes mucho de este tema, pero no te conformes con esto, sigue construyendo tu conocimiento.");
  }
}
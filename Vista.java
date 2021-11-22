/**********************
Proyecto POO 
Clase Vista
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Vista del programa, permite al usuario interactuar con el programa y mostrar informacion relevante.
Version: 1.0
Ultima actualizacion: 21 de noviembre
******************************************************************/
/*Se importa scanner para poder leer los datos ingresados por el usuario*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Vista implements Estimador{
  private Scanner scan;

  /********************************
     * @param: -
     * @return: -
     */
  //Constructor de vista.
  public Vista(){
    scan = new Scanner(System.in);
  }

  /********************************
     * @param: -
     * @return: -
     */
  //Mensaje de bienvenida al usuario.
  public void bienvenida(){
    System.out.println("\nBienvenido, estimado estudiante.");
    System.out.println("El objetivo del presente programa es brindar ayuda a la población guatemalteca para que se lleve a cabo el Objetivo de Desarrollo Sostenible 4: educación de calidad.");
    System.out.println("Esta aplicación tiene como servicios el dar información de un tema en específico para que pueda ser estudiado por ti, y luego evaluarte para darte una retroalimentación al respecto. Del mismo modo, también se pueden buscar universidades de acuerdo a la situación económica y el nivel que se desea cursar (licenciatura, maestría o doctorado). Asimismo, el programa también puede ofrecer números telefónicos y correos electrónicos de personas que puedan ofrecer tutorías de un curso con el que tengas dificultad.\nEsperamos que nuestro programa sea de utilidad.");
  }

  /********************************
     * @param: -
     * @return: el entero de la opción.
     */
  public int queOpcion(){
    boolean bandera = false;
    int op = 0;
    
    while (!bandera)
      try
      {
        System.out.println("¿Qué opción es la que deseas ejecutar?");
        op = scan.nextInt();
        if ((op >= 1) && (op <= 4)) bandera = true;
        else System.out.println("Ingresa números dentro del rango de respuesta [1, 4].");
      }
      catch (InputMismatchException e)
      {
        scan.next();
        bandera = false;
        System.out.println("\nIngresa números enteros solamente.");
      }

    return op;
  }

  /********************************
     * @param: -
     * @return: -
     */
  public void menuP(){
    /*Se crea el menú de opciones que se le presentará al usuario para que el mismo pueda escoger la opción deseada*/
    System.out.println("\n------------MENÚ-------------");
    System.out.println("1. Cursos\n");
		System.out.println("2. Búsqueda de Universidades\n");
		System.out.println("3. Contactos para tutorías\n");
		System.out.println("4. Salir\n");
    /*Se implementa un ciclo While el que leera el número de opción que desea ejecutar el usuario y asi ejecutarlo*/
  }

  /********************************
     * @param: -
     * @return: -
     */
  public void despedida(){
    System.out.println("Esperamos que nuestro programa haya sido de utilidad. Hasta la próxima.\n");
  }

  /********************************
     * @param: -
     * @return: -
     */
  public void valid1(){
    System.out.println("Elige una opción dentro del rango [1, 4].\n");
  }
  
  /********************************
     * @param: La matriz de cursos.
     * @return: El entero de opción.
     */
  public int mostrarCursos(String[][] c){
    int cont = 1;

    //Ciclos anidados que recorrerán la matriz.
    for (int i = 0; i < 4; i++)
    {
      System.out.println("\nClases de " + c[0][i]);

      for (int j = 1; (j < 4) && (c[j][i]!=null); j++)
      {
        System.out.println(cont+". "+c[j][i]+"\n");
        cont++;
      }
    }

    boolean bandera = false;
    int op = 0;

    while (!bandera)
      try
      {
        System.out.print("\n¿Qué número de curso quieres estudiar? ");
        op = scan.nextInt();

        //Rango de opciones entre 1 y 10 porque ese es el número de cursos que se ofrece.
        if ((op >= 1) && (op <= 10)) bandera = true;
        else System.out.println("\nIngresa únicamente números enteros dentro del rango [1, 12].");
      }
      catch (InputMismatchException e)
      {
        scan.next();
        bandera = false;
        System.out.println("\nIngresa números enteros solamente.");
      }

    return op;
  }

  public void avisoPag(){
    System.out.println("\nA continuación se abrirá una página web donde podrás estudiar el tema que escogiste.");
  }

  /********************************
     * @param: -
     * @return: El entero que representa la opción.
     */
  public int queCurso(){
    System.out.println("\n Tenemos personas especializadas en las siguientes áreas:");
    System.out.println("1. Matemática\n2. Física\n3. Química\n4. Biología");
    
    boolean bandera = false;
    int op = 0;

    while (!bandera)
      try
      {
        System.out.print("\n¿En qué curso necesitas ayuda? Ingresa el número de opción que te interese...");
        op = scan.nextInt();

        if ((op >= 1) && (op <= 4)) bandera = true;
        else System.out.println("Ingresa solo números dentro del rango [1, 4].");
      }
      catch (InputMismatchException e)
      {
        scan.next();
        bandera = false;
        System.out.println("\nIngresa números enteros solamente.");
      } 

    return op;
  }

  /********************************
     * @param: El índice que representa el área a estudiar, y un ArrayList de contactos.
     * @return: -
     */
  public void mostrarTutores(int i, ArrayList<Contacto> v){
    System.out.print("\nTenemos registrados a los siguientes tutores en el área de ");
    if (i == 1) System.out.print("matemática:\n");
    else if (i == 2) System.out.print("física:\n");
    else if (i == 3) System.out.print("química:\n");
    else System.out.print("biología:\n");

    int cont = 1;

    for (int j = 0; j < v.size(); j++)
      if (v.get(j).getCurso() == i)
      {
        System.out.println(cont + ". " + v.get(j).toString() + "\n");
        cont++;
      }
  }

  

  public ArrayList<String> hacerCuestionario(CuestionarioUni c){
    System.out.println("A continuación, se te harán unas preguntas para que te podamos aconsejar sobre tu carrera universitaria.\nSé honesto");
    Scanner scan1 = new Scanner(System.in);

    int op = 0;
    boolean bandera = false;
    for (int i = 0; i < c.getPreguntas().size(); i++)
    {
      bandera = false;
      System.out.println("\n" + (i+1) + ". " + c.getPreguntas().get(i));
      if (!c.getTipoPreguntas().get(i))
      {
        for (int j = 0; j < c.getOpciones().get(i-4).size(); j++) System.out.println((j + 1)+ ". " + c.getOpciones().get(i-4).get(j));

        while (!bandera)
          try
          {
            System.out.print("Ingresa el número de la opción que más se acople a tu persona...");
            op = scan1.nextInt();

            if ((op >= 1) && (op <= c.getOpciones().get(i-4).size())) bandera = true;
            else System.out.println("\nIngresa únicamente números dentro del rango [1, "+ c.getOpciones().get(i-4).size() + "]");

            c.agregarRespuesta((op) + "");
          }
          catch (InputMismatchException e)
          {
            scan1.next();
            bandera = false;
            System.out.println("Introduce únicamente números enteros.");
          }
      }
      else
      {
        String res = scan1.nextLine();
        c.agregarRespuesta(res);
      }
    }

    return c.getRespuestas();
  }

    public void recomendar(double index){
        try{
            if(index >= 22.5 && index <= 30){
                System.out.println("\n**********Le recomendamos solicitar informacion en UVG**********");
                PaginasInfo.openWebpage("https://www.uvg.edu.gt/");
            } else if (index >= 20 && index < 22.5){
                System.out.println("\n**********Le recomendamos solicitar informacion en USAC**********");
                PaginasInfo.openWebpage("https://www.usac.edu.gt/");
            } else if (index >= 17.5 && index < 20){
                System.out.println("\n**********Le recomendamos solicitar informacion en URL**********");
                PaginasInfo.openWebpage("https://www.principal.url.edu.gt/");
            } else if (index >= 12.5 && index < 17.5){
                System.out.println("\n**********Le recomendamos solicitar informacion en UFM**********");
                PaginasInfo.openWebpage("https://www.ufm.edu/");
            } else if (index > 0 && index < 15.5){
                System.out.println("\n**********Le recomendamos solicitar informacion en UNIS**********");
                PaginasInfo.openWebpage("https://www.unis.edu.gt/");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    @Override
    public double getUniIndex(CuestionarioUni c) {
        double indice = 0;
        try{
            for(int i = 4; i < c.getRespuestas().size(); i ++){
                if(Integer.parseInt(c.getRespuestas().get(i)) == 1){
                    indice = indice + 5;
                } else if (Integer.parseInt(c.getRespuestas().get(i)) == 2){
                    indice = indice + 2.5;
                } else if (Integer.parseInt(c.getRespuestas().get(i)) == 3){
                    indice = indice + 1.5;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return indice;
    }


}
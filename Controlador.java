/**********************
Proyecto POO 
Clase Controlador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Controlador del programa
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/
import java.util.ArrayList;
class Controlador{
  public static void main(String[] args){
    int opcion = 0;
    Vista vista = new Vista();
    Cursos cs = new Cursos();
		PaginasInfo pinfo = new PaginasInfo();
    
    vista.bienvenida();

    /*Se implementa un ciclo While el que leerá el número de opción que desea ejecutar el usuario y así ejecutarlo*/
    while (opcion != 4)
    {
      vista.menuP();
      opcion = vista.queOpcion();
      
      /*cada condición permite el ingreso al método estipulado para cada opción*/
      if (opcion == 1)
      {
        String[][] cursos  = new String[4][4];
        cursos = cs.getCursos();

        int queCurso = vista.mostrarCursos(cursos);

        if (queCurso == 1)
        {
          
        }
        else if (queCurso == 2)
        {

        }
        else if (queCurso == 3)
        {

        }
        else if (queCurso == 4)
        {

        }
        else if (queCurso == 5)
        {

        }
        else if (queCurso == 6)
        {
          
        }
        else if (queCurso == 7)
        {
          
        }
        else if (queCurso == 8)
        {
          
        }
        else if (queCurso == 9)
        {
          
        }
        else if (queCurso == 10)
        {
          
        }
        else if (queCurso == 11)
        {
          
        }
        else
        {

        } 

        Cuestionario cu = new Cuestionario(queCurso);

        int[] respuestas = new int[4];
        respuestas = vista.hacerCuestionario(cu);

        int calificacion = 0;

        for (int i = 0; i < respuestas.length; i++)
          if (respuestas[i] == cu.getRespuesta(i)) calificacion+=25;
        
        //Se muestra el resultado del examen y los consejos para mejorar la nota.
        vista.retroalimentacion(calificacion);
      }
      else if (opcion == 2)
      {
        //Aquí se ejecuta lo que respecta a las universidades.
      }
      else if (opcion == 3)
      {
        Libreta lb = new Libreta();
        
        int eleccion = 0;
        eleccion = vista.queCurso();

        vista.mostrarTutores(eleccion, lb.getLibretaC());
        
				//pinfo.openUVG();
      }
      else if (opcion == 4) vista.despedida();
      else vista.valid1();
    }
  }
}
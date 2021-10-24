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
		Guardador guardador = new Guardador();
    
    vista.bienvenida();

    /*Se implementa un ciclo While el que leerá el número de opción que desea ejecutar el usuario y así llevarlo a cabo.*/
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

        vista.avisoPag();
        if (queCurso == 1) pinfo.open("https://www.khanacademy.org/humanities/world-history");
        else if (queCurso == 2) pinfo.open("https://www.khanacademy.org/science/ap-chemistry-beta");
        else if (queCurso == 3) pinfo.open("https://es.khanacademy.org/science/physics");
        else if (queCurso == 4) pinfo.open("https://es.khanacademy.org/science/biology");
        else if (queCurso == 5) pinfo.open("https://www.teoria.com/es/");
        else if (queCurso == 6) pinfo.open("https://concepto.de/teatro/");
        else if (queCurso == 7) pinfo.open("https://concepto.de/artes-visuales/");
        else if (queCurso == 8) pinfo.open("https://es.khanacademy.org/math/calculus-all-old");
        else if (queCurso == 9) pinfo.open("https://es.khanacademy.org/math/algebra");
        else pinfo.open("https://es.khanacademy.org/math/geometry");
      }
      else if (opcion == 2)
      {
        CuestionarioUni cues = new CuestionarioUni();

        
      }
      else if (opcion == 3)
      {
        Libreta lb = new Libreta();
        
        int eleccion = 0;
        eleccion = vista.queCurso();

        vista.mostrarTutores(eleccion, lb.getLibretaC());
      }
      else if (opcion == 4) vista.despedida();
      else vista.valid1();
    }
  }
}
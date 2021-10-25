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
        //------------------Inicia seteo de las preguntas---------
        CuestionarioUni cues = new CuestionarioUni();
        ArrayList<String> ops = new ArrayList<String>();

        cues.setPregunta("¿Cual es su nombre?");
        cues.setTipo(true);

        cues.setPregunta("¿En qué departamento vive?");
        cues.setTipo(true);

        cues.setPregunta("¿Cómo te ves en 5 años?");
        cues.setTipo(true);

        cues.setPregunta("¿Cómo te ves en 10 años?");
        cues.setTipo(true);
        
        cues.setPregunta("¿Qué asignaturas le han llamado más la atención en el colegio?");
        cues.setTipo(false);
        ops.add("Matemática");
        ops.add("Productividad y desarrollo");
        ops.add("Sociales");
        cues.setOpciones(ops);
        ops = new ArrayList<String>();

        cues.setPregunta("¿Cuáles son sus intereses y aficiones?");
        cues.setTipo(false);
        ops.add("Ser científico");
        ops.add("Tener un negocio propio");
        ops.add("Estudiar fenómenos relacionados con el ser humano");
        cues.setOpciones(ops);
        ops = new ArrayList<String>();

        cues.setPregunta("¿Qué carrera o carreras tiene en mente para estudiar?");
        cues.setTipo(false);
        ops.add("Ingeniería");
        ops.add("Negocios");
        ops.add("Ciencias sociales");
        cues.setOpciones(ops);
        ops = new ArrayList<String>();

        cues.setPregunta("¿Cómo describiría su trabajo ideal?");
        cues.setTipo(false);
        ops.add("En un laboratorio o área de producción");
        ops.add("En una oficina");
        ops.add("Trabajo de campo");
        cues.setOpciones(ops);
        ops = new ArrayList<String>();

        cues.setPregunta("¿Le gusta la ciencia?");
        cues.setTipo(false);
        ops.add("Sí");
        ops.add("No");
        cues.setOpciones(ops);
        ops = new ArrayList<String>();

        cues.setPregunta("¿Le gustan los negocios?");
        cues.setTipo(false);
        ops.add("Sí");
        ops.add("No");
        cues.setOpciones(ops);
        ops = new ArrayList<String>();
        //------------------------Finaliza el seteo--------------

        //Comienzan las preguntas.
        vista.hacerCuestionario(cues);
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
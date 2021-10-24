/**********************
Proyecto POO
Clase Cursos
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará de los cursos que nuestro programa (servicio) proporcionará.
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/

public class Cursos{
  private String[][] cursos;
// Función que muestra una matriz de las clases de cursos de cada una.

  /********************************
     * @param: -
     * @return: -
     */
  //Constructor de la clase.
  public Cursos(){
    cursos = new String[4][4];

    //Asignación de las áreas que tenemos.
    cursos[0][0]="Humanidades";
    cursos[0][1]="Ciencias";
    cursos[0][2]="Arte";
    cursos[0][3]="Matemáticas";

    //Asignación del curso de humanidades.
    cursos[1][0]="Historia";

    //Asignación de los cursos de ciencias.
    cursos[1][1]="Química";
    cursos[2][1]="Física";
    cursos[3][1]="Biología";

    //Asignación de los cursos de arte.
    cursos[1][2]="Música";
    cursos[2][2]="Teatro";
    cursos[3][2]="Pintura";

    //Asignación de los cursos de matemáticas.
    cursos[1][3]="Cálculo";
    cursos[2][3]="Álgebra";
    cursos[3][3]="Geometría";
  }

  /********************************
     * @param: -
     * @return: Una matriz con los cursos.
     */
  public String[][] getCursos(){
    return cursos;
  }
}
public class Cursos{
  private String[][] cursos;

  public Cursos(){
    cursos = new String[3][4];

    //Asignación de las áreas que tenemos.
    cursos[0][0]="Humanidades";
    cursos[0][1]="Ciencias";
    cursos[0][2]="Diseño";
    cursos[0][3]="Matemáticas";

    //Asignación de los cursos de humanidades.
    cursos[1][0]="Filosofía";
    cursos[2][0]="Ética";
    cursos[3][0]="Antropología";

    //Asignación de los cursos de ciencias.
    cursos[1][1]="Química";
    cursos[2][1]="Física";
    cursos[3][1]="Biología";

    //Asignación de los cursos de diseño.
    cursos[1][0]="Dibujo mecánico";
    cursos[2][0]="";
    cursos[3][0]="Antropología";
  }
}
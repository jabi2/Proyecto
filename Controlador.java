/**********************
Proyecto POO 
Clase Controlador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Controlador del programa
Version: 1.0
Ultima actualizacion: 12 de septiembre
******************************************************************/

class Controlador{
  public static void main(String[] args){
    int opcion = 0;
    Vista vista = new Vista();
    
    vista.bienvenida();

    /*Se implementa un ciclo While el que leerá el número de opción que desea ejecutar el usuario y así ejecutarlo*/
    while (opcion != 4)
    {
      vista.menuP();
      opcion = vista.queOpcion();
      
      /*cada condición permite el ingreso al método estipulado para cada opción*/
      if (opcion == 1)
      {
        //Aquí se ejecuta lo que respecta a los cursos.
      }
      else if (opcion == 2)
      {
        //Aquí se ejecuta lo que respecta a los programas universitarios.
      }
      else if (opcion == 3)
      {
        //Aquí se ejecuta lo que respecta a los contactos para tutorías.
      }
      else if (opcion == 4) vista.despedida();
      else vista.valid1();
    }
  }
}
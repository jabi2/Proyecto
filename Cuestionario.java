/**********************
Proyecto POO 
Clase Cuestionario
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará de generar el cuestionario con las preguntas y sus respectivas respuestas.
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/
import java.util.ArrayList;

public abstract class Cuestionario{

  //Declaración de propiedades.
  private ArrayList<String> preguntas;

  //Nota: si es true, entonces la pregunta es abierta, de lo contrario, es cerrada.
  private ArrayList<Boolean> tipoPreguntas;

  //Para las preguntas cerradas.
  private ArrayList<ArrayList<String>> opciones;

  private ArrayList<String> respuestas;


  //Constructor de la clase.
  public Cuestionario(){
    //Instancias de los ArrayLists.
    preguntas = new ArrayList<String>();
    tipoPreguntas = new ArrayList<Boolean>();
    opciones = new ArrayList<ArrayList<String>>();
    respuestas = new ArrayList<String>();
  }

  public abstract void setPregunta(String ps);

  public abstract void setTipo(boolean r);

  public abstract void setOpciones(ArrayList<String> ops);

  public ArrayList<String> getPreguntas(){
    return preguntas;
  }

  public ArrayList<Boolean> getTipoPreguntas(){
    return tipoPreguntas;
  }

  public ArrayList<ArrayList<String>> getOpciones(){
    return opciones;
  }

  public ArrayList<String> getRespuestas(){
    return respuestas;
  }
}
/**********************
Proyecto POO 
Clase Cuestionario
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará de generar el cuestionario con las preguntas y sus respectivas respuestas.
Version: 1.0
Ultima actualizacion: 24 de octubre
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

  /********************************
     * @param: El string de la pregunta.
     * @return: -
     */
  public abstract void setPregunta(String ps);

  /********************************
     * @param: Un valor de verdad para representar si la pregunta es abierta (true) o cerrada (false).
     * @return: -
     */
  public abstract void setTipo(boolean r);

  /********************************
     * @param: Un ArrayList tipo String con las opciones para responder.
     * @return: -
     */
  public abstract void setOpciones(ArrayList<String> ops);

  /********************************
     * @param: -
     * @return: El ArrayList tipo String de las preguntas.
     */
  public ArrayList<String> getPreguntas(){
    return preguntas;
  }

  /********************************
     * @param: -
     * @return: El ArrayList tipo boolean del tipo de preguntas.
     */
  public ArrayList<Boolean> getTipoPreguntas(){
    return tipoPreguntas;
  }

  /********************************
     * @param: -
     * @return: El ArrayList tipo ArrayList tipo string con las opciones.
     */
  public ArrayList<ArrayList<String>> getOpciones(){
    return opciones;
  }

  /********************************
     * @param: -
     * @return: El ArrayList tipo string con las respuestas por parte del usuario.
     */
  public ArrayList<String> getRespuestas(){
    return respuestas;
  }
}
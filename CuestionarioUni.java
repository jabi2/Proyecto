/**********************
Proyecto POO 
Clase Cuestionario
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará de generar el cuestionario especializado para recomendar universidades basándose en las respuestas del usuario.
Version: 1.0
Ultima actualizacion: 24 de octubre
******************************************************************/
import java.util.ArrayList;

public class CuestionarioUni extends Cuestionario{
  //Constructor de la clase.
  public CuestionarioUni(){
    super();
  }
  
  /********************************
     * @param: El string de la pregunta.
     * @return: -
     */
  public void setPregunta(String ps){
    getPreguntas().add(ps); 
  }

  /********************************
     * @param: Un valor de verdad para representar si la pregunta es abierta (true) o cerrada (false).
     * @return: -
     */
  public void setTipo(boolean r){
    getTipoPreguntas().add(r);
  }

  /********************************
     * @param: Un ArrayList tipo String con las opciones para responder.
     * @return: -
     */
  public void setOpciones(ArrayList<String> ops){
    getOpciones().add(ops);
  }

  /********************************
     * @param: Un string que representa la respuesta del usuario.
     * @return: -
     */
  public void agregarRespuesta(String r){
    getRespuestas().add(r);
  }
}

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

public int getUniIndex() {
        var uni_index = 0;
        var respuesta = 0;
        ArrayList<String> matIndex = this.getRespuestas();
        for (int i = 4; i < matIndex.size(); i++) {
            if (i == 4) {
                respuesta = Integer.parseInt(matIndex.get(i));
                if (respuesta == 1) {
                    uni_index = 50;
                } else if (respuesta == 2) {
                    uni_index = 30;
                } else if (respuesta == 3) {
                    uni_index = 20;
                }
            } else if (i == 5) {
                respuesta = Integer.parseInt(matIndex.get(i));
                if (respuesta == 1) {
                    uni_index = 50;
                } else if (respuesta == 2) {
                    uni_index = 20;
                } else if (respuesta == 3) {
                    uni_index = 10;
                }
            } else if (i == 6) {
                respuesta = Integer.parseInt(matIndex.get(i));
                if (respuesta == 1) {
                    uni_index = 100;
                } else if (respuesta == 2) {
                    uni_index = 50;
                } else if (respuesta == 3) {
                    uni_index = 30;
                }
            } else if (i == 7) {
                respuesta = Integer.parseInt(matIndex.get(i));
                if (respuesta == 1) {
                    uni_index = 65;
                } else if (respuesta == 2) {
                    uni_index = 35;
                } else if (respuesta == 3) {
                    uni_index = 15;
                }
            } else if (i == 8) {
                respuesta = Integer.parseInt(matIndex.get(i));
                if (respuesta == 1) {
                    uni_index = 25;
                } else if (respuesta == 2) {
                    uni_index = 15;
                }
            } else if (i == 9) {
                respuesta = Integer.parseInt(matIndex.get(i));
                if (respuesta == 1) {
                    uni_index = 15;
                } else if (respuesta == 2) {
                    uni_index = 5;
                }
            }
        }
        return uni_index;
    }

}

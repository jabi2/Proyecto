/**********************
Proyecto POO 
Clase Cuestionario
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará de generar el cuestionario con las preguntas y sus respectivas respuestas.
Version: 1.0
Ultima actualizacion: 3 de octubre
******************************************************************/
import java.util.ArrayList;

public class CuestionarioUni extends Cuestionario{
  public CuestionarioUni(){
    super();
  }

  public void setPregunta(String ps){
    getPreguntas().add(ps); 
  }

  public void setTipo(boolean r){
    getTipoPreguntas().add(r);
  }

  public void setOpciones(ArrayList<String> ops){
    getOpciones().add(ops);
  }

  public void agregarRespuesta(String r){
    getRespuestas().add(r);
  }
}

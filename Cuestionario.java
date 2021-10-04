

public class Cuestionario{
  private String pregunta1;
  private int respuesta1;

  private String pregunta2;
  private int respuesta2;

  private String pregunta3;
  private int respuesta3;

  private String pregunta4;
  private int respuesta4;

  private String[] opciones;

  public Cuestionario(int indice){
    if (indice == 1)
    {
      //Seteo de las preguntas y respuestas para filosofía.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 2)
    {
      //Seteo de las preguntas y respuestas para ética.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 3)
    {
      //Seteo de las preguntas y respuestas para historia.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 4)
    {
      //Seteo de las preguntas y respuestas para química.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 5)
    {
      //Seteo de las preguntas y respuestas para física.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 6)
    {
      //Seteo de las preguntas y respuestas para biología.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 7)
    {
      //Seteo de las preguntas y respuestas para música.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 8)
    {
      //Seteo de las preguntas y respuestas para teatro.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 9)
    {
      //Seteo de las preguntas y respuestas para pintura.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0; 

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 10)
    {
      //Seteo de las preguntas y respuestas para cálculo.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else if (indice == 11)
    {
      //Seteo de las preguntas y respuestas para álgebra.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
    else
    {
      //Seteo de las preguntas y respuestas para geometría.
      pregunta1 = "";
      respuesta1 = 0;

      pregunta2 = "";
      respuesta2 = 0;

      pregunta3 = "";
      respuesta3 = 0;

      pregunta4 = "";
      respuesta4 = 0;

      opciones = new String[3];
      opciones[0] = "";
      opciones[1] = "";
      opciones[2] = "";
    }
  }

  public String getPregunta(int n){
    if (n == 0) return pregunta1;
    else if (n == 1) return pregunta2;
    else if (n == 2) return pregunta3;
    else return pregunta4;
  }

  public int getRespuesta(int n){
    if (n == 0) return respuesta1;
    else if (n == 1) return respuesta2;
    else if (n == 2) return respuesta3;
    else return respuesta4;
  }

  public String[] getOpciones(){
    return opciones;
  }
}
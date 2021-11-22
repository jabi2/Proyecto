/**********************
Proyecto POO 
Interfaz Estimador
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Interfaz que sirve para sacar promedios de puntaje de un cuestionario
Version: 1.0
Ultima actualizacion: 21 de noviembre de 2021
******************************************************************/

public interface Estimador {

    /**
     *
     * @param c - CuestionarioUni
     * @return
     */
    public double getUniIndex(CuestionarioUni c);
}

/**********************
Proyecto POO
Clase PaginasInfo
Autores: Javier Bocanegra, Lucy Elías, Juan Marroquín y Herber Silva.
Descripcion: Clase que se encargará de guardar y abrir los links de las paginas web usadas.
Version: 1.0
Ultima actualizacion: 10 de octubre
******************************************************************/
//NOTA IMPORTANTE: La funcionalidad de abrir páginas web solo aplica cuando el programa está descargado en la computadora.

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

public class PaginasInfo
{
	public static void openWebpage(String urlString) {
    try {
      Desktop.getDesktop().browse(new URL(urlString).toURI());
 	  } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /********************************
     * @param: El link de la página web.
     * @return: -
     */
  public void open(String pag){
    openWebpage(pag);
  }

  /********************************
     * @param: -
     * @return: -
     */
	public void openUVG()
	{
		openWebpage("https://www.uvg.edu.gt");
	}

  /********************************
     * @param: -
     * @return: -
     */
	public void openHis()
	{
		openWebpage("https://www.khanacademy.org/humanities/world-history");
	}

  /********************************
     * @param: -
     * @return: -
     */
	public void openQui()
	{
		openWebpage("https://www.khanacademy.org/science/ap-chemistry-beta");
	}
  
  /********************************
     * @param: -
     * @return: -
     */
  public void openFis()
	{
		openWebpage("https://es.khanacademy.org/science/physics");
	}

  /********************************
     * @param: -
     * @return: -
     */
	public void openBio()
	{
		openWebpage("https://es.khanacademy.org/science/biology");
	}

  /********************************
     * @param: -
     * @return: -
     */
  public void openMusic()
	{
		openWebpage("pendiente");
	}

  /********************************
     * @param: -
     * @return: -
     */
  public void openTeatro()
	{
		openWebpage("pendiente");
	}

  /********************************
     * @param: -
     * @return: -
     */
  public void openPintura()
	{
		openWebpage("pendiente");
	}

  /********************************
     * @param: -
     * @return: -
     */
  public void openCalculo()
	{
		openWebpage("https://es.khanacademy.org/math/calculus-all-old");
	}

	/********************************
     * @param: -
     * @return: -
     */
  public void openAlgebra()
	{
		openWebpage("https://es.khanacademy.org/math/algebra");
	}

  /********************************
     * @param: -
     * @return: -
     */
  public void openGeometría()
	{
		openWebpage("https://es.khanacademy.org/math/geometry");
	}

}


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


import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

class PaginasInfo
{
	public static void openWebpage(String urlString) {
  try {
     Desktop.getDesktop().browse(new URL(urlString).toURI());
 	} catch (Exception e) {
      e.printStackTrace();
  }
}

	public void openUVG()
	{
		openWebpage("https://www.uvg.edu.gt");
	}

	public void openHis()
	{
		openWebpage("https://www.khanacademy.org/humanities/world-history");
	}

	public void openQui()
	{
		openWebpage("https://www.khanacademy.org/science/ap-chemistry-beta");
	}
	
  public void openFis()
	{
		openWebpage("https://es.khanacademy.org/science/physics");
	}

	public void openBio()
	{
		openWebpage("https://es.khanacademy.org/science/biology");
	}

  	public void openMusic()
	{
		openWebpage("pendiente");
	}

  	public void openTeatro()
	{
		openWebpage("pendiente");
	}

  	public void openPintura()
	{
		openWebpage("pendiente");
	}

  	public void opencalculo()
	{
		openWebpage("https://es.khanacademy.org/math/calculus-all-old");
	}

	public void openalgebra()
	{
		openWebpage("https://es.khanacademy.org/math/algebra");
	}

  	public void openalgeometría()
	{
		openWebpage("https://es.khanacademy.org/math/geometry");
	}

}
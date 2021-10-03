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
}
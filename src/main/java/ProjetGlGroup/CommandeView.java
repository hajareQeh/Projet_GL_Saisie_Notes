package ProjetGlGroup;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CommandeView implements Commande{

	
	@Override
	public void execute(String fichier) throws IOException, URISyntaxException {
		if(Commande.noteExist(fichier)==true)
		{
			Desktop desktop = Desktop.getDesktop();
			desktop.browse(new URI ("C://Users//Winsido//Desktop//GIT//ProjetGl//fichier//"+fichier.replaceAll(" ", "")+".html"));
		}
		else 
		{
			System.out.println("La note n'existe pas");
		}
		//desktop.browse(new URI ("http://google.fr"));
	}

}

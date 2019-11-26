package ProjetGlGroup;

import java.io.IOException;
import java.net.URISyntaxException;

public class CommandeExit implements Commande{

	
	@Override
	public void execute(String fichier) throws IOException, URISyntaxException {
		System.out.println("Vous avez fini");
		System.exit(0);
	}

}

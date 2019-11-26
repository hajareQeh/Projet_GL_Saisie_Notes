package ProjetGlGroup;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import org.asciidoctor.AsciiDocDirectoryWalker;
import org.asciidoctor.DirectoryWalker;

public interface Commande {
	
	
	public void execute(String fichier) throws IOException, URISyntaxException, InterruptedException;
	/**Verif si le fichier exist ou pas 
	 * @param nomFichier
	 * @return 
	 */
	public static boolean noteExist(String nomFichier)
	{
		DirectoryWalker directoryWalker = new AsciiDocDirectoryWalker("C://Users//Winsido//Desktop//GIT//ProjetGl//fichier//"); 
		List<File> asciidocFiles = directoryWalker.scan(); 
		String fileName;
		for (File file : asciidocFiles) {
			fileName = file.getName().replaceAll("[.][^.]+$", "");
			if(fileName.equals(nomFichier))
			{
				return true;
			}
		}
		return false;
	}

}


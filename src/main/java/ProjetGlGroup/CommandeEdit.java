package ProjetGlGroup;

import static org.asciidoctor.Asciidoctor.Factory.create;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Options;
import org.asciidoctor.OptionsBuilder;
import org.asciidoctor.SafeMode;


public class CommandeEdit implements Commande{

	@Override
	public void execute(String fichier) throws IOException, InterruptedException {
		Process p = new ProcessBuilder("C:\\Program Files\\Sublime Text 2\\sublime_text.exe", "C:\\Users\\Winsido\\Desktop\\GIT\\ProjetGl\\fichier\\"+fichier.replaceAll(" ", "")+".adoc").start();
		Asciidoctor asciidoctor = create();
		p.waitFor();
		asciidoctor.convertFile(new File("C:\\Users\\Winsido\\Desktop\\GIT\\ProjetGl\\fichier\\"+fichier.replaceAll(" ", "")+".adoc"), OptionsBuilder.options().safe(SafeMode.UNSAFE));
	}

}

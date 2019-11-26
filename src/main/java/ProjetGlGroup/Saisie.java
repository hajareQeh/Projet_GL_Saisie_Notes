package ProjetGlGroup;
import static org.asciidoctor.Asciidoctor.Factory.create;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static org.asciidoctor.OptionsBuilder.options;
import org.asciidoctor.*;
import ProjetGlGroup.*;



/**
 * Hello world!
 *
 */
public class Saisie 
{
	Commande cmd;
	public Saisie() throws IOException, URISyntaxException, InterruptedException
	{
		Asciidoctor asciidoctor = create();
		String t = "Hello *Man*", monInsert;
		String[] words;
		Scanner sc = new Scanner(System.in);
		CmdEnum cmdEnum=null;
		do
		{
			/*String[] result = asciidoctor.convertDirectory(
    		    new AsciiDocDirectoryWalker("Nouveaudocumenttexte.adoc"),
    		    new HashMap<String, Object>());
    	System.out.println(result.toString());
    		for (String html : result) {
    		    System.out.println();
    		}*/
			/* Lecture fichier externe et generation de son HTML
			 * String output = asciidoctor.convertFile(new File("Questions.txt"), new HashMap<String, Object>());*/

			/* Pour ajouter des attribut 'Je ne sais pas trop a quoi ils servent'
			 * Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put("backend", "docbook"); 

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("attributes", attributes); 
		options.put("in_place", true); 

		String outfile = asciidoctor.convertFile(new File("Questions.txt"), options);*/

			/*Pour avoir tout les document .adoc d'une arborescence
			 * DirectoryWalker directoryWalker = new AsciiDocDirectoryWalker("../"); 
		List<File> asciidocFiles = directoryWalker.scan(); 
		for (File file : asciidocFiles) {
			System.out.println(file.getName());
		}*/

			/*Lecture texte clavier et generation du HTML
			 * Scanner sc = new Scanner(System.in);
		String table = sc.nextLine();
		String output = asciidoctor.convert(table, new HashMap<String, Object>());
		System.out.println(output);*/

			/*Lecture d'une entrée texte et generation de son HTML en mode stylé
		Scanner sc = new Scanner(System.in);
		String table = sc.nextLine();Asciidoctor asciidoctors = Asciidoctor.Factory.create(); 
		asciidoctors.convert(                                
				table,
				OptionsBuilder.options()                        
				.toFile(new File("Mon test.html"))
				.safe(SafeMode.UNSAFE));*/

			/*Scanner sc = new Scanner(System.in);
		String table ="";
		do
		{
			if("toto".equals(table) == false)
			{
				table = sc.nextLine();
			}
		}while("toto".equals(table) == false);
		Asciidoctor asciidoctors = Asciidoctor.Factory.create(); 
		asciidoctors.convert(                                
				table,
				OptionsBuilder.options()                        
				.toFile(new File("Mon test.html"))
				.safe(SafeMode.UNSAFE));*/

			/*Ouverture process externe
			 * try
		{
			//processBuilder.command("C:\\Program Files\\Sublime Text 2\\sublime_text.exe");
			Process p = new ProcessBuilder("C:\\Program Files\\Sublime Text 2\\sublime_text.exe", "toto.txt").start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/

			/*Ouveture navigateur fichier dans le navigateur
			 * 
		Desktop desktop = Desktop.getDesktop();
		desktop.browse(new URI ("C://Users//Winsido//Desktop//GIT//ProjetGl//target//Titre1.html"));
		desktop.browse(new URI ("http://google.fr"));
			 */
			//monInsert = sc.nextLine();
			//CmdEnum cmdEnum = CmdEnum;
			String x= CmdEnum.List.getCmd();
			/*if(insert.equals("undo"))
		{
			return true;
		}*/
			//return false;
			//System.out.println(cmdEnum.getCmd());
			System.out.println("Bonjour ! Que voullez vous faire ? [Press 'exit' to end]");
			BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Entrez votre texte");
			words = bufferedReader.readLine().split(" ",2);
			//System.out.println("Mot 1 " + words[0]);
			//System.out.println("Mot 2 " + words[1]);
			try
			{
				cmdEnum = insertIsInsideEnum(words[0]);

				if(cmdEnum != null)
				{
					cmdEnum.action(words[1]);
				}
				else 
				{
					System.out.println("Entrée incorrecte");
				}


			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}while(0==0);
	}
	public CmdEnum insertIsInsideEnum(String insert)
	{
		CmdEnum r=null;
		CmdEnum t[] = CmdEnum.values();
		for (CmdEnum cmdEnum : t) {
			if(cmdEnum.getCmd().equals(insert))
			{
				r = cmdEnum;
				return r;
			}
		}
		return r;
	}	
}

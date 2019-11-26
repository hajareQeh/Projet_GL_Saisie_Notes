package ProjetGlGroup;

import java.io.IOException;
import java.net.URISyntaxException;
import ProjetGlGroup.CommandeEdit;;


public enum CmdEnum {
		Edit("e")
		{
			@Override
			public void action(String fichier) throws IOException, URISyntaxException, InterruptedException {
				commande = new CommandeEdit();
				commande.execute(fichier);
				
			}
		},
		Editt("edit")
		{
			@Override
			public void action(String fichier) throws IOException, URISyntaxException, InterruptedException {
				commande = new CommandeEdit();
				commande.execute(fichier);
			}
		},
		List("ls")
		{
			@Override
			public void action(String fichier) {
				
				
			}
		},
		Listt("list")
		{
			@Override
			public void action(String fichier) {
			}
		},
		Delete("d")
		{
			@Override
			public void action(String fichier) {
				
			}
		},
		Deletee("delete")
		{
			@Override
			public void action(String fichier) {
				
			}
		},
		View("v")
		{
			@Override
			public void action(String fichier) throws IOException, URISyntaxException, InterruptedException {
				commande = new CommandeView();
				commande.execute(fichier);
				
			}
		},
		Vieww("view")
		{
			@Override
			public void action(String fichier) throws IOException, URISyntaxException, InterruptedException {
				commande = new CommandeView();
				commande.execute(fichier);
			}
		},
		Search("s")
		{
			@Override
			public void action(String fichier) {
				
			}
		},
		Searchh("search")
		{
			@Override
			public void action(String fichier) {
				
			}
			
		},
		exit("exit")
		{
			@Override
			public void action(String fichier) throws IOException, URISyntaxException, InterruptedException {
				commande = new CommandeExit();
				commande.execute(fichier);
			}
		},;
	Commande commande;
	String cmd;
	private CmdEnum (String cmd)
	{
		this.cmd = cmd;
	}
	public Commande getCommande() {
		return commande;
	}
	public String getCmd() {
		return cmd;
	}
	public String getCmdValue(String cmd) {
		return cmd.valueOf(cmd);
	}
	public abstract void action(String fichier) throws IOException, URISyntaxException, InterruptedException;

}


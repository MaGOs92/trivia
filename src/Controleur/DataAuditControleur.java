package Controleur;

import java.awt.Toolkit;

import javax.swing.JFrame;

import com.mysql.jdbc.Connection;

import Modele.DataAuditModele;
import Vue.DataAuditPanel;

public class DataAuditControleur {
	
	Connection co;
	CoImpControleur coImpControler;
	JFrame fenetre;
	DataAuditPanel DAPanel;
	DataAuditModele DAModele;
	String pathFichier;
	
	public CoImpControleur getCoImpControler() {
		return coImpControler;
	}

	public void setCoImpControler(CoImpControleur coImpControler) {
		this.coImpControler = coImpControler;
	}

	public String getPathFichier() {
		return pathFichier;
	}

	public void setPathFichier(String pathFichier) {
		this.pathFichier = pathFichier;
	}

	public Connection getCo() {
		return co;
	}

	public void setCo(Connection co) {
		this.co = co;
	}

	public JFrame getFenetre() {
		return fenetre;
	}

	public void setFenetre(JFrame fenetre) {
		this.fenetre = fenetre;
	}

	public DataAuditPanel getDAPanel() {
		return DAPanel;
	}

	public void setDAPanel(DataAuditPanel dAPanel) {
		DAPanel = dAPanel;
	}

	public DataAuditModele getDAModele() {
		return DAModele;
	}

	public void setDAModele(DataAuditModele dAModele) {
		DAModele = dAModele;
	}

	DataAuditControleur(CoImpControleur coImpControler, Connection co, DataAuditModele DAModele, String pathFichier){
		
		this.setCoImpControler(coImpControler);
		
		this.setCo(co);
		
		this.setDAModele(DAModele);
		
		this.setPathFichier(pathFichier);
		
		this.setFenetre(this.creerFenetre());
		
		this.setDAPanel(new DataAuditPanel(this));
		
		getFenetre().add(getDAPanel());
		
	}
	
	public JFrame creerFenetre()
	{	
		// Cr�ation de la fenetre
		
		JFrame fenetre = new JFrame ("Trivia DataDiscovery");
		fenetre.setSize(800, 600);
		fenetre.setResizable(false);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setIconImage(Toolkit.getDefaultToolkit().getImage("Img\\icone.png")); 
		fenetre.setTitle("Trivia DataDiscovery");
		fenetre.setLocationRelativeTo(null); // Place la fenetre au milieu de l'�cran
	
		fenetre.setVisible(true);
		
		return fenetre;

	}
}

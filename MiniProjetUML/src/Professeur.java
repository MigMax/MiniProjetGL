import java.util.*;
public class Professeur {
	
	// Variables 
	
	
	private ArrayList <Etudiant>tabEtu;
	private String nom;
	private String prenom;
	
	
	
	//Getters and Setters
	
	
	public ArrayList<Etudiant> getTabEtu() {
		return tabEtu;
	}
	public void setTabEtu(ArrayList<Etudiant> tabEtu) {
		this.tabEtu = tabEtu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	// Constructeur 
	

	
	public Professeur(String nom , String prenom , ArrayList<Etudiant> tabEtu){
		
		this.nom=nom;
		this.prenom=prenom;
		this.tabEtu=tabEtu;
		
	
	}
		
	public Professeur(){
		
		
		this.nom=" ";
		this.prenom=" ";
		this.tabEtu= new ArrayList();
		
		
		
	}
	
	
	// Methodes
	
	public void ajouterNote(float note, int id ){
		
		for(Etudiant etu : tabEtu){
			
			if (etu.getId()==id){
				
				etu.getTabnote().add(note);
				
			}
			
			
		}
		
		
	}
	
	
	
 	public String toString (){
		
		String s = "Professeur : Nom= "+this.nom+" Prenom = "+this.prenom+this.getTabEtu().toString();
		
		return s;
		
	}
}

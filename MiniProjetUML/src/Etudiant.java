import java.util.*;


public class Etudiant {
	
	//Variables
	
	
	private ArrayList<Float> tabnote;
	private String nom ;
	private String prenom; 
	private int id ;
	
	
	// Getters and Setters 


	public ArrayList<Float> getTabnote() {
		return tabnote;
	}
	public void setTabnote(ArrayList<Float> tabnote) {
		this.tabnote = tabnote;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	
	
	
	// Constructeur 
	
	
	public Etudiant(String nom , String prenom , ArrayList<Float> tabnote, int id){
		
		this.nom=nom;
		this.prenom=prenom;
		this.tabnote=tabnote;
		this.id=id;
	
	}
		
	public Etudiant(){
		
		
		this.nom=" ";
		this.prenom=" ";
		this.tabnote= new ArrayList();
		this.id=0;
		
		
	}
	
	
	// Methodes 
	
	
	
	public void  affiche(){
		
		for(int i =0 ; i< this.getTabnote().size() ; i++){
			
			System.out.println("Note :"+this.getTabnote().get(i));

		}
		
	}
	
	
	public void moyenne(){
		
		float moyenne=0 ;
		
		for(int i =0 ; i< this.getTabnote().size() ; i++){
		
		moyenne += this.getTabnote().get(i);
		
		}
		moyenne=moyenne/this.getTabnote().size();
		System.out.println("Moyenne : "+moyenne); 
		
	}
	
	
	
		public String toString(){
		
		String s = "Etudiant : Nom= "+this.nom+" Prenom = "+this.prenom+" Id= "+this.id;
		return s ;
		
		
	}
	

}

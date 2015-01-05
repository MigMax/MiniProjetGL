import java.util.ArrayList;

public class Professeur {
	
	private ArrayList<Etudiant> mesEtudiants;
	
	public Professeur(ArrayList<Etudiant> lesEtudiants){
		this.mesEtudiants=lesEtudiants;
	}
	
	public Professeur(){
		this.mesEtudiants= new ArrayList<Etudiant>();
	}
	
	public void listeMesEtudiant(){
		
		System.out.print("Liste de mes Etudiant :\n");
		for(Etudiant etudiant:this.mesEtudiants){
		System.out.println(etudiant.getNom()+" "+etudiant.getPrenom()+" Moyenne :"+etudiant.getMoyenne());
		}
		
	}
	
	public void afficherTousLesEtudiants(ArrayList<Etudiant> lesEtudiants){
		for(Etudiant etudiant:lesEtudiants){
			System.out.println(lesEtudiants.indexOf(etudiant)+"-"+etudiant.getNom()+" "+etudiant.getPrenom()+" Moyenne :"+etudiant.getMoyenne());
			}
	}
	
	public Etudiant ajouterUnEtudiant(String nom, String prenom, String id, String password ,ArrayList<Etudiant> desEtudiants){
		Etudiant etu = new Etudiant(nom, prenom, id, password);
		desEtudiants.add(new Etudiant(nom, prenom, id, password));
		return etu;
	}
	
	public boolean editerNote(Note note, float nouvelleNote){
		if(nouvelleNote>=0 && nouvelleNote>=20){
			note.setValue(nouvelleNote);
			return true;
		}
		return false;
	}

}

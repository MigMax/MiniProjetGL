import java.util.*;

public class test {
	
	public static void main( String args []){
		
		ArrayList<Float> tab = new ArrayList<Float>();
	
		tab.add((float)12);
		tab.add((float)5);
		tab.add((float)8);
		tab.add((float)18);
		tab.add((float)8);
		
		
		Etudiant et = new Etudiant("Nom","Prenom",tab, 15);
		
		
		et.affiche();
		et.moyenne();
		
	
	ArrayList<Etudiant> tabEtu = new ArrayList<Etudiant>();
	
	tabEtu.add(et);
	float note = 12; 
	
	Professeur p = new Professeur("Nom","Prenom",tabEtu); 
	p.ajouterNote(note, 15); 
	
	et.affiche();
	
	
	
	}
}

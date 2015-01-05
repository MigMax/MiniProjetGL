import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Etudiant> lesEtudiants = new ArrayList<Etudiant>();
		
		ArrayList<Note> notesMarie = new ArrayList<Note>();
		Note notem1 = new Note("BDD", 12);
		Note notem2 = new Note("Anglais", 15);
		notesMarie.add(notem1);
		notesMarie.add(notem2);
		Etudiant marie = new Etudiant("Marie", "Joselin", notesMarie);
		
		
		
		ArrayList<Note> notesRudy = new ArrayList<Note>();
		Note noter1 = new Note("BDD", 9);
		Note noter2 = new Note("Anglais", 10);
		notesRudy.add(noter1);
		notesRudy.add(noter2);
		Etudiant rudy = new Etudiant("Rudy", "Clement", notesRudy);
		
		
		
		ArrayList<Note> notesJule = new ArrayList<Note>();
		Note notej1 = new Note("BDD", 18);
		Note notej2 = new Note("Anglais", 14);
		notesRudy.add(notej1);
		notesRudy.add(notej2);
		Etudiant jule = new Etudiant("Jule", "Nidasse", notesJule);
		
		lesEtudiants.add(marie);
		lesEtudiants.add(rudy);
		lesEtudiants.add(jule);
		
		
		Professeur prof = new Professeur(lesEtudiants);
		prof.listeMesEtudiant();
		
		InterfaceUtil interf = new InterfaceUtil();
		
		boolean quitter = true;
		while(quitter){
			int teste = interf.welcome();
			
			if(teste==1){
				while(true){
					int testeProf = interf.interfaceProf();
				
					if(testeProf==1){//Editer un élève
						
					
					}
					if(testeProf==2){//Ajouter un élève
					
					}
					if(testeProf==3){//quitter
						break;
					}
				}
			}
			
			if(teste==2){
				boolean testeEtud = true;
				while(testeEtud){
					String[] saisie = interf.saisirIdentification();
					if(interf.etudiantValide(saisie[0], saisie[1], lesEtudiants)){
						
					}
				}
					
			}
			
			if(teste==3){
				quitter=false;
			}
		}
		System.out.println("Fin du programme");
	}
}

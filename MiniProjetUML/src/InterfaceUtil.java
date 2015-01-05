import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author KutMiZat
 *
 */
public class InterfaceUtil {
	
	public InterfaceUtil(){
		
	}
	
	public int welcome(){
		int scanInput = 0;
		Scanner in = new Scanner(System.in);
		while(!(scanInput>=1 && scanInput<=3)){
			System.out.println("Vous êtes :");
			System.out.println("-1 Un(e) étudiant(e)");
			System.out.println("-2 Un professeur");
			System.out.println("-3 Quitter");
			System.out.print("Saisir votre choix :");
			if(in.hasNextInt()){
				scanInput=in.nextInt();
			}
			if(scanInput==1){
				scanInput=1;
			}else if(scanInput==2){
				scanInput=2;
			}else if(scanInput==3){
				scanInput=3;
			}
		}
		in.close();
		return scanInput;
	}
	
	public int formulaireAjoutEtudiant(){
		String scanInput = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Ajouer un(u) étudiant(e): (entrer 'quit' pour quitter)");
		System.out.println("Nom: ");
		if(in.hasNextLine()){
			scanInput=in.nextLine();
		}
		System.out.println("Prenom: ");
		if(in.hasNextLine()){
			scanInput=in.nextLine();
		}
		System.out.println("Identifiant: ");
		if(in.hasNextLine()){
			scanInput=in.nextLine();
		}
		System.out.print("Mot de passe: ");
		if(in.hasNextLine()){
			scanInput=in.nextLine();
		}
	
		in.close();
		return scanInput;
	}
	
	public int interfaceProf(){
		int scanInput = 0;
		Scanner in = new Scanner(System.in);
		while(!(scanInput>=1 && scanInput<=3)){
			System.out.println("Vous êtes :");
			System.out.println("-1 Editer un élève");
			System.out.println("-2 Ajouter un élève");
			System.out.println("-3 Quitter");
			System.out.print("Saisir votre choix :");
			if(in.hasNextInt()){
				scanInput=in.nextInt();
			}
			if(scanInput==1){
				scanInput=1;
			}else if(scanInput==2){
				scanInput=2;
			}else if(scanInput==3){
				scanInput=3;
			}
		}
		in.close();
		return scanInput;
	}
	
	public int nomPrenomEleve(){
		int scanInput = 0;
		Scanner in = new Scanner(System.in);
		while(!(scanInput>=1 && scanInput<=3)){
			System.out.println("Vous êtes :");
			System.out.println("-1 Editer un élève");
			System.out.println("-2 Ajouter un élève");
			System.out.println("-3 Quitter");
			System.out.print("Saisir votre choix :");
			if(in.hasNextInt()){
				scanInput=in.nextInt();
			}
			if(scanInput==1){
				scanInput=1;
			}else if(scanInput==2){
				scanInput=2;
			}else if(scanInput==3){
				scanInput=3;
			}
		}
		in.close();
		return scanInput;
	}
	
	public String[] saisirIdentification(){
		
		String[] scanInput = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Identification :");
		System.out.println();
		System.out.println("Identifiant: ");
		if(in.hasNextLine()){
			scanInput[0]=in.nextLine();
		}
		System.out.println("Mot de passe: ");
		if(in.hasNextLine()){
			scanInput[1]=in.nextLine();
		}
		in.close();
		return scanInput;
		
	}
	
	public boolean etudiantValide(String id, String password, ArrayList<Etudiant> lesEtudiants){
		for(Etudiant etudiant:lesEtudiants){
			if(etudiant.getId().equals(id)&&etudiant.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
}

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author KutMiZat
 *
 */
public class Etudiant {
	
	private String nom;
	private String prenom;
	private String id;
	private String password;
	private ArrayList<Note> mesNotes;
	
	public Etudiant(){
		
	}
	
	
	public Etudiant(String nom, String prenom, String id, String password){
		
		this.nom=nom;
		this.prenom=prenom;
		this.setId(id);
		this.setPassword(password);
		this.mesNotes=new ArrayList<Note>();
		
	}
	
	public Etudiant(String nom, String prenom, ArrayList<Note> lesNotes){
		
		this.nom=nom;
		this.prenom=prenom;
		this.setId("defaut");
		this.setPassword("defaut");
		this.mesNotes= lesNotes;
		
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the mesNotes
	 */
	public ArrayList<Note> getMesNotes() {
		return mesNotes;
	}

	/**
	 * @param mesNotes the mesNotes to set
	 */
	public void setMesNotes(ArrayList<Note> mesNotes) {
		this.mesNotes = mesNotes;
	}
	
	public float getMoyenne(){
		int taille = this.mesNotes.size();
		float total = 0;
		
		for (Note laNote:this.mesNotes){
			total=total+laNote.getValue();
		}
		
		return (float) total/taille;
	}
	
	public void voirMesNotes(){
		
		System.out.print("Notes de l'étudiant(e) "+this.nom+" "+this.prenom+":\n");
	    for (Note laNote : this.mesNotes){
	      System.out.println("-"+laNote.getMatiere() + ": "+laNote.getValue());
	    }
	    System.out.println();

	    System.out.print("Ma moyenne: " + this.getMoyenne());
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

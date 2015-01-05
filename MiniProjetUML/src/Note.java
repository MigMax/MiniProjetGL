/**
 * 
 */

/**
 * @author KutMiZat
 *
 */
public class Note {
	
	private String matiere;
	private float value;
	
	public Note(String matiere, float val){
		this.matiere=matiere;
		this.value=val;
	}

	/**
	 * @return the matiere
	 */
	public String getMatiere() {
		return matiere;
	}

	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	/**
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(float value) {
		this.value = value;
	}
	
	

}

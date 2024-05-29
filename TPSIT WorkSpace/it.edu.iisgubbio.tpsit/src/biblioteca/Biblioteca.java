package biblioteca;

public class Biblioteca {
	Object[] libri = new Object[2];
	
	/**
	 * 
	 * @param libro
	 * @param disponibile è la disponibilità del libro
	 */
	
	public void aggiungi(String libro, boolean disponibile) {
		libri[0] =libro;
		libri[1] =disponibile;
	}
}

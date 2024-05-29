package biblioteca;

import java.util.ArrayList;

public class Persona extends Biblioteca{

	ArrayList<String> libriInPrestito = new ArrayList<String>();
	/**
	 * @param libriInPrestito nomi dei libri in prestito
	 * @return libriInPrestito.size();

	 */
	public int totLibriInPrestito() {
		return libriInPrestito.size();
		
	}
	
	public void prendiInPrestito(String libro) {
	
		if ((boolean) libri[1]) {
			libriInPrestito.add((String) libri[0]);
		}
		
	}
}

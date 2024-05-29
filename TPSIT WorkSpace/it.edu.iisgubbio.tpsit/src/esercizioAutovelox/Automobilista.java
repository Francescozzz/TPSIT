package esercizioAutovelox;

public class Automobilista {
	String nome;
	String cognome;
	double soldi;
	int veloce;
	
	/**
	 * questo è il metodo costruttore
	 * @param nome il nome dell'autista
	 * @param cognome il cognome dell'autista
	 * @param soldi il denaro disponibile
	 * @param veloce la velocità
	 * @return un oggetto della classe automobilsta
	 */
	
	public Automobilista(String nome,String cognome, double soldi, int veloce) {
		this.nome = nome;
		this.cognome = cognome;
		this.soldi = soldi;
		this.veloce = veloce;
	}
	
	/**
	 * 
	 * @param multa il valore complessivo della multa
	 * @return boolean il valore è vero se ...
	 */
	public boolean pagaMulta ( double multa) {
		if (this.soldi>= multa) {
			return true;
		}else {
			return false;
		}
	}
}

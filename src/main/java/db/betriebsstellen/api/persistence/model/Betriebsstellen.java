package db.betriebsstellen.api.persistence.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Betriebsstellen {

	private List<Betriebsstelle> betriebstellenListe;

	
	/**
	 * Gibt alle Betriebsstellen in einer Liste zurück.
	 * 
	 * @return Gibt alle Betriebsstellen in einer Liste zurück.
	 */
	public List<Betriebsstelle> getBetriebstellenListe() {
		return betriebstellenListe;
	}

	/**
	 * Mit dieser Methode kann die BetriebsstellenListe zugewiesen werden.
	 * 
	 * @param betriebstellenListe List aus Betriebsstelle(n)
	 */
	public void setBetriebstellenListe(List<Betriebsstelle> betriebstellenListe) {
		this.betriebstellenListe = betriebstellenListe;
	}

	/**
	 * Mit dieser Methode kann eine gewünschte Betriebsstelle gefunden werden.
	 * 
	 * @param searchString Dieser String wird genutzt um die zugehörige
	 *                     Betriebsstelle zu finden.
	 * @return Es wird die jeweilige Betriebsstelle oder ein null Wert
	 *         zurückgegeben, falls die Betriebsstelle nicht gefunden werden konnte.
	 */
	public Betriebsstelle getBetriebsstelle(String searchString) {
		return betriebstellenListe.stream().filter(
				Betriebsstelle -> searchString.toLowerCase().equals(Betriebsstelle.getRL100Code().toLowerCase()))
				.findFirst().orElse(null);
	}
}

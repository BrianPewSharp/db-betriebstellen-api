package db.betriebsstellen.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import db.betriebsstellen.api.persistence.model.Betriebsstelle;
import db.betriebsstellen.api.persistence.model.Betriebsstellen;

@RestController
public class BetriebstellenRestController {

	@Autowired
	Betriebsstellen betriebsstellen;

	/**
	 * Dies ist ein Eingangspunkt der Applikation. Mit dieser Methode kann eine
	 * gewünschte Betriebsstelle gefunden werden.
	 * 
	 * @param searchString Dieser String wird genutzt um die zugehörige
	 *                     Betriebsstelle zu finden.
	 * @return Es wird die jeweilige Betriebsstelle oder ein 404 zurückgegeben,
	 *         falls die Betriebsstelle nicht gefunden werden konnte.
	 */
	@GetMapping("/betriebsstelle/{searchString}")
	public @ResponseBody Betriebsstelle getBetriebsstelle(@PathVariable String searchString) {

		Betriebsstelle temp = betriebsstellen.getBetriebsstelle(searchString);

		// Es wird die jeweilige Betriebsstelle oder ein 404 zurückgegeben, falls die
		// Betriebsstelle nicht gefunden werden konnte.
		if (temp == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		} else {
			return temp;
		}
	}

	/**
	 * Dies ist ein Eingangspunkt der Applikation. Mit dieser Methode können alle
	 * Betriebsstellen ausgegeben werden.
	 * 
	 * @return Es werden alle Betriebsstellen ausgegeben.
	 */
	@GetMapping("/betriebsstellen")
	public @ResponseBody List<Betriebsstelle> getBetriebsstelle() {
		return betriebsstellen.getBetriebstellenListe();
	}
}

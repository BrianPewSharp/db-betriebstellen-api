package db.betriebsstellen.api.persistence.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//generierter Code: https://www.jsonschema2pojo.org/

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "PLC", "RL100-Code", "RL100-Langname", "RL100-Kurzname", "Typ Kurz", "Typ Lang", "Betriebszustand",
		"Datum ab", "Datum bis", "Niederlassung", "Regionalbereich", "Letzte \u00c4nderung" })
@Generated("jsonschema2pojo")
public class Betriebsstelle {

	@JsonProperty("PLC")
	private String plc;
	@JsonProperty("RL100-Code")
	private String rL100Code;
	@JsonProperty("RL100-Langname")
	private String rL100Langname;
	@JsonProperty("RL100-Kurzname")
	private String rL100Kurzname;
	@JsonProperty("Typ Kurz")
	private String typKurz;
	@JsonProperty("Typ Lang")
	private String typLang;
	@JsonProperty("Betriebszustand")
	private String betriebszustand;
	@JsonProperty("Datum ab")
	private String datumAb;
	@JsonProperty("Datum bis")
	private String datumBis;
	@JsonProperty("Niederlassung")
	private String niederlassung;
	@JsonProperty("Regionalbereich")
	private String regionalbereich;
	@JsonProperty("Letzte \u00c4nderung")
	private String letzteAenderung;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("PLC")
	public String getPlc() {
		return plc;
	}

	@JsonProperty("PLC")
	public void setPlc(String plc) {
		this.plc = plc;
	}

	@JsonProperty("RL100-Code")
	public String getRL100Code() {
		return rL100Code;
	}

	@JsonProperty("RL100-Code")
	public void setRL100Code(String rL100Code) {
		this.rL100Code = rL100Code;
	}

	@JsonProperty("RL100-Langname")
	public String getRL100Langname() {
		return rL100Langname;
	}

	@JsonProperty("RL100-Langname")
	public void setRL100Langname(String rL100Langname) {
		this.rL100Langname = rL100Langname;
	}

	@JsonProperty("RL100-Kurzname")
	public String getRL100Kurzname() {
		return rL100Kurzname;
	}

	@JsonProperty("RL100-Kurzname")
	public void setRL100Kurzname(String rL100Kurzname) {
		this.rL100Kurzname = rL100Kurzname;
	}

	@JsonProperty("Typ Kurz")
	public String getTypKurz() {
		return typKurz;
	}

	@JsonProperty("Typ Kurz")
	public void setTypKurz(String typKurz) {
		this.typKurz = typKurz;
	}

	@JsonProperty("Typ Lang")
	public String getTypLang() {
		return typLang;
	}

	@JsonProperty("Typ Lang")
	public void setTypLang(String typLang) {
		this.typLang = typLang;
	}

	@JsonProperty("Betriebszustand")
	public String getBetriebszustand() {
		return betriebszustand;
	}

	@JsonProperty("Betriebszustand")
	public void setBetriebszustand(String betriebszustand) {
		this.betriebszustand = betriebszustand;
	}

	@JsonProperty("Datum ab")
	public String getDatumAb() {
		return datumAb;
	}

	@JsonProperty("Datum ab")
	public void setDatumAb(String datumAb) {
		this.datumAb = datumAb;
	}

	@JsonProperty("Datum bis")
	public String getDatumBis() {
		return datumBis;
	}

	@JsonProperty("Datum bis")
	public void setDatumBis(String datumBis) {
		this.datumBis = datumBis;
	}

	@JsonProperty("Niederlassung")
	public String getNiederlassung() {
		return niederlassung;
	}

	@JsonProperty("Niederlassung")
	public void setNiederlassung(String niederlassung) {
		this.niederlassung = niederlassung;
	}

	@JsonProperty("Regionalbereich")
	public String getRegionalbereich() {
		return regionalbereich;
	}

	@JsonProperty("Regionalbereich")
	public void setRegionalbereich(String regionalbereich) {
		this.regionalbereich = regionalbereich;
	}

	public String getLetzteAenderung() {
		return letzteAenderung;
	}

	@JsonProperty("Letzte \u00c4nderung")
	public void setLetzteAenderung(String letzteAenderung) {
		this.letzteAenderung = letzteAenderung;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
package net.codejava.networking;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A utility that parse XML root element and attributes a file from a URL.
 * 
 * @author Pratyush
 * 
 */

@XmlType(name = "", propOrder = { "lfdnr", "bezeichnung", "gesamt", "frei",
		"status", "zeitstempel", "tendenz" })
@XmlRootElement(name = "parkhaus")
public class Parkhaus {
	private int lfdnr;
	private String bezeichnung;
	private int gesamt;
	private int frei;
	private int status;
	private String zeitstempel;
	private int tendenz;

	public Parkhaus() {
	}

	public Parkhaus(int lfdnr, String bezeichnung, int gesamt, int frei,
			int status, String zeitstempel, int tendenz) {
		this.lfdnr = lfdnr;
		this.bezeichnung = bezeichnung;
		this.gesamt = gesamt;
		this.frei = frei;
		this.status = status;
		this.zeitstempel = zeitstempel;
		this.tendenz = tendenz;
	}

	@XmlElement
	public int getLfdnr() {
		return lfdnr;
	}

	public void setLfdnr(int lfdnr) {
		this.lfdnr = lfdnr;
	}

	@XmlElement
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@XmlElement
	public int getGesamt() {
		return gesamt;
	}

	public void setGesamt(int gesamt) {
		this.gesamt = gesamt;
	}

	@XmlElement
	public int getFrei() {
		return frei;
	}

	public void setFrei(int frei) {
		this.frei = frei;
	}

	@XmlElement
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@XmlElement
	public String getZeitstempel() {
		return zeitstempel;
	}

	public void setZeitstempel(String zeitstempel) {
		this.zeitstempel = zeitstempel;
	}

	@XmlElement
	public int getTendenz() {
		return tendenz;
	}

	public void setTendenz(int tendenz) {
		this.tendenz = tendenz;
	}

	public String toString() {
		return lfdnr + "\t" + bezeichnung + "\t" + gesamt + "\t" + frei + "\t"
				+ status + "\t" + zeitstempel + "\t" + tendenz + "\n";
	}

}

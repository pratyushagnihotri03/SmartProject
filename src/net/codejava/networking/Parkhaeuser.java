package net.codejava.networking;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A utility that parse XML root element a file from a URL.
 * 
 * @author Pratyush
 * 
 */

@XmlRootElement(name = "parkhaeuser")
public class Parkhaeuser {

	List<Parkhaus> parkhaus;

	/**
	 * element that is going to be marshaled in the xml
	 */
	@XmlElement(name = "parkhaus")
	public List<Parkhaus> getParkhaus() {
		return parkhaus;
	}

	public void setParkhaus(List<Parkhaus> parkhaus) {
		this.parkhaus = parkhaus;
	}

}

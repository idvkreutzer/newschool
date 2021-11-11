package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public interface Obst {
	public Farbe getFarbe();
	
	public default void printFarbe() {
		System.out.println(getAusgabe());
	}

	private String getAusgabe() {
		return "Die Farbe ist " + this.getFarbe().name();
	}
}

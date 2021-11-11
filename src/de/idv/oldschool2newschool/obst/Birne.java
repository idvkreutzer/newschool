package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public final class Birne extends Kernobst implements Obst {

	private int kerne;
	private Farbe farbe;
	
	public Birne(int kerne, Farbe farbe) {
		super();
		this.kerne = kerne;
		this.setFarbe(farbe);
	}

	@Override
	public int getAnzahlKerne() {
		return kerne;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
}

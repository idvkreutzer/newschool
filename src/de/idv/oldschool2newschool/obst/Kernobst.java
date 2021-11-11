package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public abstract sealed class Kernobst permits Apfel, Birne {

	public abstract int getAnzahlKerne();

	public abstract Farbe getFarbe();
}

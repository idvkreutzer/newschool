package de.idv.oldschool2newschool.obst;

import de.idv.oldschool2newschool.farbe.Farbe;

public record Pflaume (int kerne, Farbe farbe) implements Obst {

	@Override
	public Farbe getFarbe() {
		return this.farbe;
	}}
 
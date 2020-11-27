package ru.iteco.patterns.factory.car;

import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.SalonType;

public abstract class SalonBase {

	private SalonType type;
	private Color color;

	protected SalonBase(SalonType type, Color color) {
		this.type = type;
		this.color = color;
	}

	@Override
	public String toString() {
		return color.getName() +
				" " +
				type.getName() +
				" salon";
	}
}

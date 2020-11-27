package ru.iteco.patterns.factory.car;

import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;

public abstract class BodyBase {

	private BodyType type;
	private Color color;

	protected BodyBase(BodyType type, Color color) {
		this.type = type;
		this.color = color;
	}

	@Override
	public String toString() {
		return color.getName() +
				" " +
				type.getName() +
				" body";
	}
}

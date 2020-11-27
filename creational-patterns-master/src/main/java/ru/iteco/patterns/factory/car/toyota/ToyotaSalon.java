package ru.iteco.patterns.factory.car.toyota;

import ru.iteco.patterns.factory.car.SalonBase;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.SalonType;

public class ToyotaSalon extends SalonBase {
	protected ToyotaSalon(SalonType type, Color color) {
		super(type, color);
	}
}

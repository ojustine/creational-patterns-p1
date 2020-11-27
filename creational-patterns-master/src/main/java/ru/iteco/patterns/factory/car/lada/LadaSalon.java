package ru.iteco.patterns.factory.car.lada;

import ru.iteco.patterns.factory.car.SalonBase;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.SalonType;

public class LadaSalon extends SalonBase {
	protected LadaSalon(SalonType type, Color color) {
		super(type, color);
	}
}

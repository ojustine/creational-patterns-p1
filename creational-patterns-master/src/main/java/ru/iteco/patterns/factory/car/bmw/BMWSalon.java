package ru.iteco.patterns.factory.car.bmw;

import ru.iteco.patterns.factory.car.SalonBase;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.SalonType;

public class BMWSalon extends SalonBase {
	protected BMWSalon(SalonType type, Color color) {
		super(type, color);
	}
}

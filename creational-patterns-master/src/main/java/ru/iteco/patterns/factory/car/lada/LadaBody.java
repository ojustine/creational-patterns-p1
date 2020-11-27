package ru.iteco.patterns.factory.car.lada;

import ru.iteco.patterns.factory.car.BodyBase;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;

public class LadaBody extends BodyBase {
	protected LadaBody(BodyType type, Color color) {
		super(type, color);
	}
}

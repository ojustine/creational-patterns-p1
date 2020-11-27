package ru.iteco.patterns.factory.car.toyota;

import ru.iteco.patterns.factory.car.BodyBase;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;

public class ToyotaBody extends BodyBase {
	protected ToyotaBody(BodyType type, Color color) {
		super(type, color);
	}
}

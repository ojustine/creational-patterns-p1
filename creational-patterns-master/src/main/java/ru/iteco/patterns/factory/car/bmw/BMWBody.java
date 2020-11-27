package ru.iteco.patterns.factory.car.bmw;

import ru.iteco.patterns.factory.car.BodyBase;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;

public class BMWBody extends BodyBase {
	protected BMWBody(BodyType type, Color color) {
		super(type, color);
	}
}

package ru.iteco.patterns.factory.car.bmw;

import ru.iteco.patterns.factory.car.EngineBase;
import ru.iteco.patterns.factory.car.spec.EngineType;

public class BMWEngine extends EngineBase {
	protected BMWEngine(EngineType type, int power) {
		super(type, power);
	}
}

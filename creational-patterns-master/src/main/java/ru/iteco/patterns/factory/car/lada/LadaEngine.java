package ru.iteco.patterns.factory.car.lada;

import ru.iteco.patterns.factory.car.EngineBase;
import ru.iteco.patterns.factory.car.spec.EngineType;

public class LadaEngine extends EngineBase {
	protected LadaEngine(EngineType type, int power) {
		super(type, power);
	}
}

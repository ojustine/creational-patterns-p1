package ru.iteco.patterns.factory.car.toyota;

import ru.iteco.patterns.factory.car.EngineBase;
import ru.iteco.patterns.factory.car.spec.EngineType;

public class ToyotaEngine extends EngineBase {
	protected ToyotaEngine(EngineType type, int power) {
		super(type, power);
	}
}

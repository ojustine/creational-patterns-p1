package ru.iteco.patterns.factory.car;

import ru.iteco.patterns.factory.car.spec.EngineType;

public abstract class EngineBase {

	private EngineType type;
	private int power;

	protected EngineBase(EngineType type, int power) {
		this.type = type;
		this.power = power;
	}

	@Override
	public String toString() {
		return type.getName() +
				" " +
				power +
				"-horsepower engine";
	}
}

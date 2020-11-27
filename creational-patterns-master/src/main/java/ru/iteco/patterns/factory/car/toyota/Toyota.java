package ru.iteco.patterns.factory.car.toyota;

import ru.iteco.patterns.factory.car.BodyBase;
import ru.iteco.patterns.factory.car.CarBase;
import ru.iteco.patterns.factory.car.EngineBase;
import ru.iteco.patterns.factory.car.SalonBase;

public class Toyota extends CarBase {
	protected Toyota(BodyBase body, EngineBase engine, SalonBase salon) {
		super(body, engine, salon);
	}

	@Override
	public String toString() {
		return "Toyota car with " + super.toString();
	}
}

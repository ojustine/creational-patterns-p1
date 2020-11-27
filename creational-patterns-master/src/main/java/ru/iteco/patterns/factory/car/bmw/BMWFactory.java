package ru.iteco.patterns.factory.car.bmw;

import ru.iteco.patterns.factory.car.*;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.EngineType;
import ru.iteco.patterns.factory.car.spec.SalonType;

public class BMWFactory implements CarFactory {
	@Override
	public BMWBody createBody(BodyType bodyType, Color color) {
		return new BMWBody(bodyType, color);
	}

	@Override
	public BMWSalon createSalon(SalonType salonType, Color color) {
		return new BMWSalon(salonType, color);
	}

	@Override
	public BMWEngine createEngine(EngineType engineType, int power) {
		return new BMWEngine(engineType, power);
	}

	@Override
	public BMW createCar(BodyBase body, EngineBase engine, SalonBase salon) {
		return new BMW(body, engine, salon);
	}
}

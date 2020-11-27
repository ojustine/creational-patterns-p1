package ru.iteco.patterns.factory.car.toyota;

import ru.iteco.patterns.factory.car.*;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.EngineType;
import ru.iteco.patterns.factory.car.spec.SalonType;

public class ToyotaFactory implements CarFactory {
	@Override
	public ToyotaBody createBody(BodyType bodyType, Color color) {
		return new ToyotaBody(bodyType, color);
	}

	@Override
	public ToyotaSalon createSalon(SalonType salonType, Color color) {
		return new ToyotaSalon(salonType,color);
	}

	@Override
	public ToyotaEngine createEngine(EngineType engineType, int power) {
		return new ToyotaEngine(engineType, power);
	}

	@Override
	public Toyota createCar(BodyBase body, EngineBase engine, SalonBase salon) {
		return new Toyota(body, engine, salon);
	}
}

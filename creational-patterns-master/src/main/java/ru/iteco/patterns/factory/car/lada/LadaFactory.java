package ru.iteco.patterns.factory.car.lada;

import ru.iteco.patterns.factory.car.*;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.EngineType;
import ru.iteco.patterns.factory.car.spec.SalonType;

public class LadaFactory implements CarFactory {
	@Override
	public LadaBody createBody(BodyType bodyType, Color color) {
		return new LadaBody(bodyType, color);
	}

	@Override
	public LadaSalon createSalon(SalonType salonType, Color color) {
		return new LadaSalon(salonType, color);
	}

	@Override
	public LadaEngine createEngine(EngineType engineType, int power) {
		return new LadaEngine(engineType, power);
	}

	@Override
	public Lada createCar(BodyBase body, EngineBase engine, SalonBase salon) {
		return new Lada(body, engine, salon);
	}
}

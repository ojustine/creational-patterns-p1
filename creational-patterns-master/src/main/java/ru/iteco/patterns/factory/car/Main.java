package ru.iteco.patterns.factory.car;

import ru.iteco.patterns.factory.car.bmw.BMWFactory;
import ru.iteco.patterns.factory.car.lada.LadaFactory;
import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.EngineType;
import ru.iteco.patterns.factory.car.spec.SalonType;
import ru.iteco.patterns.factory.car.toyota.ToyotaFactory;

public class Main {
	public static void main(String[] args) {

		CarFactory factory = new BMWFactory();
		BodyBase body = factory.createBody(BodyType.SEDAN, Color.BLACK);
		EngineBase engine = factory.createEngine(EngineType.GASOLINE, 350);
		SalonBase salon = factory.createSalon(SalonType.PREMIUM, Color.BLACK);
		CarBase car = factory.createCar(body, engine, salon);
		System.out.println(car);

		factory = new ToyotaFactory();
		body = factory.createBody(BodyType.HATCHBACK, Color.WHITE);
		engine = factory.createEngine(EngineType.DIESEL, 186);
		salon = factory.createSalon(SalonType.BASIC, Color.YELLOW);
		car = factory.createCar(body, engine, salon);
		System.out.println(car);

		factory = new LadaFactory();
		body = factory.createBody(BodyType.UNIVERSAL, Color.RED);
		engine = factory.createEngine(EngineType.GASOLINE, 85);
		salon = factory.createSalon(SalonType.BASIC, Color.WHITE);
		car = factory.createCar(body, engine, salon);
		System.out.println(car);
	}
}

package ru.iteco.patterns.factory.car;

import ru.iteco.patterns.factory.car.spec.BodyType;
import ru.iteco.patterns.factory.car.spec.Color;
import ru.iteco.patterns.factory.car.spec.EngineType;
import ru.iteco.patterns.factory.car.spec.SalonType;

public interface CarFactory {

    BodyBase createBody(BodyType bodyType, Color color);

    SalonBase createSalon(SalonType salonType, Color color);

    EngineBase createEngine(EngineType engineType, int power);

    CarBase createCar(BodyBase body, EngineBase engine, SalonBase salon);

}

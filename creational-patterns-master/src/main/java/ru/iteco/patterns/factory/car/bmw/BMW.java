package ru.iteco.patterns.factory.car.bmw;

import ru.iteco.patterns.factory.car.BodyBase;
import ru.iteco.patterns.factory.car.CarBase;
import ru.iteco.patterns.factory.car.EngineBase;
import ru.iteco.patterns.factory.car.SalonBase;

public class BMW extends CarBase {
    protected BMW(BodyBase body, EngineBase engine, SalonBase salon) {
        super(body, engine, salon);
    }

    @Override
    public String toString() {
        return "BMW car with " + super.toString();
    }
}

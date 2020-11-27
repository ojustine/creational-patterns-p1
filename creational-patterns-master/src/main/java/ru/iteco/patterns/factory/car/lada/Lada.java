package ru.iteco.patterns.factory.car.lada;

import ru.iteco.patterns.factory.car.BodyBase;
import ru.iteco.patterns.factory.car.CarBase;
import ru.iteco.patterns.factory.car.EngineBase;
import ru.iteco.patterns.factory.car.SalonBase;

public class Lada extends CarBase {
    protected Lada(BodyBase body, EngineBase engine, SalonBase salon) {
        super(body, engine, salon);
    }

    @Override
    public String toString() {
        return "Lada car with " + super.toString();
    }
}

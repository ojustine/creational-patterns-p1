package ru.iteco.patterns.factory.car;

public abstract class CarBase {
	private BodyBase body;
	private EngineBase engine;
	private SalonBase salon;

	protected CarBase(BodyBase body, EngineBase engine, SalonBase salon) {
		this.body = body;
		this.engine = engine;
		this.salon = salon;
	}

	@Override
	public String toString() {
		return body.toString() +
				", " +
				engine.toString() +
				" and " +
				salon.toString();
	}
}

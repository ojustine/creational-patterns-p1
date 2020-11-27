package ru.iteco.patterns.factory.car.spec;

public enum EngineType {
	GASOLINE("gasoline"),
	DIESEL("diesel");

	private final String name;

	EngineType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

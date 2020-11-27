package ru.iteco.patterns.factory.car.spec;

public enum BodyType {
	HATCHBACK("hatchback"),
	SEDAN("sedan"),
	UNIVERSAL("universal");

	private final String name;

	BodyType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

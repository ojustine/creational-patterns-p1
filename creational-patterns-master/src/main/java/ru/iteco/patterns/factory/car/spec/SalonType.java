package ru.iteco.patterns.factory.car.spec;

public enum SalonType {
	PREMIUM("premium"),
	BASIC("basic");

	private final String name;

	SalonType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

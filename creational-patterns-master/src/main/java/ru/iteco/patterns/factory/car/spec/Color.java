package ru.iteco.patterns.factory.car.spec;

public enum Color {
	RED("red"),
	WHITE("white"),
	BLACK("black"),
	YELLOW("yellow");

	private final String name;

	Color(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

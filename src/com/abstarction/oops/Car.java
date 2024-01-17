package com.abstarction.oops;

abstract class Car {
	void start() {
		System.out.println("Car is started");
	}
	void stop() {
		System.out.println("car is stopped");
	}
	abstract void refuel();
}

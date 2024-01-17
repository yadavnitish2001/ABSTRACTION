package com.abstarction.oops;

public class ClassApp {

	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar();
		PetrolCar pc=new PetrolCar();
		DieselCar dc=new DieselCar();
		
		CarModel cm=new CarModel();
		
		cm.doActivity(ec);
		cm.doActivity(pc);
		cm.doActivity(dc);
		}

}

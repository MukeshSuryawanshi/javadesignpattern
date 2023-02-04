package com.sikkabell.dp.factoryMethod;

public class TestFactoryMethod {
	public static void main(String[] args) {
       CarCompanyFactory factory = new TataCompany();
       factory.buildVehicle("car");
       
       factory = new TeslCompany();
       factory.buildVehicle("car");
       
	}
}


package com.sikkabell.dp.factoryMethod;

public class TeslCompany extends CarCompanyFactory {

	@Override
	protected IVehicle manufacturVehile(String vehicalType) {
		if (vehicalType == "car") {
			return new TeslaCar();
		}
		return null;
	}

}

package com.sikkabell.dp.factoryMethod;

public class TataCompany extends CarCompanyFactory {

	@Override
	protected IVehicle manufacturVehile(String vehicalType) {
		if (vehicalType == "car") {
			return new TataCar();
		}
		return null;
	}

}

package com.sikkabell.dp.factoryMethod;

public abstract class CarCompanyFactory {
	
	/*public IVehicle buildCar(String vehicleType) {
		if(vehicleType == "tatacar") {
			return new TataCar();
		}else {
			return new TeslaCar();
		}
	}*/
	public IVehicle buildVehicle(String vehicleType) {
		IVehicle vehicle = manufacturVehile(vehicleType);//asking subclass to instantiated, instead of here,but it looks like he is creating object
		vehicle.manufacture();
		return vehicle;
	}
	protected abstract IVehicle manufacturVehile(String vehicalType);
}

package interfaces;

public class Car implements Engine, Information {
	@Override
	public String getModel() {
		return "model";
	}
	
	@Override
	public String getManufacturer() {
		return "manufacturer";
	}
	
	@Override
	public int getId() {
		return 0;
	}
	
	@Override
	public String getName() {
		return "name";
	}
}

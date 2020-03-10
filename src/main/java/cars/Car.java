package cars;

public abstract class Car {
	abstract double getDistancePerLiter();

	abstract double getTripDistance();

	abstract String getName();

	double getChargeQuantity() {
		return getTripDistance() / getDistancePerLiter();
	}

	@Override
	public String toString() {
		return getName() + " : " + (int)getChargeQuantity() + "L" + System.getProperty("line.separator");
	}
}
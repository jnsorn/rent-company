package cars;

public class Avante extends Car {
	private static final String name = "Avante";
	private final int distancePerLiter = 15;
	private int tripDistance;

	public Avante(int tripDistance) {
		this.tripDistance = tripDistance;
	}

	@Override
	double getDistancePerLiter() {
		return distancePerLiter;
	}

	@Override
	double getTripDistance() {
		return tripDistance;
	}

	@Override
	String getName() {
		return name;
	}
}

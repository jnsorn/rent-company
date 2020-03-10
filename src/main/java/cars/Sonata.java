package cars;

public class Sonata extends Car {
	private static final String name = "Sonata";
	private final int distancePerLiter = 10;
	private int tripDistance;

	public Sonata(int tripDistance) {
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

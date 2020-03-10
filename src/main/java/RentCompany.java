import java.util.ArrayList;
import java.util.List;

import cars.Car;

public class RentCompany {
	List<Car> cars = new ArrayList<>();

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public String generateReport() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Car car : cars) {
			stringBuilder.append(car.toString());
		}
		return stringBuilder.toString();
	}
}

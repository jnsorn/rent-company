import static org.assertj.core.api.Java6Assertions.*;

import org.junit.Test;

import cars.Avante;
import cars.K5;
import cars.Sonata;

public class RentCompanyTest {
	private static final String NEWLINE = System.getProperty("line.separator");

	@Test
	public void report() throws Exception {
		RentCompany company = RentCompany.create();
		company.addCar(new Sonata(150));
		company.addCar(new K5(260));
		company.addCar(new Sonata(120));
		company.addCar(new Avante(300));
		company.addCar(new K5(390));

		String report = company.generateReport();
		assertThat(report).isEqualTo(
			"Sonata : 15L" + NEWLINE +
				"K5 : 20L" + NEWLINE +
				"Sonata : 12L" + NEWLINE +
				"Avante : 20L" + NEWLINE+
				"K5 : 30L" + NEWLINE
		);
	}
}
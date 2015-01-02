package with_domain_classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfValuesFormatter {

	private ValueFormatter[] valueFormatters;

	public ListOfValuesFormatter(ValueFormatter... valueFormatters) {
		this.valueFormatters = valueFormatters;
	}

	public List<String> format(int... values) {
		return Arrays.stream(values)
			.mapToObj(this::formatiereTemperatur)
			.collect(Collectors.toList());
	}

	private String formatiereTemperatur(int temperatur) {
		return Arrays.stream(valueFormatters)
			.filter(f -> f.canFormat(temperatur))
			.findFirst().get()
			.format(temperatur);
	}

}

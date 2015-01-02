package simple;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleListOfValuesFormatter {

	private final List<Map.Entry<Predicate<Integer>, Function<Integer, String>>> valueFormatters;

	public SimpleListOfValuesFormatter(List<Map.Entry<Predicate<Integer>, Function<Integer, String>>> valueFormatters) {
		this.valueFormatters = valueFormatters;
	}

	public static Map.Entry<Predicate<Integer>, Function<Integer, String>> formatter(
		Predicate<Integer> matchPredicate, Function<Integer, String> formatFunction) {
		return new AbstractMap.SimpleEntry<>(
			matchPredicate,
			formatFunction);
	}

	public List<String> format(int... temperaturen) {
		return Arrays.stream(temperaturen)
			.mapToObj(this::formatValue)
			.collect(Collectors.toList());
	}

	private String formatValue(int value) {
		Function<Integer, String> suitableFormatter = valueFormatters.stream()
			.filter(f -> f.getKey().test(value))
			.findFirst().get()
			.getValue();
		return suitableFormatter.apply(value);
	}

}

package simple;

import org.junit.Test;

import java.util.Arrays;

import static simple.SimpleListOfValuesFormatter.formatter;

public class SimpleListOfValuesFormatterDemo {

	@Test
	public void doesSomething() throws Exception {
		SimpleListOfValuesFormatter listFormatter = new SimpleListOfValuesFormatter(Arrays.asList(
			formatter(
				e -> e < -10,
				e -> String.format("<span class='low'>%s</span>", e)),
			formatter(
				e -> true,
				String::valueOf)));

		listFormatter.format(-11, 7, 12).stream().forEach(System.out::println);
	}

}

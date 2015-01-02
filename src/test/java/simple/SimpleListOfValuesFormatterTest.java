package simple;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static simple.SimpleListOfValuesFormatter.formatter;

public class SimpleListOfValuesFormatterTest {

	@Test
	public void formatiertJedeTemperaturMitDemErstbestenFormatierer() throws Exception {

		SimpleListOfValuesFormatter listOfValuesFormatter = new SimpleListOfValuesFormatter(Arrays.asList(
			formatter(
				e -> e == 0,
				e -> "foo"),
			formatter(
				e -> e == 1,
				e -> "bar")));
		assertThat(listOfValuesFormatter.format(0, 1),
			is(asList("foo", "bar")));
	}
}

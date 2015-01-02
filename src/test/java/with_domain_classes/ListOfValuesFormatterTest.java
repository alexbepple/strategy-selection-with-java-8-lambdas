package with_domain_classes;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListOfValuesFormatterTest {

	private ListOfValuesFormatter formatierer;

	@Test
	public void formatiertJedeTemperaturMitDemErstbestenFormatierer() throws Exception {

		ListOfValuesFormatter listFormatter = new ListOfValuesFormatter(
			stubFormatter(0, "foo"),
			stubFormatter(1, "bar"));
		assertThat(listFormatter.format(0, 1),
			is(asList("foo", "bar")));
	}

	private ValueFormatter stubFormatter(int rawValue, String formattedValue) {
		ValueFormatter formatter = mock(ValueFormatter.class);
		when(formatter.canFormat(rawValue)).thenReturn(true);
		when(formatter.format(rawValue)).thenReturn(formattedValue);
		return formatter;
	}
}

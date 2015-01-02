package with_domain_classes;

import org.junit.Test;

public class ListOfValuesFormatterDemo {

	private ListOfValuesFormatter listFormatter = new ListOfValuesFormatter(
		new LowValueFormatter(), new DefaultValueFormatter());

	@Test
	public void doesSomething() throws Exception {
		listFormatter.format(-11, 5, 10).stream().forEach(System.out::println);
	}

}

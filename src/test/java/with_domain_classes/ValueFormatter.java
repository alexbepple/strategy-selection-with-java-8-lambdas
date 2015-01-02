package with_domain_classes;

interface ValueFormatter {
	boolean canFormat(int value);
	String format(int value);
}

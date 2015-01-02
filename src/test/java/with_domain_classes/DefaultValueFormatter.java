package with_domain_classes;

class DefaultValueFormatter implements ValueFormatter {
	@Override
	public boolean canFormat(int value) {
		return true;
	}

	@Override
	public String format(int value) {
		return String.format("%s", value);
	}
}

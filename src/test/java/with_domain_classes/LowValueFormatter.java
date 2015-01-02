package with_domain_classes;

class LowValueFormatter implements ValueFormatter {
	@Override
	public boolean canFormat(int value) {
		return value < -10;
	}

	@Override
	public String format(int value) {
		return String.format("<span class='low'>%s</span>", value);
	}
}

package consoleArgumentParser;

public class Argument {

	private String value;
	private Argument(Builder builder) {
		this.value = builder.value;		
	}

	public void addValue(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static final Builder newBuilder()
	{
		return new Builder();
	}

	public static class Builder {
		private String value = "";
		
		public Builder withName(String name) {
			return this;
		}
		public Builder withValue(String value) {
			this.value = value;
			return this;
		}		

		public Argument build() {
			return new Argument(this);
		}
	}


}

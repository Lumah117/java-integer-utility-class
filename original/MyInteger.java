class MyInteger {

	// Bullet point 1
	private int value;

	// Bullet point 2
	public MyInteger() {
		value = 1;
	}

	public MyInteger(int new_value) {
		this.value = new_value;
	}

	// Bullet point 3
	int getValue() {
		return value;
	}

	// Bullet point 4
	public boolean isEven() {
		return MyInteger.isEven(value);
	}

	public boolean isOdd() {
		return MyInteger.isOdd(value);
	}

	public boolean isPrime() {
		return MyInteger.isPrime(value);
	}

	// Bullet point 5
	public static boolean isEven(int new_value) {
		if (new_value % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int new_value) {
		if (new_value % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int new_value) {
		for (int i = 2; i <= new_value / 2; ++i) {
			if (new_value % i == 0)
				return false;
		}
		return true;
	}

	// Bullet point 6
	public static boolean isEven(MyInteger new_value) {
		return MyInteger.isEven(new_value.getValue());
	}

	public static boolean isOdd(MyInteger new_value) {
		return MyInteger.isOdd(new_value.getValue());
	}

	public static boolean isPrime(MyInteger new_value) {
		return MyInteger.isPrime(new_value.getValue());
	}

	// Bullet point 7
	public boolean equals(int new_value) {
		if (new_value == value) {
			return true;
		} else
			return false;
	}

	public boolean equals(MyInteger new_value) {
		return this.equals(new_value.getValue());
	}

	// Bullet point 8
	public static int parseInt(char[] characters) {
		String s = new String(characters);
		return Integer.parseInt(s);
	}

	// Bullet point 9
	public static int parseInt(String new_string) {
		return Integer.parseInt(new_string);
	}

}

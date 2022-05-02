public class ParameterizedConstructor {

	// Instance variable
	int a;
	int b;

	// Parametrized constructor
	public ParameterizedConstructor(int x, int y) {
		a = x;
		b = y;
	}

	public void addition() {
		int c = a+b;
		System.out.println("Addition " + c);
	}
	public static void main(String[] args) {

		ParameterizedConstructor obj = new ParameterizedConstructor(10, 20);
		obj.addition();
		
		
		ParameterizedConstructor obj2 = new ParameterizedConstructor(50, 60);
		obj2.addition();
	}

}
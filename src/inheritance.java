
public class inheritance {

	public static void main(String[] args) {
Child S=new Child();		
S.Car();
S.house();
S.Land();
	}

}
class Parents{
	
	public void house() {
		System.out.println("House");
	}
	public void Car() {
		System.out.println("Car");
	}
	public void Land() {
		System.out.println("Land");
	}
	
}
class Child extends Parents {
	
	
	
}
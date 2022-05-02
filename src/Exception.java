import java.io.FileNotFoundException;

public class Exception {

	public static void main(String[] args){
		try {
		int a=10;
		int c= a/0;
		System.out.println(c);
		}
		catch(ArithmeticException e  ) {
		//-System.out.println(e);
		}
	}

}

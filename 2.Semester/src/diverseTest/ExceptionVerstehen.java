package diverseTest;

import java.io.IOException;

public class ExceptionVerstehen {
	public static void main(String[] args) throws Exception {		
			werfen();
			throw new Exception();
	}
	public static void werfen() {
		System.out.println("Der hier wirft eine Exception");
		
	}
}

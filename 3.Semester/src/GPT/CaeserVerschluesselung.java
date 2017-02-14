package GPT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CaeserVerschluesselung {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("==========ENCRYPTION==========");
		System.out.print("1. Encrypt Message\n");
		System.out.print("2. Decrypt Message");
		System.out.println(":> ");
		int decision = eingabe.nextInt();
		String m;
		switch (decision) {
		case 1: Scanner entscheidung = new Scanner(System.in);
			System.out.println("Message to encrypt:");
			m = encrypt(entscheidung.nextLine());
			System.out.println(m);
			break;
		case 2: String s = "QlhpdqgUgduiUgdvUhuidkuhqaUkdvwUgxUplfkUyhuvwdqghqU[[";
 
					System.out.println(decrypt(s));
		break;
		default:
			throw new InputMismatchException();
		}
	

	}

	public static String encrypt(String m) {
		String encryptMessage = "";
		for (int i = 0; i <= m.length() - 1; i++) {
			char c = m.charAt(i);
			encryptMessage += (char) ((c + 3 - 'a') % ('z' - 'a') + 'a');
		}
		return encryptMessage;
	}

	public static String decrypt(String m) {
		String decryptMessage = "";
		for (int i = 0; i <= m.length() - 1; i++) {
			char c = m.charAt(i);
			decryptMessage += (char) ((c - 3 - 'a') % ('z' - 'a') + 'a');
		}
		return decryptMessage;
	}

}

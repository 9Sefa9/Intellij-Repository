package Streams;
import java.io.*;

public class KommandozeileStreams {

	public static void main(String[] args) {

		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Bitte Strings eingeben.");
			String s = input.readLine();
			
			while (!s.equals(".")) {
				System.out.println("Du sagst: " + s);
				s = input.readLine();
			
			}
			System.out.println("Programm beendet.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Handler implements Runnable {

	private Socket client;

	public Handler(Socket client) {
		this.client = client;
	}

	public void run() {
		try {
			// sendet den input zu einem anderem client.
			OutputStream output = client.getOutputStream();
			PrintWriter writer = new PrintWriter(output);

			// empfängt den Input von dem client.
			InputStream in = client.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			// -------------------------------------------------------------------------------------------------------------------
			// sachen die wir vom client bekommen, wieder auf dem Server
			// ausgeben:
			String s = null;
			while ((s = reader.readLine()) != null) {
				// schribt zum client zurück
				writer.println(s);
				writer.flush();
				System.out.println("Client sagt:  " + s);
			}
			reader.close();
			writer.close();
			client.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package Streams;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStream {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.err.println("usage: java ZipCreate zipfile infile1 infile2 ...");
			return;
		}                                                                    //infile1
		try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[0]))) {
			byte[] buf = new byte[1024];   //buf = 1024 byte
			for (int i = 1; i < args.length; ++i) { // erhöhe i bis zur length vom args.
				String filename = args[i]; // speichert es auf den Filename ab
				try (FileInputStream fis = new FileInputStream(filename)) { // obtains bytes from filename! // in einander verschachtelter try block
					zos.putNextEntry(new ZipEntry(filename)); // erstellt eine neue zip datei. 
					int len;
					while ((len = fis.read(buf)) > 0) {
						zos.write(buf, 0, len);
					
					}
					// am ende wird gecloset
					zos.closeEntry();
				}
			}
		}
	}
}

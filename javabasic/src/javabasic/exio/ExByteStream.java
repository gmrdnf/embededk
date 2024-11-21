package javabasic.exio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ExByteStream {
	public static void main(String[] args) {
		
		Writer writer = null;
		Reader reader = null;
		
		try {
			
			File file = new File("D:\\embededk\\files\\byte.dat");
			
			writer =new FileWriter(file);
			writer.write("byte");
			writer.flush();
			
			reader =new FileReader(file);
			System.out.println((char)reader.read());
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally{
			try {
				reader.close();
				writer.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}//m
}//c

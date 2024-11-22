package javabasic.exio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExPrint {
//1개의 바이트를 PrintStream을 통해 출력,1개의 문자를 PrintWriter를 통해 출력
	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\Test1");
		
		PrintStream ps = null;
		
		try {
			ps= new PrintStream(file);
			ps.print((byte)421);
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		try {
			ps= new PrintStream(file);
			ps.print("문자");
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
	}
	
}

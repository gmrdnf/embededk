package javabasic.exio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ExConvBufferStream {
//스케너를 통해 입력받은 문자열을 스케너1파일에 쓰고 읽어서 출력
	public static void main(String[] args) {
	
		Writer writer = null;
		Reader reader = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("무언가 입력하시오");
		String sum = sc.next();
		
try {
			
			File file = new File("D:\\embededk\\files\\byte.dat");
			
			writer =new FileWriter(file);
			writer.write("sum");
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

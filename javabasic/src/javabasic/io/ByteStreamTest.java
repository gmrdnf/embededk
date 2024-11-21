package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamTest {
	// 파일생성
	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os = null;

		try {
			// 파일에서 바이트를 이릭는 InputStream생성
			is = new FileInputStream(new File("D:\\embededk\\files\\file1.dat"));
			int i = is.read();
			System.out.println("읽은 바이트:" + i);

			os = new FileOutputStream(new File("D:\\embededk\\files\\file2.dat"));
			os.write(i);

		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}// m

}// c

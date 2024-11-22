package javabasic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdTest {
	public static void main(String[] args) {
	
		File file =new File("D:\\embededk\\files\\buffered.dat");
		
		BufferedOutputStream bos = null;
		BufferedInputStream bis =null;
		try {
			bos =new BufferedOutputStream(new FileOutputStream(file));
			//Kilo:1024 , Mega:1024^2 , Giga:1024^3, Tera:1024^4, PetaL1024^5
			byte[] byteArr = new byte[1024*1024*1024];//5G
			int byteArrLeng = byteArr.length;
			
			for(int i = 0; i<byteArrLeng;i++) {
				byteArr[i] = (byte)i;
				
			}
			bos.write(byteArr);
			
			bis= new BufferedInputStream(new FileInputStream(file));
			byte[] readArr = new byte[1024*1024*1024];
			bis.read(readArr);
			int readArrLeng =readArr.length;
			System.out.println();
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}//m
}//c

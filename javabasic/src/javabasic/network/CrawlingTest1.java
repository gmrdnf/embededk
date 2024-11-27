package javabasic.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class CrawlingTest1 {

	public static void main(String[] args) {
	
		URI uri = null;
		URL url = null;
		URLConnection conn = null;
		BufferedReader br = null;
		
		try {
			uri =new URI("https://news.naver.com/section/105");
			url = uri.toURL();
			conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line ="";
			while ((line=br.readLine())!=null) {
				if (line.startsWith("<"))
				System.out.println(line);
			}
			
			
		} catch (URISyntaxException urise) {
			urise.printStackTrace();
		}	catch(MalformedURLException mue) {
			mue.printStackTrace();
		}	catch(IOException ioe) {
			ioe.printStackTrace();
		} 	finally {
			try {
				if(br!=null)br.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}//m
	
}//c

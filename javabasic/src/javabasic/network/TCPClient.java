package javabasic.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//TCP Client
public class TCPClient {

	public static void main(String[] args) {

		Socket clientSocket = null;
		PrintWriter pw = null;
		BufferedReader br=null;
		try {
			clientSocket = new Socket("192.168.8.7", 5000);//14
			//서버에 문자열 송신스트림
			pw =new PrintWriter(
					new OutputStreamWriter(clientSocket.getOutputStream(),"UTF-8"),
					true
					);
					pw.print("클라이언트가 보낸 메세지 : 안녕하세요");
					pw.flush();
					//서버에서 문자열 수신 스트림
					br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					System.out.println(br.readLine());
					
					br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		

	}// mian

}// class

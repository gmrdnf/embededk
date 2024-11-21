package javabasic.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;

public class FileTest {

	public static void main(String[] args) {
		
		File dir = new File("D:\\embededk\\files\\dir");
		
		//디렉토리 생성
		dir.mkdir();
		
		//디렉토리 여부확인
		System.out.println(dir.isDirectory());
		
		//파일 여부 확인
		System.out.println(dir.isFile());
		
		File file = new File(dir,"newfile.txt");
		
		//파일 생성
		try {
			file.createNewFile();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		//파일에 A 쓰기
		Writer writer = null;
		try {
			writer = new FileWriter(file);
			writer.write(65);
			writer.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		//파일의 문자 수
		System.out.println(file.length());
		
		//파일의 속성
		try {
		System.out.println(file.canExecute());//실행가능 여부
		System.out.println(file.canRead());//읽기 가능 여부
		System.out.println(file.canWrite());//쓰기 가능 여
		
		System.out.println(new File(".").getAbsolutePath());//.까지
		System.out.println(new File(".").getCanonicalPath());//.빼고
		
		System.out.println(file.getAbsoluteFile());//절대경로 File반환
		System.out.println(file.getAbsolutePath());//절대경로 문자열 반환
		System.out.println(file.getCanonicalFile());
		System.out.println(file.getCanonicalPath());
		
		System.out.println(file.getName());//파일명
		System.out.println(file.getParent());//상위 파일(디렉토리)문자열
		System.out.println(file.getParentFile());//상위 파일(디렉토리)File
		System.out.println(file.getPath());//상위 경로
		System.out.println(file.isHidden());//히든파일 여부
		System.out.println(file.lastModified());//최종수정일에 대한 UNIX TIME값
		System.out.println(file.setExecutable(true));//실행가능하도록 변경
		System.out.println(file.setLastModified(System.currentTimeMillis()));//최종수정일 변경
//		System.currentTimeMillis():시스템의 현제 UNIX TIME
		System.out.println(file.setReadable(true));//읽기가능하도록 변경
		System.out.println(file.setReadOnly());//읽기만 가능하도록 변경
		System.out.println(file.setWritable(true));//쓰기가능하도록 변경
		file.renameTo(new File("D:\\embededk\\files\\dir\\newnewfile.txt"));//파일명 변경
		file.delete();//파일 삭제
		file.deleteOnExit();//프로그램 종료시에 파일 삭제(임시파일 사용하고 종료시 삭제할 때
		
		System.out.println(dir.exists());//파일 존재 여부
		
		File dir2 = new File("D:\\embededk");
		File[] fileArr =dir2.listFiles();//디렉토리내 파일들의 배열
		for(File f :fileArr) {
			if(f.isDirectory()) {
				System.out.println("[D]"+f.getName()+" "+ f.length());
			}else {
				System.out.println(f.getName()+" "+f.length());
			}
		}
		
		//루트 디렉토리
		File[] rootArr =File.listRoots();//루트 디렉토리의 배열
		for(File f:rootArr) {
			System.out.println(f.getPath());//파ㅓ일 경로
		}
		
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}//main
	
}//class

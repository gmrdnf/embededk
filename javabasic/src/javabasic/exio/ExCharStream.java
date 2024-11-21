package javabasic.exio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ExCharStream {
    public static void main(String[] args) {
        
        Writer writer = null;
        Reader reader = null;
        
        try {
            // name.txt 파일 생성
            File file = new File("D:\\embededk\\files\\name.txt");

            // 파일에 이름 작성
            writer = new FileWriter(file);
            writer.write("YourName");  // 여기에 본인의 이름을 작성합니다.
            writer.flush();

            // 파일에서 이름 읽기
            reader = new FileReader(file);
            char[] buffer = new char[100];  // 넉넉히 배열 크기 설정
            int charsRead = reader.read(buffer);

            // 읽어온 문자들을 문자열로 변환하여 출력
            String name = new String(buffer, 0, charsRead);
            System.out.println("파일에 저장된 이름: " + name);
            
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}

package javabasic.exapi1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {
   
   static String[][] infoArr = new String[5][4];
   //2차원 배열 5줄 4개
   public static void main(String[] args) {
      
      System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
      System.out.println("형식:홍길동 000-0000-0000");
      //형식지정
      inputInfo();
      
      printInfo();
      
   } // main
   
   private static void inputInfo() {
      Scanner scanner = new Scanner(System.in);
      //스캐너 입력받기
      int infoArrLeng = infoArr.length;
      //배열길이 넣은거
      String line = "";
      //문자열
      for (int i=0; i<infoArrLeng; i++) {//배열수만큼 반복
         line = scanner.nextLine();
         //라인=문자열 에 입력받은 값 넣으려는거인듯
         infoArr[i][0] = line.substring(0, line.indexOf(' '));//여기부터 해석이 안되는듯?
         //이름 어떻게 뭐해서 나누는 거인듯
         StringTokenizer st 
            = new StringTokenizer(line.substring(line.indexOf(' ')+1), "-");
         int j = 1;
         while (st.hasMoreTokens()) { 
            infoArr[i][j] = st.nextToken();
            j++;
         }
      }
      
      scanner.close();
   } // inputInfo
   
   private static void printInfo() {
      int infoArrLeng = infoArr.length;
      int infoArr0Leng = infoArr[0].length;
      for (int i=0; i<infoArr0Leng; i++) {
         for (int j=0; j<infoArrLeng; j++) {
            System.out.print(infoArr[j][i] + " ");
         }//출력인듯
         System.out.println();
      }//결국 의도는 알았음 메소드 만드는것도 정답 배열 만들려했던것도 정답 근데 구현이 불가능했음
      //왜? 걍 몰라서 뭘써야하는지 어디에 뭘 붙여야하는지 걍 모르겠어서?가맞는듯
   }

} // class
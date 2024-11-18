package javabasic.excollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonInfo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//이름과 나이 정보 3개를 입력받아 출력//HashMap
		
		Map<String, String> nameMap = new HashMap<String, String>();
		
		System.out.println("이름과 나이 3개를 입력해 주세요");
		
		for (int i = 0; i < 3; i++) {
			String input =sc.next();
			String name =input.substring(0,input.indexOf(','));
			String age = input.substring(input.indexOf(',')+1);
			nameMap.put(name,age);
		}
		
		Set<Map.Entry<String, String>> entrySet = nameMap.entrySet();
		
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String>entry =it.next();
			System.out.printf("%s은 %s살 \n",entry.getKey(),entry.getValue());
		}//아직 왜이렇게 돌아간느지 모르겠음 구현되는 방식을 모르겠음
		
		//keySet() 사용
//		Set<String> keySet = nameMap.keySet();
//		Iterator<String>it2 = keySet.iterator();
//		while(it2.hasNext()) {
//			String key = it2.next();
//			System.out.printf("%s은 %s살 \n",key,nameMap.get(key));
//		}
		
		
		//index Of(',')
		//subString(0,indexOf(',')
		//subString(indexOf(',')+1)
		//이거아니면 토크나이져 쓰기
		
		
		
		
		
		
		
		
	}//main
	
}//class

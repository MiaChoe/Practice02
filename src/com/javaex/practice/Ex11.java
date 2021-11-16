package com.javaex.practice;//Done //출제의도:switch-case, 오랜만에 nextInt대신 nextLine, case뒤에 숫자 아닌 문자
										//string아니야, 한 글자니까 char야!=>그런데 불러들이는 next뒤가 Char가 아닌가봐;
										//=>질문 후: char의 직접식별자는 없었고 객체지향 가면 배운다는 char(0) sort of
										//수업 중,기본자료형 8개는 if(num==3)이렇게 같다는 표현이 되는데 
										//String str = "안녕"; if(str.equals("안녕")) String은 안되고 앞으로 기본자료형8개 뺀 나머진 
										//선흠: default는 switch안에 들어가 있어야 하므로 {}를 분리하지 말고 포괄해줄 것

import java.util.Scanner;


public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벗 1글자(소문자)를 입력하세요");
		System.out.print("알파벳:");
		
		String alphabet = sc.nextLine();
		 
		switch (alphabet) {
			case "a" : //선흠 씨가 알려주심. string이니까 ""인 건 알았는데 내가 아까 char로 바꾸면서 "을 '로 바꿈. 그래서 불능됨.
			case "e" :
			case "i" :
			case "o" :
			case "u" :
				System.out.println("모음입니다");
			break;
			
			default :
				System.out.println("자음입니다");
			break;
		}
		
		sc.close();
		
	}

}

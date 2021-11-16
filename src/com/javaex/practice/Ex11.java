package com.javaex.practice;//Yet Done //출제의도:switch-case, 오랜만에 nextInt대신 nextLine, case뒤에 숫자 아닌 문자
										//string아니야, 한 글자니까 char야!=>그런데 불러들이는 next뒤가 Char가 아닌가봐;
										//=>질문 후: char의 직접식별자는 없었고 객체지향 가면 배운다는 char(0) sort of

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벗 1글자(소문자)를 입력하세요");
		System.out.print("알파벳:");
		
		String alphabet = sc.nextLine();
		 
		switch (alphabet) {
			case 'a'
			case 'e'
			case 'i'
			case 'o'
			case 'u'
				System.out.println("모음입니다");
		break;
			}
		
			default : {
				System.out.println("자음입니다");
			}
		}
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}

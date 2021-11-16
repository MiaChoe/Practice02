package com.javaex.practice;//Yet Done//출제의도:if속의 if+if속의 if에 덧붙는 게 string도 가능하다
									//,age앞에 자료형 안 잡아둠, "" 속에서 "" 표현할 줄 알기
							

import java.util.Scanner;

//예상답)"1번그룹":21살, 100살. 2번그룹:15살, 19살, 20살

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		
		int age = sc.nextInt();
		
		if (age>20) {
			System.out.println("\"1번그룹"\"입니다");
			}
		else {
			System.out.println("\"2번그룹\"입니다");
			}
			
		sc.close();
		
		
	}

}

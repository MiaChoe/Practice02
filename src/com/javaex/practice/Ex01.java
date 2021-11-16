package com.javaex.practice;//Done//출제의도: 한 문장에 조건 두 개 기입 불가. 청소년 아닌 성인 나이는 그대로 찍히게 함

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요:");
		
		int age = sc.nextInt();
		
		if (age>0 && age<18) {
			System.out.println("청소년입니다.");
		}
		
		else {
			System.out.println(age+"살입니다"); 
		}
			
		sc.close();
	}

}

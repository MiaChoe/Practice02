package com.javaex.practice;//Yet Done//출제의도:.0이니까 int아니고 double, 연산자(arithmetic)를 string에 넣기

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호:");
		String arithmetic = sc.nextLine();
		
		System.out.print("숫자1:");
		double num1 = sc.nextDouble();
		
		System.out.println("숫자2:");
		double num2 = sc.nextDouble();
		
		double outcome = (num1+arithmetic+num2);
		
		System.out.println("결과는: "+outcome);
		
		
		
		
		sc.close();
		
	}

}

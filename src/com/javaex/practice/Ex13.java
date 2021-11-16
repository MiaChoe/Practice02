package com.javaex.practice;//고민:세제곱하는 부분이 왜 불가능하다고 나오는지 모르겠음

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자:");
		
		double num = sc.nextDouble();
		
		
		if (num>0) {
			System.out.println("계산결과는 "+(7*num+2)+" 입니다.");
		}
		
		else (num<=0) {
			System.out.println("계산결과는 "+num*num*num-9*num+2+" 입니다.");
		}
		
		sc.close();
		
		
	}

}

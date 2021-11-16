package com.javaex.practice;//Done//출제의도: string과 figural value동시 출력시 기입 방법

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:");
		double height = sc.nextDouble();
		System.out.print("몸무게:");
		double weight = sc.nextDouble();
		
		double average = (height-100)*0.9;
		
		if (average>weight) {
			System.out.println("저체중입니다");
		}
		else if (average<weight) {
			System.out.println("과체중입니다");
		}
		else {
			System.out.println("표준입니다");
		}
			
		System.out.println("표준체중:"+(height-100)*0.9);
		
		
		
		sc.close();
	}

}

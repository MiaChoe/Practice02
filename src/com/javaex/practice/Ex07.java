package com.javaex.practice;//Yet Done//고민:역시나 입력하는 숫자가 두번째 숫자란에만 기입됨=>ln의 w/, w/o인가=>아니네=>해결
										//아, 그게 아니라 입력하고 엔터치면 다음 숫자기입란 나오고 이렇게 해야 돼=>해결
										//고민: 몫과 나머지가 동시에 나오는 게 아니라 순차적으로 행갈이를 하고 나와야 함.

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자:");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자:");
		int num2 = sc.nextInt();

		if (num1>num2) {
			System.out.println("몫");
			
		}
			
		else if (num1<num2) {
			
			
		}
			
		else {
			
			
		}
		
		sc.close();
	}

}

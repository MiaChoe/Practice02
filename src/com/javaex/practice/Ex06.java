package com.javaex.practice;//Done//고민: 입력하는 int들이 다 두 번째 자리에만 배치됨
									//=>아, 그게 아니라 입력하고 엔터치면 다음 숫자기입란 나오고 이렇게 해야 돼

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		

		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		
		if (num1>=num2) {
			System.out.println("큰 수:"+num1+"작은 수:"+num2+"입니다");
		}
		
		else
			System.out.println("큰 수:"+num2+"작은 수:"+num1+"입니다");
		
		sc.close();
			
	}

}

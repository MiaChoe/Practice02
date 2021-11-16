package com.javaex.practice;//Done//출제의도:약수와 공약수의 개념 도입하기=>질문 후: 그렇지 않았다
							//질문: 밑과 지수를 구해서 (공)약수메커니즘 만들라는 건가요?=>선생님: 그냥 나눠서 나머지0인거 보면 되잖아요
							//수학 오버하지 말자;;;;
							//두 수가 약수의 관계가 아닐 수도 있으므로 마지막에 else로 퉁치지 말고 else if 두 개 쓸 것
							//큰 수와 작은 수 비교를 전제로 하고 약수관계 파악하기=>큰수 작은수 비교는 약수관계 직전에&&로 처리함
							//맞게 된 듯, Yeah!

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자:");
		int num1 = sc.nextInt();

		System.out.println("두번째 숫자:");
		int num2 = sc.nextInt();
		
		if (num1>num2 && num1%num2==0) {
			System.out.println(num2+"은(는)"+num1+"의 약수입니다.");
			}
		
		else if (num2>num1 && num2%num1==0) {
			System.out.println(num1+"은(는)"+num2+"의 약수입니다.");
			}
		
		else if (num1>num2){
			System.out.println(num2+"은(는)"+num1+"의 약수가 아닙니다.");
		}
		
		else if (num2>num1){
			System.out.println(num1+"은(는)"+num2+"의 약수가 아닙니다.");
		}
				
		sc.close();
		
	}

}

package com.javaex.practice;//Done//그런데 '서로 다른 정수'라는 가정이 없기 때문에 =값을 해결해주긴 해야 할 것 같음. 찝찜함.
									//모든 부등호에 등호를 넣어도 될 것 같은데? 해보자. 
									//그리고 if의 마지막을 else로 안 하고 else if로 했음. 마지막을 else로 해보자=>debug
									//나도 마지막을 당연히 else로 했어야 하는데 하지 않은 게, 
									//심적으로 등호 때문에 마지막 케이스를 남은 모든 경우의 수라고 못 묶겠음

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3:");
		int num3 = sc.nextInt();

		if (num1<=num2 && num1<=num3) {
			System.out.println("가장 작은 수는 "+num1+"입니다");
		}

		else if (num2<=num1 && num2<=num3) {
			System.out.println("가장 작은 수는 "+num2+"입니다");
		}
		
		else if (num3<=num1 && num3<=num2) {
			System.out.println("가장 작은 수는 "+num3+"입니다");
		}
		
		
		sc.close();
	}

}

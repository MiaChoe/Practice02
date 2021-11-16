package com.javaex.practice;//Yet Done//출제의도:값이 0이면 "x는 0이다"라고 출력하게 하는 변수. 
							//java에서는 =이 아니라 ==이고 (다음은헛소리:x가 변수 이름이지 값이 아님을 상기하게 할 문제)

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num==0) {
			System.out.println("x는 0이다");
		}
					
		sc.close();
		
	}

}

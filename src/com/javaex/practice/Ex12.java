package com.javaex.practice;//Yet Done
							//출제의도:.0이니까 int아니고 double, 연산자(arithmetic)를 string에 넣기
							//2021.11.17(수)07:35, arithmetic symbol들이 String일까? 한 자라 char될 수도
							//그런데 그보다도 arith들의 각각의 경우(+면 더하고, *면 곱하고 등)를 표시해야 하ㅏ
							//보니까 연산순서는 무조건 숫자1->숫자2인 듯, 숫자2는 0이아니다만 추가하자
							//%기호는 사용 불가함을 적시할 것
							//고민:숫자2가0일때와 arith가%일땐 '결과는'이 안 나와야 함.

/*아래와 같은 계산기 프로그램을 작성하세요
	-기호, 숫자1, 숫자2 순서로 입력받습니다
	-기호는 (+, -, *, /) 4가지 입니다.
	-입력된 내용으로 계산하여 결과값을 출력합니다.
	-나눗셈의 경우 분모가 0이면 "계산할 수 없습니다"를 출력합니다.
*/

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

		
		
		
		//모두==가 아니라 예의 경우(분모=0이거나 사용자가 arithmetic으로 %을 입력할 경우)있으므로 swithc불가 
		if {if (arithmetic=="+") {
				System.out.println(num1+num2);
				}
		
			else if (arithmetic=="-") {
				System.out.println(num1-num2);
				}
		
			else if (arithmetic=="*") {
				System.out.println(num1*num2);	
				}
		
			else if (arithmetic=="/") {
				System.out.println(num1/num2);	
				}
			}
		
		else if (num2=)
		
		
		outcome이 뭔지 
		System.out.println("결과는: "+outcome);
		
		
		
		
		sc.close();
		
	}

}

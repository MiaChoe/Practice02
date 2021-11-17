package com.javaex.practice;//Yet Done//출제의도:복잡해보여도 범위가 배제라서 더 쉬울 듯. 
							//이거 어제 시급1.5배랑 똑같은 고민인 게, 
							//코드만 봐도 정보로 주어진 실수 그대로 쓰고 싶은데 그러니까 값이 아주 수상해짐
							//유사케이스로 볼 수 있는 chapter01-Ex05강사님꺼 보니까 곱하기와 함께 있는 실수1.5에 괄호 하나 해주심
							//2021.11.17(수)08:50,Ex13처럼 변수 선언 먼저해서 출력값 깔끔하게 고치자=>해결
							//그리고 int를 double로 바꿈=> 안돼서 double형변수 안에 if조건 넣기 시도=>실패. 왜?
							//헉. 마지막 조건을 else if에서 else로 바꿔주니 해결됨. 난 수입을 0보다 적은 경우 있을까봐 else피한건데
							//또 마지막 조건에 밑줄 오류남. 0미만인 경우 특정해주자
							//아, 0미만인 경우는 출력값이 달라야 하네, 문제 똑바로 읽자.
							//이상, 이하, 미만, 초과 똑바로 수정

/*
문제] Ex14 다음과 같이 수익을 입력받아 소득세를 계산하는 프로그램을 작성하세요
 세금계산법
 0원이상 1000만원 이하인 경우 tax: 0.09*수익
 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
 */ 

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액(단위:만원): ");
		 
		double income = sc.nextInt();
		double tax;
		
		
		double tax = {	
					if (income>=8000) {
					tax = (1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(income-8000);	
					}
				
					else if (income>4000 && income<8000) {
					tax = (1000*0.09)+(3000*0.18)+0.27*(income-4000);	
					}
				
					else if (income>1000 && income<=4000) {
					tax = (1000*0.09)+0.18*(income-1000);	
					}
				
					else if (income>=0 && income<=1000) {
					tax = (0.09*income)
					};
					
					else if (income<0) {
						System.out.println("잘못 입력했습니다.");
					}
				};
		
		
		System.out.println("소득세는 "+ tax +" 입니다.");
		sc.close();
		
		
		
		
	}
	
}

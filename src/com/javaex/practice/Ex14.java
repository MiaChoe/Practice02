package com.javaex.practice;//Yet Done//출제의도:복잡해보여도 범위가 배제라서 더 쉬울 듯. 
							//이거 어제 시급1.5배랑 똑같은 고민인 게, 
							//코드만 봐도 정보로 주어진 실수 그대로 쓰고 싶은데 그러니까 값이 아주 수상해짐
							//유사케이스로 볼 수 있는 chapter01-Ex05강사님꺼 보니까 곱하기와 함께 있는 실수1.5에 괄호 하나 해주심

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액(단위:만원): ");
		 
		int income = sc.nextInt();
		
		if (income<0) {
			System.out.println("잘못 입력했습니다.");
		}
		
		else if (income>8000) {
			System.out.println("소득세는 "+1000*0.09+3000*0.18+4000*0.27+0.36*(income-8000)+" 입니다");
			
		}
		
		else if (income>4000 && income<8000) {
			System.out.println("소득세는 "+1000*0.09+3000*0.18+4000*0.27*(income-4000)+" 입니다");
			
		}
		
		else if (income>1000 && income<4000) {
			System.out.println("소득세는 "+1000*0.09+0.18*(income-1000)+" 입니다");
			
		}
		
		else if (income>0 && income<1000) {
			System.out.println("소득세는 "+0.09*income+" 입니다");
			
		}
		
		sc.close();
		
		
		
		
	}
	
}

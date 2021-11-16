package com.javaex.practice;//Yet Done//고민:세제곱하는 부분이 왜 불가능하다고 나오는지 모르겠음
						//2021.11.17(수)08:13,지저분하게 "계산결과는"뒤에 조건풀지말고
						//double형변수 outcome을 우선선언만 하고 대입값에 조건을 넣자
						//if조건 뒤에 변수의 성질 말해줄 때는 변수 앞에 자료형 안 써야 하는 거 알게 됨
						//x<=0은 왜 오류가 나나, 그냥 x=0일 때 값을 2라고 지정해야 하나,근데그럴리가.
						//x=0을 밑에 잡아주고나서  x<0인 조건 쓰니까 그것도 틀렸대
						//x=0을 두 번째에 써주고 x<0을 세 번째에 쓰니 오류 안 남. 이유가 뭔지 질문하기
						//아냐, 다시 오류남 on 'num<0'마지막줄. 


import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자:");
		
		double num = sc.nextDouble();
		double outcome;
		
		if (num>0) {outcome = (7*num)+2;}
		else if (num==0) {outcome = 2;}
		else (num<0) {outcome = num*num*num*-(9*num)+2;}
		
		System.out.println("계산결과는 "+outcome+"입니다.");
		
		
		/*
		if (num>0) {
			System.out.println("계산결과는 "+(7*num)+2+" 입니다.");
		}
		
		else (num<=0) {
			System.out.println("계산결과는 "+(num*num*num)-(9*num)+2+" 입니다.");
		}

		*/
		
		sc.close();
		
		
	}

}

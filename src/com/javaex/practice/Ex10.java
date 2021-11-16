package com.javaex.practice;//Done//출제의도:나머지3인 걸 따로 얘기 안 했으니 default를 A팀으로 둔다+음수를 마지막에 두니 안 되네
							//0번을 A팀에 넣기 위해서 ||연산자 넣음

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)을 입력해주세요");
		System.out.print("사번: ");
		
		int num = sc.nextInt();
		
		
			if (num<0){
				System.out.println("잘못입력하셨습니다.");
				}
				
			else if (num%3==2) {
				System.out.println("C팀입니다.");
				}
			
			else if (num%3==0 || num==0) {
				System.out.println("A팀입니다.");
				}
			
			else if (num%3==1) {
				System.out.println("B팀입니다.");
				}
			
			
			sc.close();
		
		}
		
}	
		
		
		
		

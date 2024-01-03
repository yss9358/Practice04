package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[문제] 
		
		Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] no = new int[5];
		
		double x = 0;
		
		for(int i=0; i<no.length; i++) {
			
			int y = sc.nextInt();
			
			x = x + y;
					
		} 
		
		System.out.println("평균은 " + x/5 + " 입니다.");
		
		sc.close();

	}

}

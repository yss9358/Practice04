package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[문제]
				
		Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요
		 -미니로또 (중복체크 할 것)
		
		*/
		int[] num = new int[45];
		int x =0;
		
		for (int i=0; i<num.length; i++) {
			x = x+1;
			num[i] = x;
			
		}
		
		/* 확인용
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		*/
		int no = (int)(Math.random()*45)+1;
		for (int i=0; i<6; i++) {
			System.out.println(num[no]);
		}
		
		
		
		
		
		
		
		

		
	}

}

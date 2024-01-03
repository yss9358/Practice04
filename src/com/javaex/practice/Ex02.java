package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[문제] 
		
		Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 
		아래와 같이 출력되도록 for문을 작성하세요.
		
		6.7
		3.3
		1.2
		
		*/
		
		double[] d = new double[3];
		
		d[0] = 6.7;
		d[1] = 3.3;
		d[2] = 1.2;
		
		for (int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}

	}

}

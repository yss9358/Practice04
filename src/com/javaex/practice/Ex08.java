package com.javaex.practice;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[문제]
				
		Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요
		 -미니로또 (중복체크 할 것)
		
		*/
		
		// (int)(Math.random()*45+1); // 45개중에 랜덤 한개 고르는 방식
		
		// Set 은 값을 저장하는 방식 . HashSet 중복된 값을 저장하지 않음.
		Set<Integer> lotto = new HashSet<Integer>();
		
		// 랜덤방식을 통해 중복없이 6개의 값을 추출하기 위한 조건문
		// 6개를 추출하면 조건문 탈출.
		while(true) {
			int i = (int)(Math.random()*45+1);
			lotto.add(i); // 6개의 주소값을 저장.
			if(lotto.size()>=6) {
				break;
			}
			
		}
	    // lotto 안에서 6개의 번호를 추출.
 		for(Integer lottono : lotto) {
			System.out.println(lottono);
		}
		
		
		
		
		
		

		
	}

}

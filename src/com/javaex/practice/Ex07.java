package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[문제] 
				
		Ex07 키보드에서 정수로 된 돈의 액수를 입력받아 50000원권, 10000원권, 5000원권, 1000원권, 500원동전, 
		100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
		
		*/

		Scanner sc = new Scanner(System.in);
				
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		
		System.out.print("금액:" );
		int won = sc.nextInt();
		
		for (int i=0; i<wonArray.length; i++) {
			int result = won/wonArray[i]; // 입력받은 금액이 i번째 값으로 나누어지면 그 몫이 결과값이 됨.
			if(result>0) { // 67879를 50000으로 나누면 몫 1 , 나머지 17879
				System.out.println(wonArray[i] + "원:" + result + "개");
			won = won%wonArray[i]; // 입력받은값에서 i번째 값으로 나누고 난 나머지를 또 계산해야함
			}                      // 그 나머지값을 다시 나누어서 나누어지면 결과값을 나타내고 반복
						
		}
		
		sc.close();

	}

}

package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		[문제] 
		
		Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 
		오류 수정 후 출력결과를 예상하고 코드로 확인해 보세요.
		
		[코드]
		
		public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i<=intArray.length; i++) {
		  
		  result = result + intArray[i];
		
		}
		
		System.out.println(result);
		
		}
		
		[오류메세지]
		
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:5
		       at com.javaex.practice.Ex99.main(Ex99.java:15)
		       	
		
		*/
		
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i<intArray.length; i++) {
		  
		  result = result + intArray[i];
		
		}
		
		System.out.println(result);
		
		/*
		
		1. intArray 의 값이 3개만 저장되어 있으니 new int[5]; 를 new int[3]; 으로 바꿔준다.
		2. for문에서 i<=intArray.length; 의 값을 i<intArray.length; 로 바꿔준다.
		
		
		*/
		
	}

}

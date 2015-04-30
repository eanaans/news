package net.hb.day30;

public class First {

	public static void main(String[] args) {
		System.out.println("First.Java");
		double rate= 78.9;
		int kor;// 초기값이 없는데
		final double PI =3.1415;// final은 상수 
		final int SIZE = 20;//상수
		final String com = "SM회사";//상수
		
		rate=12.3;//변수는 값이 변경가능
		kor = 45;//변수 = variable=값고정이 아니라 변경
		//PI = 6.7; 상수는 값변경하면 에러 발생
		//SIZE = 100;
		//com ="한빛ENI교육센타";
		System.out.println("국어="+ kor);
		System.out.println("크기"+ SIZE);
	
	}//main end
}//class end

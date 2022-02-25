package java_day06;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		
		String inputString = "";
		Scanner sc = new Scanner(System.in);
		
		// 이중(다중) while문
		
		int intVal = 2;
		while ( intVal <= 9 ) {
			int rightVal = 2;
			while( rightVal <= 9 ) {
				System.out.println(intVal + " x " + rightVal + " = " + (intVal * rightVal));
				rightVal++;
			}
			intVal++;
			System.out.println();
		}
		
		System.out.println("\n==================\n");
		
		// 포켓몬스터
		while (true) {
			System.out.println("야생의 단데기를 만났습니다." 
								+ " 행동을 선택해주세요.");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">> ");
			
			String inputText = sc.nextLine();
			
			if ( inputText.equals("1") ) {
				while ( true ) {
					System.out.println("공격 방법은?");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">> ");
					
					String attack = sc.nextLine();
					
					if ( attack.equals("1")) {
						System.out.println("피카츄 백만볼트!!");
					} else if ( attack.equals("2") ) {
						System.out.println("피카츄 전광석화!!");
					} else if ( attack.equals("3") ) {
						break; // 내부 while문은 더이상 실행되지 않음.
							   // 외부 while문을 계속 실행.
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
			} else if ( inputText.equals("2") ) {
				 System.out.println("단데기를 상대로 도망쳤습니다.");
				 break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		sc.close(); // 사용자로부터 값을 입력받는 
				    // Scanner 객체를 종료한다.
					// Scanner는 AutoCloseable을 구현하고 있기 때문에
					// 자동으로 close 되고 있지만, 명시적으로 close를 해주면 좋다.
			   		// Ctrl + 마우스 클릭 -> 해당변수가 선언된 위치나, 해당 클래스가 있는 위치 등등을 찾아간다.
	}
}

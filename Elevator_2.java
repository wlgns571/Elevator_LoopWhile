package java_day06;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Elevator_2 {
	public static void main(String[] args) {
		int elvA = 10; // 엘베A의 위치 10층
		int elvB = 4; // 엘베B의 위치 4층
		Scanner sc = new Scanner(System.in);
		
		// 움직인 엘리베이터가 A면 1, B면 2
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		int activeElevator = 0;

		while (true) {

			System.out.println("================ 희영빌딩 엘리베이터 =================");
			System.out.println("엘베 A의 현재 위치 " + elvA + " 층");
			System.out.println("엘베 B의 현재 위치 " + elvB + " 층");
			System.out.print("몇층에 계시나요? [종료하시려면 \"Q\" 또는 \"EXIT\"입력]: ");

			String inputText = sc.nextLine();
			
			// 종료를 입력했는지 확인하고 종료시킴
			if ( inputText.toLowerCase().equals("q") || inputText.toLowerCase().equals("exit") ) {
				System.out.println("프로그래밍 종료되었습니다.");
				break;
			}
			
			// 숫자만 입력했는지 확인.
			// regex ( 정규표현식 )
			// 단축키 [Ctrl + H] 파일내의 코드를 찾을수있음.
			String regex = "^[0-9]+$"; 
			// 문자열의 시작과 끝 사이에 숫자[0-9]가 한개이상(+)
			// 존재하는지 체크하기 위한 정규표현식
			
			// inputText가 숫자로 이루어진 문자열이면 isNum은 true
			boolean isNum = Pattern.matches(regex, inputText);
			if (!isNum) { // !를 달면 true로
				System.out.println("잘못 입력하셨습니다.");
				continue; // 반복문을 다시 실행시켜줌
			}
			
			// 사용자가 입력한 층수를 int로 변환
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 엘리베이터 호출");
		
			// 사용자의 위치와 각 엘리베이터 층수의 차이 계산
			int diffFloorA = (custFloor > elvA) ? (custFloor - elvA) : (elvA - custFloor);
			int diffFloorB = Math.abs(custFloor - elvB);
			
			// 위치 차이에 따른 엘리베이터 이동
			if (diffFloorA > diffFloorB) {
				System.out.println("승강기 B가 " + custFloor + "층으로 이동하였습니다.");
				elvB = custFloor;
				activeElevator = ACTIVE_ELEVATOR_B;
			} else if (diffFloorA < diffFloorB) {
				System.out.println("승강기 A가 " + custFloor + "층으로 이동하였습니다.");
				elvA = custFloor;
				activeElevator = ACTIVE_ELEVATOR_A;
			} else {
				if (elvA > elvB) {
					System.out.println("승강기 A가 " + custFloor + "층으로 이동하였습니다.");
					elvA = custFloor;
					activeElevator = ACTIVE_ELEVATOR_A;
				} else {
					System.out.println("승강기 B가 " + custFloor + "층으로 이동하였습니다.");
					elvB = custFloor;
					activeElevator = ACTIVE_ELEVATOR_B;
				}
			}
			
			while(true) {
				System.out.print("어느 층으로 이동하시겠습니까 : ");
				inputText = sc.nextLine();
				
				isNum = Pattern.matches(regex, inputText);
				if(!isNum) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				int goToFloor = Integer.parseInt(inputText);
				
				if (activeElevator == ACTIVE_ELEVATOR_A) {
					System.out.println("승강기 A가 " + goToFloor + "층으로 이동하였습니다.");
					elvA = goToFloor;
				} else if (activeElevator == ACTIVE_ELEVATOR_B) {
					System.out.println("승강기 B가 " + goToFloor + "층으로 이동하였습니다.");
					elvB = goToFloor;
				}
				
				break;
			}
		} // while
	}
}

package java_day06;

import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을
		// 눌렀을때, 한 대의 엘리베이터가 이동하는 프로그램 구현.

		// 1. 사용자의 현재 위치를 Scanner로 입력하면,
		// 사용자의 위치가 더 가까운 엘리베이터가 이동한다.

		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면,
		// 둘 중 위 층의 엘리베이터가 내려온다.

		// 3. 사용자가 입력한 위치로 엘리베이터의 위치를 바꿔준다.

		// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit을 입력.

		// @. 사용자가 엘리베이터에 탑승하고, 층을 입력하면
		// 탑승 중인 엘리베이터가 해당 층으로 이동하도록 만드시오.

		// @. 사용자가 숫자가 아닌 다른 값을 입력했을때,
		// "잘못 입력하셨습니다." 출력 후 다시 입력할 수 있게 만들기.

		int elvA = 10; // 엘베A의 위치 10층
		int elvB = 4; // 엘베B의 위치 4층
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("================ 희영 엘리베이터 =================");
			System.out.println("엘베 A의 현재 위치" + elvA + " 층");
			System.out.println("엘베 B의 현재 위치" + elvB + " 층");
			System.out.print("몇층에 계시나요? [종료하시려면 \"Q\" 또는 \"EXIT\"입력]: ");

			String x = sc.nextLine();

			if (x.equals("q") || x.equals("Q") || x.equals("Quit") || x.equals("EXIT") || x.equals("Exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				int Y = Integer.parseInt(x);
				System.out.println(Y + "층에서 엘리베이터를 호출 합니다.");

				if (Math.abs(elvA - Y) > Math.abs(elvB - Y)) {
					System.out.println("승강기 B가 " + Y + "층으로 이동하였습니다.");
					elvB = Y;

				} else if (Math.abs(elvA - Y) < Math.abs(elvB - Y)) {
					System.out.println("승강기 A가 " + Y + " 층으로 이동하였습니다");
					elvA = Y;

				} else if (Math.abs(elvA - Y) == Math.abs(elvB - Y)) {

					if (elvA > elvB) {
						System.out.println("승강기 A가 " + Y + "층으로 이동하였습니다.");
						elvA = Y;

					} else if (elvA < elvB) {
						System.out.println("승강기 B가 " + Y + "층으로 이동하였습니다.");
						elvB = Y;
					}
				}
			}
		} // for
	} // main
} // class

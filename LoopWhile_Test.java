package java_day06;

public class LoopWhile_Test {
	public static void main(String[] args) {
		// while문과 for문의 표현만 다르지
		// 결국 같은 반복문이다.
		
		// 그렇다면 크리스마스 트리를 while문으로 출력하시오.
		
		String star = "*";
		String blank = " ";
		
		int i = 0;
		while ( i < 5 ) {
			if ( i > 0 ) {
				star += "**";
			}
			blank = "";
			int j = 1;
			while ( j < 5 - i ) {
				blank += " ";
				j++;
			}
			System.out.println(i + ": " + blank + star);
			i++;
		}	
	}
}

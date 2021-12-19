
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LandMain {

	public void landInform(ArrayList<LandDTO> list, int input) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < list.size(); i++) {
			// 특수지구
			if (list.get(0).getLandNumber() == input) {
				System.out.println("\t\t" + "출발지점 입니다");
				System.out.println("\t\t" + "이곳을 지나면 월급을 받습니다");
				break;
			} else if (list.get(8).getLandNumber() == input) {
				System.out.println("\t\t" + "병원 입니다");
				System.out.println("\t\t" + "2턴간 쉬게되며 같은 주사위 눈이 나오면 탈출합니다");
				break;
			} else if (list.get(16).getLandNumber() == input) {
				System.out.println("\t\t" + "세무서 입니다");
				System.out.println("\t\t" + "연말정산 결과에 따라");
				System.out.println("\t\t" + "납부한 세금을 받거나 부족한 세금을 납부합니다");
				break;
			} else if (list.get(24).getLandNumber() == input) {
				System.out.println("\t\t" + "한강 크루즈 입니다");
				System.out.println("\t\t" + "다음턴 원하는 곳으로 이동할 수 있습니다");
				break;
				// 보너스
			}
			if (input == list.get(4).getLandNumber() || list.get(13).getLandNumber() == input
					|| list.get(22).getLandNumber() == input || list.get(27).getLandNumber() == input) {
				System.out.println("\t\t" + "보너스 칸입니다");
				System.out.println("\t\t" + "상황에 따라 자금을 받거나 뺏깁니다");
				break;
			} else if (input == list.get(i).getLandNumber()) {
				System.out.println();
				System.out.println("\t\t" +"<< 동네 정보 >>");
	            System.out.println("\t\t" +"동네\t동네가격\t빌딩가격\t호텔가격\t통행료\t\t빌딩사용료\t호텔비\t\t인수비용\t빌딩인수\t호텔인수");
	            System.out.println("\t\t" +list.get(i).toString());
	            break;
				
			}
		}
		System.out.println();
	}
}

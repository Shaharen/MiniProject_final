
import java.util.ArrayList;
import java.util.Scanner;

public class Out_Main {
	public static void main(String[] args) {
		Out2 out = new Out2();
		User user = new User();
		Pc pc = new Pc();
		ArrayList<LandDTO> land = new ArrayList<LandDTO>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			String turn = sc.next();
			// user turn
			user.Dice1(); // 유저턴 첫번째 주사위
			user.Dice2(); // 유저턴 두번째 주사위

			user.DiceAdd(); // 주사위 두개의 합
			user.DiceSum(); // 턴이 돌아가면서 굴려지는 주사위 합의 누적

			user.DiceWhere();
//			out.outPrint(user.diceWhere,pc.diceWhere); // 유저 및 PC의 위치

			// pc turn
			pc.Dice1(); // PC턴 첫번째 주사위
			pc.Dice2(); // PC턴 두번째 주사위

			pc.DiceAdd(); // 주사위 두개의 합
			pc.DiceSum(); // 턴이 돌아가면서 굴려지는 주사위 합의 누적

			pc.DiceWhere();
//			out.outPrint(user.diceWhere, pc.diceWhere, land); // 유저 및 PC의 위치
			// land.get(user.DiceWhere()).getLandOwner()
		}

	}

}

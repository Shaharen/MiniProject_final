public abstract class Player {

	// 초기자금
	int money = 550;
	// 주사위 굴리기용
	int dice;
	int diceAdd;
	// 바퀴계산을 위한 주사위 누적
	int diceSum;
	// Player 위치계산
	int diceWhere;

	int diceB;

	public abstract void Money();

	public abstract void Dice();

	public abstract void DiceB();

	public abstract void DiceSum();

	public abstract int DiceWhere();

}

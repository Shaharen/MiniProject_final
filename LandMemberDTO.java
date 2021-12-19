
public class LandMemberDTO {
	private String id;
	private String pw;
	private String nick;
	private int win;
	private int lose;
	private int score;
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LandMemberDTO(String id, String pw, String nick, int win, int lose, int score, int total) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.win = win;
		this.lose = lose;
		this.score = score;
		this.total = total;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", nick=" + nick + "]";
	}
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;
import javazoom.jl.player.MP3Player; 

public class LandMemberMain { 

	public static void main(String[] args) {

		LandMemberDAO dao2 = new LandMemberDAO();
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		mp3.play("C://music/도입부.mp3");
		System.out.println();
		timeLate(150);
		System.out.println(
				"         :::             :::       ::::    :::   :::::::::        :::       :::       :::      :::::::::    :::::::: ");
		timeLate(150);
		System.out.println(
				"        :+:           :+: :+:     :+:+:   :+:   :+:    :+:       :+:       :+:     :+: :+:    :+:    :+:  :+:    :+: ");
		timeLate(150);
		System.out.println(
				"       +:+          +:+   +:+    :+:+:+  +:+   +:+    +:+       +:+       +:+    +:+   +:+   +:+    +:+  +:+         ");
		timeLate(150);
		System.out.println(
				"      +#+         +#++:++#++:   +#+ +:+ +#+   +#+    +:+       +#+  +:+  +#+   +#++:++#++:  +#++:++#:   +#++:++#++   ");
		timeLate(150);
		System.out.println(
				"     +#+         +#+     +#+   +#+  +#+#+#   +#+    +#+       +#+ +#+#+ +#+   +#+     +#+  +#+    +#+         +#+    ");
		timeLate(150);
		System.out.println(
				"    #+#         #+#     #+#   #+#   #+#+#   #+#    #+#        #+#+# #+#+#    #+#     #+#  #+#    #+#  #+#    #+#     ");
		timeLate(150);
		System.out.println(
				"   #+#         #+#     #+#   #+#   #+#+#   #+#    #+#        #+#+# #+#+#    #+#     #+#  #+#    #+#  #+#    #+#     ");
		timeLate(150);
		System.out.println(
				"  ##########  ###     ###   ###    ####   #########          ###   ###     ###     ###   ##    ###   ########       ");
		timeLate(150);
		System.out.println();
		timeLate(150);

		System.out.println();

		System.out.println("\t\t\t" + "<<<<  Land Wars   >>>>");

		while (true) {
			System.out.println();
			System.out.println("\t\t" + "[1]로그인 [2]회원가입 [3]회원정보보기 [4]회원정보수정 [5]회원탈퇴 [6]종료");
			System.out.print("\t\t\t메뉴 입력 >> ");
			String menu = sc.next();
			System.out.println();

			if (menu.equals("1")) {

				System.out.println("\t\t\t" + "<<< 로그인 >>>");
				System.out.print("\t\t" + "ID : ");
				String id = sc.next();
				System.out.print("\t\t" + "PASSWORD : ");
				String pw = sc.next();

				String nick = dao2.login(id, pw);

				if (nick != null) {
					while (!id.equals("admin")) {
						System.out.println("\t\t" + nick + "님 환영합니다!");
						// landwars 로고

						System.out.println("\t\tLand Wars를 즐기러 오신걸 환영합니다.");
						System.out.println();
						while (true) {
							if (mp3.isPlaying()) {
								mp3.stop();
							}
							System.out.print("\t\t\t[ 프롤로그를 보시겠습니까? Y / N ] ");
							String start = sc.next();
							if (start.equals("Y") || start.equals("y")) {

								String[] smhrd = { " ", " " };
								String[] smhrd1 = { " ", "2", "0", "2", "2", " ", "1", "월" };
								String[] smhrd2 = { "'", "S", "M", "H", "R", "D", " ", "신", "문", "'", " ", "중" };
								System.out.println();
								String[] smhrd3 = { "2", "0", "2", "1", " ", "대", "한", "민", "국", " ", "부", "동", "산",
										" ", "사", "업", "실", "패", "로", ".", ".", "." };
								String[] smhrd8 = { " ", "이", "로", " ", "인", "해", " ", "정", "부", "는", " ", "큰", " ",
										"결", "심", "을", " ", "하", "게", "되", "는", "데" };

								String[] smhrd4 = { "실", "업", "자", "와", " ", "취", "준", "생", " ", "약", " ", "5", "6",
										"만", "명", "으", "로", " ", "늘", "어", "나", "고", " ", "있", "는", " ", "현", "실", "에",
										"서", " " };

								String[] smhrd5 = { "생", "활", "이", " ", "어", "렵", "거", "나", " ", "운", "이", " ", "없",
										"어", " ", "아", "무", "것", "도", " ", "못", "하", "는" };

								String[] smhrd6 = { "능", "력", "있", "는", " ", "사", "람", "들", "의", " ", "데", "이", "터",
										"를", " ", "모", "으", "고", " ", "모", "아" };

								String[] smhrd7 = { "단", " ", "한", " ", "명", "에", "게", " ", "기", "회", "를", " ", "주",
										"게", " ", "되", "는", "데", ".", ".", "." };
								System.out.print("\t\t");
								for (String value : smhrd1) {
									System.out.print(value);
									try {
										mp3.play("C://music/타자.mp3");
										Thread.sleep(180);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd2) {
									System.out.print(value);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd3) {
									System.out.print(value);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.println();
								System.out.print("\t\t");

								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd8) {
									System.out.print(value);

									try {

										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");

								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd4) {
									System.out.print(value);

									try {

										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {

									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd5) {
									System.out.print(value);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {
									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd6) {
									System.out.print(value);

									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {
									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/타자소리.mp3");
								for (String value : smhrd7) {
									System.out.print(value);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								if (mp3.isPlaying()) {
									mp3.stop();
								}
								System.out.println();
								System.out.print("\t\t");
								mp3.play("C://music/타자.mp3");
								for (String value : smhrd) {
									System.out.print(value);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}

									timeLate(1500);
									mp3.play("C://music/물방울.mp3");
								}
								if (mp3.isPlaying()) {
									mp3.stop();
								}
								System.out.println();
								System.out.println();
								System.out.print("\t\t");
								System.out.println(
										"===========================================================================");
								System.out.print("\t\t");
								System.out.println("To. " + nick);
								System.out.println();
								System.out.print("\t\t");
								System.out.println(" 하루하루 힘들게 공부하고 사람들에게 치이고 돈에 치이고 현실에 치이고 있는");
								System.out.print("\t\t");
								System.out.println(" " + nick + "님 수많은 경쟁 속에서 고생하고 있는 많은 사람 중에 선택되셨습니다.");
								System.out.print("\t\t");
								System.out.println(" 지금 서울의 부동산 사업 실패로 대한민국 재정에 큰 타격을 입어 고생하고 있습니다.");
								System.out.print("\t\t");
								System.out.println(" 그 원인 중 하나로 서울의 정체 모를 악덕 지주인 PBK가 강남의 모든 땅을 차지하려고 합니다.");
								System.out.print("\t\t");
								System.out.println(" 이처럼 어려운 상황에서 서울의 많은 토지를 매입해가며 대한민국의 부동산을 어지럽히고 있습니다.");
								System.out.print("\t\t");
								System.out.println(" " + nick + "님께 죄송한 마음이지만 저희를 도와주시면 큰 힘이 됩니다.");
								System.out.print("\t\t");
								System.out.println(" 정부에서 돈과 환경을 모두 제공해 드리겠습니다.");
								System.out.print("\t\t");
								System.out.println(" PBK를 막아 주십시오.");
								System.out.print("\t\t");
								System.out.println(" 한국을 지킨다는 사명으로 서울토지를 지켜주십시오.");
								System.out.print("\t\t");
								System.out.println(" 저희가 부탁한 것을 들어 주신다면 이제까지의 힘든 삶을 벗어 날수 있게 해드리겠습니다.");
								System.out.print("\t\t");
								System.out.println("                                           From. 대한민국 대통령 김태경");
								System.out.print("\t\t");
								System.out.println(
										"===========================================================================");

								System.out.println();
								break;
							} else if (start.equals("N") || start.equals("n")) {
								System.out.println();
								System.out.println("\t\t\t<<< GAME START >>>");
								break;
							} else {
								System.out.println("\t\t" + "다시 입력해주세요. ");
							}
						}

						System.out.print("\t\t" + "아무키나 입력하시고 엔터를 누르시면 게임이 시작됩니다. ");

						System.out.print("");
						String a = sc.next();

						Random rd = new Random();
						User user = new User();
						Pc pc = new Pc();
						Op op = new Op();
						LandDAO dao = new LandDAO();
						ArrayList<LandDTO> land = dao.selectAll();
						LandMain inform = new LandMain();
						Out out = new Out();
						
						dao2.loseOp(nick);
						dao2.total(nick);
						
						dao2.score(nick);
						int turnCnt = 0; // 턴 카운트 변수
						int userIsland = 0; // 무인도 변수
						int pcIsland = 0;
						int sw = rd.nextInt(5);// 세무서 변수
						int userSpace = 0; // 한강 크루즈 변수
						int pcSpace = 0;

						System.out.println("\t\t" + "선을 결정합니다.");
						mp3.play("C://music/주사위.mp3");
						timeLate(500);

						int userDice = rd.nextInt(6) + 1;
						int pcDice = rd.nextInt(6) + 1;
						System.out.println("\t\t" + nick + " 주사위 : " + userDice);
						timeLate(500);
						System.out.println("\t\t" + "PBK 주사위 : " + pcDice);
						timeLate(500);
						if (userDice >= pcDice) {
							turnCnt = 0;
							System.out.println("\t\t" + nick + "님 선입니다.");
							timeLate(500);
						} else {
							turnCnt = 1;
							System.out.println("\t\t" + "PBK 선입니다.");
							timeLate(500);
						}
						System.out.println();
						out.outPrint(user.diceWhere, pc.diceWhere, land);

						while (user.getUserMoney() >= 0 && pc.getPcMoney() >= 0) {
							sw++; // 사회 복지기금 카운터 증가
							// 사용자 플레이어
							if (turnCnt % 2 == 0) {
								turnCnt++;
								while (true) {
									System.out.println();
									System.out.println("\t\t" + nick + "님 턴입니다.");
									timeLate(300);
									// 지역 정보 호출 또는 다이스 선택
									System.out.println("\t\t" + "행동을 선택하세요.");
									while (true) {
										System.out.print("\t\t" + "[ 1. 턴 시작  2. 지역 정보 ] >> ");
										String choice = sc.next();
										if (choice.equals("1")) {
											System.out.println("\t\t" + "턴을 시작합니다.");
											timeLate(300);
											System.out.println();
											break;
										} else if (choice.equals("2")) {
											System.out.println("\t\t" + "정보를 알고 싶은 동네의 번호를 입력하세요.");
											timeLate(300);
											System.out.println("\t\t" + "지역 번호는 0(출발)부터 31입니다.");
											timeLate(300);
											System.out.print("\t\t" + "확인하실 동네 번호 : ");
											int landChoice = sc.nextInt();
											inform.landInform(land, landChoice);
										} else {
											System.out.println("\t\t" + "다시 입력하세요.");
										}
									}

									// 무인도 패턴
									if (userIsland > 0) {
										int islandDice1 = rd.nextInt(6) + 1;
										int islandDice2 = rd.nextInt(6) + 1;
										System.out.println("\t\t" + "첫번째 주사위 : " + islandDice1);
										timeLate(300);
										System.out.println("\t\t" + "두번째 주사위 : " + islandDice2);
										timeLate(300);
										if (islandDice1 == islandDice2) {
											System.out.println("\t\t" + "검사결과 음성입니다.");
											timeLate(300);
											System.out.println("\t\t" + "퇴원했습니다.");
											timeLate(300);
											userIsland = 0;
											break;
										} else {
											System.out.println("\t\t" + "검사가 완료되지 않았습니다.");
											timeLate(300);
											System.out.println("\t\t" + "병원밥 JMT");
											timeLate(300);
											userIsland--;
											System.out.println("\t\t" + "남은 입원 일수 : " + userIsland);
											timeLate(300);
											break;
										}
									}
									// 크루즈 (우주여행)
									if (userSpace > 0) {
										while (userSpace > 0) {
											System.out.print("\t\t" + "[ 이동할 칸 수를 입력하세요 (1 ~ 31 칸) ] >>");
											int move = sc.nextInt();
											if (move >= 32 || move <= 0) {
												System.out.println("\t\t" + "다시 입력해주세요.");
											} else {
												user.space(move);
												userSpace = 0;
											}
										}
									} else {
										// 턴 다이스
										user.Dice();
										mp3.play("C://music/주사위.mp3");
										user.DiceSum();
										user.DiceWhere();
										pc.DiceWhere();
										// 판 호출
//                                 System.out.println("test : "+land.get(1).getLandOwner()+land.get(2).getLandOwner()+land.get(3).getLandOwner()+land.get(5).getLandOwner()+land.get(6).getLandOwner()+land.get(7).getLandOwner());
//                                 System.out.println("userDiceMain"+user.diceWhere);
//                                 System.out.println("pcDiceMain"+pc.diceWhere);
										timeLate(500);
										out.outPrint(user.diceWhere, pc.diceWhere, land);
										timeLate(500);

									}
									// 보너스
									if (user.DiceWhere() == 4 || user.DiceWhere() == 13 || user.DiceWhere() == 22
											|| user.DiceWhere() == 27) {
										System.out.println("\t\t" + nick + "님이 보너스칸에 도착했습니다.");
										timeLate(300);
										int bonus = rd.nextInt(6) + 1;
										op.bonus(user, bonus);
										timeLate(300);
										user.Money(nick);
										timeLate(300);
										break;
									} else if (user.DiceWhere() % 8 == 0) {
										// 각 특수지구별 효과 호출
										if (user.DiceWhere() / 8 == 0 || user.DiceWhere() / 8 == 4) {
											// 출발
											System.out.println("\t\t" + "출발지점에 도착했습니다.");
											timeLate(300);
											break;
										} else if (user.DiceWhere() / 8 == 1) {
											// 무인도 - 2턴 쉬기
											System.out.println("\t\t" + "코로나가 의심되어 병원에 입원하였습니다.");
											timeLate(300);
											userIsland = 2;
											break;
										} else if (user.DiceWhere() / 8 == 2) {
											// 사회 복지기금 - 자체 카운터에 따라서, 세무서로 이름 변경
											System.out.println("\t\t" + "세무서에 도착하셨습니다.");
											timeLate(300);
											op.sw(user, sw);
											timeLate(300);
											user.Money(nick);
											timeLate(300);
											break;
										} else if (user.DiceWhere() / 8 == 3) {
											// 우주여행 - 원하는곳 위치
											System.out.println("\t\t" + "크루즈에 탑승하셨습니다.");
											timeLate(300);
											System.out.println("\t\t" + "다음턴 원하는 칸만큼 이동합니다.");
											timeLate(300);
											userSpace = 1;
											break;
										}

									} else {
										// 도시도착 알림
										System.out.println(
												"\t\t" + land.get(user.DiceWhere()).getLandName() + "에 도착 하였습니다. ");
										timeLate(300);
										// 소유 판별 0 1 2
										if (land.get(user.DiceWhere()).getLandOwner() == 0) {
											// 땅구입 Cnt++
											System.out.println("\t\t" + "현재 소유자가 없는 땅입니다.");
											timeLate(300);
											while (true) {
												System.out.print("\t\t" + "[ 땅을 구입하시겠습니까? Y / N ] >> ");
												String choiceLand = sc.next();
												if (choiceLand.equals("Y") || choiceLand.equals("y")
														|| choiceLand.equals("ㅛ")) {
													op.userLandBuy(user, land.get(user.DiceWhere()));
													user.Money(nick);
													timeLate(300);
													System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
													timeLate(300);
													land.get(user.DiceWhere()).setLandOwner(1);
													land.get(user.DiceWhere()).setLandCnt(1);
													break;
												} else if (choiceLand.equals("N") || choiceLand.equals("n")
														|| choiceLand.equals("ㅜ")) {
													System.out.println("\t\t" + "땅을 구매하지 않았습니다.");
													timeLate(300);
													user.Money(nick);
													timeLate(300);
													System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
													timeLate(300);
													break;
												} else {
													System.out.println("\t\t" + "다시 입력해주세요.");
												}
											}
											break;
										} else if (land.get(user.DiceWhere()).getLandOwner() == 1) {
											// 플레이어땅이고, 건설 여부 (CNT)
											System.out.println("\t\t" + nick + "님 땅입니다.");
											timeLate(300);
											if (land.get(user.DiceWhere()).getLandCnt() == 1) {
												// 빌딩
												while (true) {
													System.out.println("\t\t" + "이 지역의 빌딩 가격은 "
															+ land.get(user.DiceWhere()).getBuilding() + "억 입니다.");
													timeLate(300);
													user.Money(nick);
													timeLate(300);
													System.out.print("\t\t" + "[ 빌딩을 건설하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userBuildingBuy(user, land.get(user.DiceWhere()));
														user.Money(nick);
														timeLate(300);
														land.get(user.DiceWhere()).setLandCnt(2);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + "땅을 구매하지 않았습니다.");
														timeLate(300);
														user.Money(nick);
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요.");
													}
												}
												break;
											} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
												// 호텔
												while (true) {
													System.out.println("\t\t" + "이 지역의 호텔 가격은 "
															+ land.get(user.DiceWhere()).getHotel() + "억 입니다.");
													timeLate(300);
													user.Money(nick);
													timeLate(300);
													System.out.print("\t\t" + "[ 호텔을 건설하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userHotelBuy(user, land.get(user.DiceWhere()));
														user.Money(nick);
														timeLate(300);
														land.get(user.DiceWhere()).setLandCnt(3);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														timeLate(300);
														System.out.println("\t\t" + "땅을 구매하지 않았습니다.");
														timeLate(300);
														user.Money(nick);
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요.");
													}
												}
												break;
											} else {
												// 더이상 건설할 땅 없음
												System.out.println("\t\t" + "더이상 건설할 건물이 없습니다.");
												timeLate(300);
												System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
												break;
											}
										} else if (land.get(user.DiceWhere()).getLandOwner() == 2) {
											// PC땅, 통행료계산, 인수여부 (OWNER,CNT)
											System.out.println("\t\t" + "PBK의 땅입니다.");
											timeLate(300);
											if (land.get(user.DiceWhere()).getLandCnt() == 1) {
												// 땅만 있음, 땅통행료 지불, 인수여부 물어볼것
												System.out.println("\t\t" + "통행료는 "
														+ land.get(user.DiceWhere()).getPass() + "억 입니다.");
												timeLate(300);
												op.userPass(user, pc, land.get(user.DiceWhere()));
												user.Money(nick);
												while (true) {
													System.out.println("\t\t" + "이 지역의 현재 인수 가격은 "
															+ land.get(user.DiceWhere()).getInterceptPrice()
															+ "억 입니다.");
													timeLate(300);
													System.out.print("\t\t" + "[ 인수 하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "인수를 선택하셨습니다.");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money(nick);
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요.");
													}
												}
												break;
											} else if (land.get(user.DiceWhere()).getLandCnt() == 2) {
												// 빌딩까지 있음, 통행료2 지불, 인수여부
												System.out.println("\t\t" + "통행료는 "
														+ land.get(user.DiceWhere()).getPassBuilding() + "억 입니다.");
												timeLate(300);
												op.userPassBuilding(user, pc, land.get(user.DiceWhere()));
												user.Money(nick);
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "이 지역의 현재 인수 가격은 "
															+ land.get(user.DiceWhere()).getInterceptPrice2()
															+ "억 입니다.");
													timeLate(300);
													System.out.print("\t\t" + "[ 인수 하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice2(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "인수를 선택하셨습니다.");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money(nick);
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요.");
													}
												}
												break;
											} else {
												// 호텔까지 있음, 통행료3 지불, 인수여부
												System.out.println("\t\t" + "통행료는 "
														+ land.get(user.DiceWhere()).getPassHotel() + "억 입니다.");
												timeLate(300);
												op.userPassHotel(user, pc, land.get(user.DiceWhere()));
												user.Money(nick);
												timeLate(300);
												while (true) {
													System.out.println("\t\t" + "이 지역의 현재 인수 가격은 "
															+ land.get(user.DiceWhere()).getInterceptPrice3()
															+ "억 입니다.");
													timeLate(300);
													System.out.print("\t\t" + "[ 인수 하시겠습니까? Y / N ] >> ");
													String choiceLand = sc.next();
													if (choiceLand.equals("Y") || choiceLand.equals("y")) {
														op.userInterceptPrice3(user, pc, land.get(user.DiceWhere()));
														System.out.println("\t\t" + "인수를 선택하셨습니다.");
														timeLate(300);
														land.get(user.DiceWhere()).setLandOwner(1);
														user.Money(nick);
														timeLate(300);
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else if (choiceLand.equals("N") || choiceLand.equals("n")) {
														System.out.println("\t\t" + nick + "님 턴을 종료합니다.");
														break;
													} else {
														System.out.println("\t\t" + "다시 입력해주세요.");
													}
												}
												break;
											}

										}
									}
								}
							} else {
								turnCnt++;
								while (true) {
									// 후플레이어
									System.out.println();
									System.out.println("\t\t" + "PBK 턴입니다.");
									System.out.print("\t\t" + "아무키나 입력하시면 PBK턴을 진행합니다. ");
									String pbkTurn = sc.next();

									// 무인도 패턴
									if (pcIsland > 0) {
										int islandDice1 = rd.nextInt(6) + 1;
										int islandDice2 = rd.nextInt(6) + 1;
										timeLate(300);
										System.out.println("\t\t" + "첫번째 주사위 : " + islandDice1);
										timeLate(300);
										System.out.println("\t\t" + "두번째 주사위 : " + islandDice2);
										if (islandDice1 == islandDice2) {
											timeLate(300);
											System.out.println("\t\t" + "PBK가 퇴원했습니다.");
											pcIsland = 0;
											break;
										} else {
											timeLate(300);
											System.out.println("\t\t" + "PBK의 검사 결과가 늦어지고 있습니다...");
											timeLate(300);
											System.out.println("\t\t" + "PBK가 병원밥을 먹습니다 ㅠㅠ");
											pcIsland--;
											timeLate(300);
											System.out.println("\t\t" + "PBK의 남은 입원 일수 : " + pcIsland);
											break;
										}
									}
									// 우주여행
									if (pcSpace > 0) {
										while (pcSpace > 0) {
											System.out.print("\t\t" + "PBK가 이동할 칸 수 : ");
											int move = rd.nextInt(30) + 1;
											System.out.println(move);
											if (move >= 32 || move <= 0) {
												System.out.println("\t\t" + "다시 입력해주세요.");
											} else {
												pc.space(move);
												pcSpace = 0;
											}
										}
									} else {
										pc.Dice();
										pc.DiceSum();
										user.DiceWhere();
										pc.DiceWhere();
										timeLate(500);
										out.outPrint(user.diceWhere, pc.diceWhere, land);
										timeLate(500);
									}
									// 보너스
									if (pc.DiceWhere() == 4 || pc.DiceWhere() == 13 || pc.DiceWhere() == 22
											|| pc.DiceWhere() == 27) {
										System.out.println("\t\t" + "PBK가 보너스칸에 도착했습니다.");
										timeLate(300);
										int bonus = rd.nextInt(6) + 1;
										timeLate(300);
										op.bonus(pc, bonus);
										timeLate(300);
										pc.Money();
										break;
									} else if (pc.DiceWhere() % 8 == 0) {
										// 각 특수지구별 효과 호출
										if (pc.DiceWhere() / 8 == 0 || pc.DiceWhere() / 8 == 4) {
											// 출발
											System.out.println("\t\t" + "PBK가 출발지점에 도착했습니다.");
											break;
										} else if (pc.DiceWhere() / 8 == 1) {
											// 무인도 - 2턴 쉬기
											System.out.println("\t\t" + "PBK가 코로나가 의심되어 병원에 입원했습니다.");
											pcIsland = 2;
											break;
										} else if (pc.DiceWhere() / 8 == 2) {
											// 사회 복지기금 - 자체 카운터에 따라서
											System.out.println("\t\t" + "PBK가 세무서에 도착했습니다.");
											timeLate(300);
											op.sw(pc, sw);
											timeLate(300);
											pc.Money();
											break;
										} else if (pc.DiceWhere() / 8 == 3) {
											// 우주여행 - 원하는곳 위치
											System.out.println("\t\t" + "PBK가 크루즈에 탑승하였습니다.");
											pcSpace = 1;
											break;
										}

									} else {
										// pc위치
										System.out.println("\t\t" + "PBK가 " + land.get(pc.DiceWhere()).getLandName()
												+ "에 도착 하였습니다. ");
										if (land.get(pc.DiceWhere()).getLandOwner() == 0) {
											// 땅구입 Cnt++
											timeLate(300);
											System.out.println("\t\t" + "현재 소유자가 없는 땅입니다.");
											timeLate(300);
											System.out.println("\t\t" + "PBK가 땅을 구입할지 결정중입니다.");
											op.pcLandBuy(pc, land.get(pc.DiceWhere()));
											timeLate(300);
											System.out.println("\t\t" + "PBK가 땅을 구입했습니다");
											timeLate(300);
											pc.Money();
											timeLate(300);
											System.out.println("\t\t" + "PBK턴을 종료합니다.");
											land.get(pc.DiceWhere()).setLandOwner(2);
											land.get(pc.DiceWhere()).setLandCnt(1);
											break;
										} else if (land.get(pc.DiceWhere()).getLandOwner() == 1) {
											// 플레이어땅
											if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
												// 땅만 있음, 통행료, 인수
												op.pcPass(pc, user, land.get(pc.DiceWhere()));
												timeLate(300);
												pc.Money();
												int intercept = rd.nextInt(2);
												if (intercept == 0) {
													op.pcInterceptPrice(user, pc, land.get(pc.DiceWhere()));
													land.get(pc.DiceWhere()).setLandOwner(2);
													timeLate(300);
													System.out.println("\t\t" + "PBK가 땅을 인수했습니다.");
													timeLate(300);
													pc.Money();
													timeLate(300);
													System.out.println("\t\t" + "PBK턴을 종료합니다.");
													break;
												} else {
													System.out.println("\t\t" + "PBK가 인수하지않고 턴을 종료했습니다.");
													break;
												}
											} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
												// 빌딩까지 있음, 통행료, 인수
												op.pcPassBuilding(pc, user, land.get(pc.DiceWhere()));
												timeLate(300);
												pc.Money();
												int intercept = rd.nextInt(2);
												if (intercept == 0) {
													op.pcInterceptPrice2(user, pc, land.get(pc.DiceWhere()));
													land.get(pc.DiceWhere()).setLandOwner(2);
													timeLate(300);
													System.out.println("\t\t" + "PBK가 땅을 인수했습니다.");
													timeLate(300);
													pc.Money();
													timeLate(300);
													System.out.println("\t\t" + "PBK턴을 종료합니다.");
													break;
												} else {
													System.out.println("\t\t" + "PBK가 인수하지않고 턴을 종료했습니다.");
													break;
												}
											} else {
												// 호텔까지 있음, 통행료, 인수
												op.pcPassHotel(pc, user, land.get(pc.DiceWhere()));
												timeLate(300);
												pc.Money();
												int intercept = rd.nextInt(2);
												if (intercept == 0) {
													op.pcInterceptPrice3(user, pc, land.get(pc.DiceWhere()));
													land.get(pc.DiceWhere()).setLandOwner(2);
													timeLate(300);
													System.out.println("\t\t" + "PBK가 땅을 인수했습니다.");
													timeLate(300);
													pc.Money();
													timeLate(300);
													System.out.println("\t\t" + "PBK턴을 종료합니다.");
													break;
												} else {
													System.out.println("\t\t" + "PBK가 인수하지않고 턴을 종료했습니다.");
													break;
												}
											}
										} else if (land.get(pc.DiceWhere()).getLandOwner() == 2) {
											// PC땅
											if (land.get(pc.DiceWhere()).getLandCnt() == 1) {
												// 빌딩구입, 카운터변경
												timeLate(300);
												System.out.println("\t\t" + "PBK가 빌딩을 구입했습니다.");
												op.pcBuildingBuy(pc, land.get(pc.DiceWhere()));
												land.get(pc.DiceWhere()).setLandCnt(2);
												timeLate(300);
												pc.Money();
												timeLate(300);
												System.out.println("\t\t" + "PBK턴을 종료합니다.");
												break;
											} else if (land.get(pc.DiceWhere()).getLandCnt() == 2) {
												// 호텔구입, 카운터변경
												timeLate(300);
												System.out.println("\t\t" + "PBK가 호텔을 구입했습니다.");
												op.pcHotelBuy(pc, land.get(pc.DiceWhere()));
												land.get(pc.DiceWhere()).setLandCnt(3);
												timeLate(300);
												pc.Money();
												timeLate(300);
												System.out.println("\t\t" + "PBK턴을 종료합니다.");
												break;
											} else {
												System.out.println("\t\t" + "PBK가 건설할 건물이 없습니다.");
												timeLate(300);
												System.out.println("\t\t" + "PBK턴을 종료합니다.");
											}
										}

									}
								}
							}
						}
						if (user.getUserMoney() < 0 && pc.getPcMoney() > 0) {
							System.out.println("\t\t" + nick + "님은 파산하셨습니다...");
							timeLate(300);
							System.out.println("\t\t" + "PBK에게 패배하셨습니다.");
							;
							System.out
									.println("\t\t" + nick + "님의 전적 : " + dao2.total(nick) + "전 " + dao2.winCheck(nick)
											+ "승 " + dao2.loseCheck(nick) + "패 " + dao2.score(nick) + "점");

							timeLate(300);
							System.out.println("\t\t" + nick + "님은 PBK와의 토지매매 경쟁에서 패배하였습니다.");
							timeLate(300);
							System.out.println("\t\tPBK가 서울의 많은 토지를 장악하였고, 한국의 부동산사업은 더욱 힘들어졌습니다.");
							timeLate(300);
							System.out.println("\t\t정부는 " + nick + "님에게 실망하였고, " + nick
									+ "님은 다시 사회로 돌아가서 재기를 꿈꾸며 토지 빅데이터 공부를 다시 시작했다고 합니다.");
							System.out.println();
							timeLate(500);
							System.out.println("\t\t" + "초기화면으로 돌아갑니다.");
							System.out.println();
							timeLate(4000);
							break;
						}
						if (pc.getPcMoney() < 0 && user.getUserMoney() > 0) {

							System.out.println("\t\t" + nick + "님이 PBK를 파산시키셨습니다!!!");
							timeLate(300);
							System.out.println("\t\t" + nick + "님이 승리하셨습니다.");
							dao2.winOp(nick);

							System.out
									.println("\t\t" + nick + "님의 전적 : " + dao2.total(nick) + "전 " + dao2.winCheck(nick)
											+ "승 " + dao2.loseCheck(nick) + "패 " + dao2.score(nick) + "점");
//                     dao2.winScore(nick, dao2.winCheck(nick));
//                     System.out.println(dao2.winCheck(nick));

							// dao2.total(nick, dao2.totalCheck(nick));
							System.out.println();
							timeLate(300);
							System.out.println("\t\t" + nick + "님은 PBK와의 토지매매 경쟁에서 승리하였습니다.");
							timeLate(300);
							System.out.println("\t\tPBK는 파산하여 빚쟁이들에게 쫓겨 잠복했다고 합니다.");
							timeLate(300);
							System.out.println("\t\t정부는 " + nick + "님에게 감사의 표현으로 압구정동 사채, 청담 자택 등을 주었습니다.");
							timeLate(300);
							System.out.println("\t\t또한, 정부의 지원으로 부패한 LH를 재설립을 부탁했습니다.");
							timeLate(300);
							System.out.println("\t\t그 후, " + nick + "은 LH를 청렴하게 만들어 국민이 안정적인 부동산매매를 할 수 있었다고 합니다.");
							timeLate(500);
							System.out.println("\t\t초기화면으로 돌아갑니다.");
							System.out.println();
							timeLate(4000);
							break;
						}

					}
					while (id.equals("admin")) {
						if (id.equals("admin")) {
							System.out.println("\t\t\t" + " <<<< 관리자 모드 >>>>");
							System.out.println("\t\t" + "[1]회원정보수정 [2]회원삭제 [3]전체회원ID보기 [4]관리자 로그아웃");
							System.out.print("\t\t" + "숫자입력 >> ");
							menu = sc.next();
							System.out.println();
							if (menu.equals("2")) {
								System.out.println("\t\t\t" + "<<< 관리자 회원정보수정 >>>");
								System.out.println();
								System.out.print("\t\t" + "아이디 입력 : ");
								String change_id = sc.next();
								System.out.print("\t\t" + "변경할 닉네임 입력 : ");
								String change_nick = sc.next();

								int cnt = dao2.adminUpdate(change_id, change_nick);
								System.out.println();
								if (cnt > 0) {
									System.out.println("\t\t\t<< " + change_nick + "으로 회원정보 수정 완료 >>");
								} else {
									System.out.println("\t\t\t" + "<< 회원정보 수정 실패 >>");
								}
							} else if (menu.equals("2")) {

								System.out.println("\t\t\t" + "<<< 회원삭제 >>>");
								System.out.println("\t\t" + "삭제할 회원의 ID를 선택합니다.");
								System.out.print("\t\t" + "ID : ");
								String removeId = sc.next();

								if (dao2.check(removeId)) {

									System.out.print("\t\t" + "[" + nick + "회원을 정말 탈퇴 시키시겠습니까? ] Y / N");
									String yn = sc.next();

									if (yn.equals("y") || yn.equals("Y")) {
										int cnt = dao2.deleteId(removeId);
										if (cnt > 0) {
											System.out.println("\t\t\t" + "<< 회원삭제 완료 >>");
										}
									} else if (yn.equals("n") || yn.equals("N")) {
										System.out.println("\t\t" + "처음부터 다시 시작합니다.");
									} else {
										System.out.println("\t\t" + "다시 입력해주세요.");
									}
								} else {
									System.out.println("\t\t" + "회원이 존재하지 않습니다.");
								}
							} else if (menu.equals("3")) {

								System.out.println("\t\t\t" + " <<< 전체회원 정보보기 >>>");
								System.out.println("\t\t 랭크ID\tPW\tNICK\tWIN\tLOSE\tSCORE");
								ArrayList<LandMemberDTO> list = dao2.selectAll();

								int listNum = 1;
								for (int i = 0; i < list.size(); i++) {
									LandMemberDTO m = list.get(i);
									if (!m.getId().equals("admin")) {
										System.out.print("\t\t" + "" + (listNum++) + "위 " + m.getId());
										System.out.println("\t" + m.getPw() + "\t" + m.getNick() + "\t" + m.getWin()
												+ "\t" + m.getLose() + "\t" + m.getScore());
									}
								}

							} else if (menu.equals("4")) {
								System.out.println("\t\t\t" + "<<< 관리자 모드 종료 >>>");
								System.out.println();
								break;
							} else {
								System.out.println("\t\t" + "다시 입력해주세요.");
							}
							System.out.println();
						}
					}

				} else {
					System.out.println("\t\t\t" + "<< 로그인 실패 >>");
				}

			} else if (menu.equals("2")) {
				System.out.println("\t\t\t" + " <<< 회원가입 >>>");
				System.out.println();
				System.out.print("\t\t" + "아이디 입력 : ");
				String id = sc.next();
				System.out.print("\t\t" + "비밀번호를 입력 : ");
				String pw = sc.next();
				System.out.print("\t\t" + "닉네임 입력 : ");
				String nick = sc.next();
				int cnt = dao2.join(id, pw, nick);
				System.out.println();
				if (cnt > 0) {

					System.out.println("\t\t\t" + "<< 회원가입 성공 >>");
				} else {
					System.out.println("\t\t\t" + "<< 회원가입 실패 >>");
				}

			} else if (menu.equals("3")) {
				System.out.println("\t\t\t" + " <<< 회원정보보기 >>>");
				ArrayList<LandMemberDTO> list = dao2.selectAll();
				System.out.println("\t\t 랭크ID\tNick\tTOTAL\tWIN\tLOSE\tSCORE");
				int listNum = 1;
				for (int i = 0; i < list.size(); i++) {
					dao2.total(list.get(i).getNick());
					dao2.score(list.get(i).getNick());
					LandMemberDTO m = list.get(i);

					if (!m.getId().equals("admin")) {
						System.out.print("\t\t" + (listNum++) + "위 " + m.getId());
						System.out.println("\t" + m.getNick() + "\t" + m.getTotal() + "\t" + m.getWin() + "\t"
								+ m.getLose() + "\t" + m.getScore());
					}
				}

			} else if (menu.equals("4")) {
				System.out.println("\t\t\t" + "<<< 회원정보수정 >>>");
				System.out.println();
				System.out.println("\t\t" + "회원정보를 확인합니다.");
				System.out.print("\t\t" + "ID : ");
				String id = sc.next();
				System.out.print("\t\t" + "PASSWORD : ");
				String pw = sc.next();
				String nick = dao2.login(id, pw);
				System.out.println("\t\t" + nick + "님 회원정보가 일치합니다. 회원정보 변경하세요.");

				System.out.print("\t\t" + "변경할 NICKNAME : ");
				String new_nick = sc.next();

				System.out.print("\t\t" + "변경할 PASSWORD : ");
				String new_pw = sc.next();

				int cnt = dao2.update(id, pw, new_nick, new_pw);

				if (cnt > 0) {
					System.out.println("\t\t\t" + "<< 회원정보 수정 성공 >>");
				} else {
					System.out.println("\t\t\t" + "<< 회원정보 수정 실패 >>");
				}

			} else if (menu.equals("5")) {
				// 회원 탈퇴
				System.out.println("\t\t\t" + "<<< 회원탈퇴 >>>");
				System.out.println();
				System.out.print("\t\t" + "아이디 입력  : ");
				String id = sc.next();
				System.out.print("\t\t" + "비밀번호 입력 : ");
				String pw = sc.next();
				int cnt = dao2.delete(id, pw);
				System.out.println();
				if (cnt > 0) {
					System.out.println("\t\t\t" + "<< 회원삭제 완료 >>");
					System.out.println();
					System.out.println("\t\t다음에도 이용해주세요...");
				} else {
					System.out.println("\t\t\t" + "<< 회원삭제 실패 >>");
					System.out.println("\t\t정보가 일치하지 않습니다.");
				}
			} else if (menu.equals("6")) {
				if (mp3.isPlaying()) {

					mp3.stop();
				}
				mp3.play("C://music/엔딩크레딧.mp3");
				System.out.println("\t\t\t" + "<< Land Wars를 즐겨주신 플레이어에게 감사드립니다. >>");
				timeLate(200);
				System.out.println(
						"      :::::::::: ::::    :::  :::::::::  :::::::::::  ::::    :::   ::::::::     ::::::::   :::::::::   ::::::::::  :::::::::  ::::::::::: ::::::::::: ");
				timeLate(200);
				System.out.println(
						"     :+:        :+:+:   :+   :+:    :+:     :+:      :+:+:   :+:  :+:    :+:   :+:    :+:  :+:    :+:  :+:         :+:    :+:     :+:         :+:      ");
				timeLate(200);
				System.out.println(
						"    +:+        :+:+:+  +:+  +:+    +:+     +:+      :+:+:+  +:+  +:+          +:+         +:+    +:+  +:+         +:+    +:+     +:+         +:+       ");
				timeLate(200);
				System.out.println(
						"   +#++:++#   +#+ +:+ +#+  +#+    +:+     +#+      +#+ +:+ +#+  :#:          +#+         +#++:++#:   +#++:++#    +#+    +:+     +#+         +#+        ");
				timeLate(200);
				System.out.println(
						"  +#+        +#+  +#+#+#  +#+    +#+     +#+      +#+  +#+#+#  +#+   +#+#   +#+         +#+    +#+  +#+         +#+    +#+     +#+         +#+         ");
				timeLate(200);
				System.out.println(
						" #+#         #+#   #+#+# #+#    #+#     #+#      #+#   #+#+#  #+#    #+#   #+#    #+#  #+#    #+#  #+#         #+#    #+#     #+#         #+#          ");
				timeLate(200);
				System.out.println(
						"##########  ###    #### #########  ###########  ###    ####  ########     ########   ###    ###   ##########  #########  ###########     ###           ");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\t\t <<<<<< 강남땅부자팀 >>>>>>");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\tDirect Operations 장민서");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\tView 김태경");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\tDetail 권우진");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\tContoller 최종인");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\tDatasource 최찬호");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\tThanks to 박병관, 임승환");
				timeLate(1000);
				System.out.println();
				System.out.println("\t\t스마트인재개발원 26기 화이팅!!!");
				timeLate(10000);
				break;
			} else {
				System.out.println("\t\t" + "정확한 숫자를 다시 입력해주세요.");
			}
		}
		sc.close();
	}

	public static void timeLate(int a) {
		try {
			Thread.sleep(a);
		} catch (Exception e) {
		}
	}
}

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Op {

	// user
	public void userLandBuy(User user, LandDTO land) {
		user.money -= land.getPrice();
	}

	public void userBuildingBuy(User user, LandDTO land) {
		user.money -= land.getBuilding();
	}

	public void userHotelBuy(User user, LandDTO land) {
		user.money -= land.getHotel();
	}

	public void userPass(User user, Pc pc, LandDTO land) {
		user.money -= land.getPass();
		pc.money += land.getPass();
	}

	public void userPassBuilding(User user, Pc pc, LandDTO land) {
		user.money -= land.getPassBuilding();
		pc.money += land.getPassBuilding();
	}

	public void userPassHotel(User user, Pc pc, LandDTO land) {
		user.money -= land.getPassHotel();
		pc.money += land.getPassHotel();
	}

	public void userInterceptPrice(User user, Pc pc, LandDTO land) {
		user.money -= land.getInterceptPrice();
		pc.money += land.getInterceptPrice();
	}

	public void userInterceptPrice2(User user, Pc pc, LandDTO land) {
		user.money -= land.getInterceptPrice2();
		pc.money += land.getInterceptPrice2();
	}

	public void userInterceptPrice3(User user, Pc pc, LandDTO land) {
		user.money -= land.getInterceptPrice3();
		pc.money += land.getInterceptPrice3();
	}

	// 사회복지기금
	public void sw(User user, int sw) {
		if (sw % 2 == 0) {
			System.out.println("\t\t" + "연말정산 결과 부족한 세금을 납부하였습니다");
			user.money -= 100;
		} else {
			System.out.println("\t\t" + "연말정산 결과 세금을 환급받았습니다");
			user.money += 100;
		}
	}

	// 보너스
	public void bonus(User user, int bonus) {
		if (bonus == 1) {
			// 150
			System.out.println("\t\t" + "보유 코인 투자 성공");
			System.out.println("\t\t" + "재산 + 150억");
			user.money += 150;
		} else if (bonus == 2) {
			// 페널티 -400
			System.out.println("\t\t" + "마피아Pbk를 만나 삥뜯겼습니다");
			System.out.println("\t\t" + "재산 -400억");
			user.money -= 400;
		} else if (bonus == 3) {
			// 250
			System.out.println("\t\t" + "임대료를 받았습니다");
			System.out.println("\t\t" + "재산 +250억");
			user.money += 250;
		} else if (bonus == 4) {
			// 350
			System.out.println("\t\t" + "미니프로젝트가 대기업에 팔렸습니다");
			System.out.println("\t\t" + "재산 +350억");
			user.money += 350;
		} else if (bonus == 5) {
			// 페널티 -200
			System.out.println("\t\t" + "머스크가 망언을 했습니다");
			System.out.println("\t\t" + "재산 -200억");
			user.money -= 200;
		} else {
			// 450
			System.out.println("\t\t" + "길을 가다 민서형을 만났습니다");
			System.out.println("\t\t" + "남자가!! 450억도 없나!!");
			user.money += 450;
		}
	}

	// pc
	public void pcLandBuy(Pc pc, LandDTO land) {
		pc.money -= land.getPrice();
	}

	public void pcBuildingBuy(Pc pc, LandDTO land) {
		pc.money -= land.getBuilding();
	}

	public void pcHotelBuy(Pc pc, LandDTO land) {
		pc.money -= land.getHotel();
	}

	public void pcPass(Pc pc, User user, LandDTO land) {
		pc.money -= land.getPass();
		user.money += land.getPass();
	}

	public void pcPassBuilding(Pc pc, User user, LandDTO land) {
		pc.money -= land.getPassBuilding();
		user.money += land.getPassBuilding();
	}

	public void pcPassHotel(Pc pc, User user, LandDTO land) {
		pc.money -= land.getPassHotel();
		user.money += land.getPassHotel();
	}

	public void pcInterceptPrice(User user, Pc pc, LandDTO land) {
		pc.money -= land.getInterceptPrice();
		user.money += land.getInterceptPrice();
	}

	public void pcInterceptPrice2(User user, Pc pc, LandDTO land) {
		pc.money -= land.getInterceptPrice2();
		user.money += land.getInterceptPrice2();
	}

	public void pcInterceptPrice3(User user, Pc pc, LandDTO land) {
		pc.money -= land.getInterceptPrice3();
		user.money += land.getInterceptPrice3();
	}

	// 사회복지기금 ( 오버 로딩 )
	public void sw(Pc pc, int sw) {
		if (sw % 2 == 0) {
			System.out.println("\t\t" + "사회복지기금을 납부하였습니다");
			pc.money -= 100;
		} else {
			System.out.println("\t\t" + "은행으로부터 사회복지기금을 받았습니다");
			pc.money += 100;
		}
	}

	// 보너스 ( 오버 로딩 )
	public void bonus(Pc pc, int bonus) {
		if (bonus == 1) {
			// 150
			System.out.println("\t\t" + "PBK재산 + 150억");
			pc.money += 150;
		} else if (bonus == 2) {
			// 페널티 -400
			System.out.println("\t\t" + "PBK재산 -400억");
			pc.money -= 400;
		} else if (bonus == 3) {
			// 250
			System.out.println("\t\t" + "PBK재산 +250억");
			pc.money += 250;
		} else if (bonus == 4) {
			// 350
			System.out.println("\t\t" + "PBK재산 +350억");
			pc.money += 350;
		} else if (bonus == 5) {
			// 페널티 -200
			System.out.println("\t\t" + "PBK재산 -200억");
			pc.money -= 200;
		} else {
			// 450
			System.out.println("\t\t" + "PBK재산 +450억");
			pc.money += 450;
		}
	}

}
import java.util.ArrayList;

public class Out3 {
//

	public void outPrint(int userWhere, int pcWhere, ArrayList<LandDTO> land) {

		System.out.println(
				"+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
//		System.out.println("|8\t\t" + "|9" + ownerCheck(land.get(9).getLandOwner(), land.get(9).getLandCnt())
//				+ "|10" + ownerCheck(land.get(10).getLandOwner(), land.get(10).getLandCnt()) + "|11"
//				+ ownerCheck(land.get(11).getLandOwner(), land.get(11).getLandCnt()) + "|12"
//				+ ownerCheck(land.get(12).getLandOwner(), land.get(12).getLandCnt()) + "|13\t\t|14"
//				+ ownerCheck(land.get(14).getLandOwner(), land.get(14).getLandCnt()) + "|15"
//				+ ownerCheck(land.get(15).getLandOwner(), land.get(15).getLandCnt()) + "|16\t\t|");
		System.out.printf("|8%-14s|9%-14s|10%-13s|11%-13s|12%-13s|13%-13s|14%-13s|15%-13s|16%-13s|", "",
				ownerCheck(land.get(9).getLandOwner(), land.get(9).getLandCnt()),
				ownerCheck(land.get(10).getLandOwner(), land.get(10).getLandCnt()),
				ownerCheck(land.get(11).getLandOwner(), land.get(11).getLandCnt()),
				ownerCheck(land.get(12).getLandOwner(), land.get(12).getLandCnt()), "",
				ownerCheck(land.get(14).getLandOwner(), land.get(14).getLandCnt()),
				ownerCheck(land.get(15).getLandOwner(), land.get(15).getLandCnt()), "");
		System.out.println();
		System.out.printf(
				"|8%-14s|9%-8s%-6s|10%-7s%-6s|11%-7s%-6s|12%-7s%-6s|13%-7s%-6s|14%-7s%-6s|15%-7s%-6s|16%-7s%-6s|", " ",
				ownerCheck(land.get(9).getLandOwner(), land.get(9).getLandCnt()), "",
				ownerCheck(land.get(10).getLandOwner(), land.get(10).getLandCnt()), "",
				ownerCheck(land.get(11).getLandOwner(), land.get(11).getLandCnt()), "",
				ownerCheck(land.get(12).getLandOwner(), land.get(12).getLandCnt()), "", "", "",
				ownerCheck(land.get(14).getLandOwner(), land.get(14).getLandCnt()), "",
				ownerCheck(land.get(15).getLandOwner(), land.get(15).getLandCnt()), "", "", "");
		System.out.println();
//		System.out.println("|병원\t\t|자곡동\t\t|대방동\t\t|논현동\t\t|서초동\t\t|보너스\t\t|아현동\t\t|교북동\t\t|세무소\t\t|");
		System.out.printf("|%-13s|%-12s|%-12s|%-12s|%-12s|%-12s|%-12s|%-12s|%-12s|", "병원", "자곡동", "대방동", "논현동", "서초동",
				"보너스", "아현동", "교북동", "세무소");
		System.out.println();
		System.out.println("|" + go8(userWhere, pcWhere) + "\t\t|" + go9(userWhere, pcWhere) + "\t\t|"
				+ go10(userWhere, pcWhere) + "\t\t|" + go11(userWhere, pcWhere) + "\t\t|" + go12(userWhere, pcWhere)
				+ "\t\t|" + go13(userWhere, pcWhere) + "\t\t|" + go14(userWhere, pcWhere) + "\t\t|"
				+ go15(userWhere, pcWhere) + "\t\t|" + go16(userWhere, pcWhere) + "\t\t|");
		System.out.println("|\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|");
		System.out.println(
				"+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|7 " + ownerCheck(land.get(7).getLandOwner(), land.get(7).getLandCnt()) + "|"
				+ "당신의 말 : [○]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|17"
				+ ownerCheck(land.get(17).getLandOwner(), land.get(17).getLandCnt()) + "|");
		System.out.println(
				"|사당동\t\t|" + "당신의 땅 : [☆]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|성수동\t\t|");
		System.out.println("|" + go7(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t" + go17(userWhere, pcWhere) + "|\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+                                                                                                               +---------------+");
		System.out.println("|6 " + ownerCheck(land.get(6).getLandOwner(), land.get(6).getLandCnt()) + "|"
				+ "PBK의 말 : [●]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|18"
				+ ownerCheck(land.get(18).getLandOwner(), land.get(18).getLandCnt()) + "|");
		System.out.println(
				"|신당동\t\t|" + "PBK의 땅 : [★]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|수유동\t\t|");
		System.out.println("|" + go6(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t" + go18(userWhere, pcWhere) + "|\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+                                                                                                               +---------------+");
		System.out.println("|5 " + ownerCheck(land.get(5).getLandOwner(), land.get(5).getLandCnt()) + "|\t\t" + "\t\t"
				+ "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|19"
				+ ownerCheck(land.get(19).getLandOwner(), land.get(19).getLandCnt()) + "|");
		System.out.println("|도곡동" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|반포동\t\t|");
		System.out.println("|" + go5(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t" + go19(userWhere, pcWhere) + "|\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+                                                                                                               +---------------+");
		System.out.println("|4\t\t" + "|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|20"
				+ ownerCheck(land.get(20).getLandOwner(), land.get(20).getLandCnt()) + "\t\t|");
		System.out.println("|보너스" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|삼성동" + "\t\t|");
		System.out.println("|" + go4(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t|" + go20(userWhere, pcWhere) + "\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+                                                                                                               +---------------+");
		System.out.println("|3 " + ownerCheck(land.get(3).getLandOwner(), land.get(3).getLandCnt()) + "|\t\t" + "\t\t"
				+ "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|21"
				+ ownerCheck(land.get(21).getLandOwner(), land.get(21).getLandCnt()) + "|");
		System.out.println("|노량진동" + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|신계동\t\t|");
		System.out.println("|" + go3(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t|" + go21(userWhere, pcWhere) + "\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+                                                                                                               +---------------+");
		System.out.println("|2 " + ownerCheck(land.get(2).getLandOwner(), land.get(2).getLandCnt()) + "|\t\t" + "\t\t"
				+ "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|22" + "\t\t|");
		System.out.println("|방배동" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|" + "보너스\t\t|");
		System.out.println("|" + go2(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t|" + go22(userWhere, pcWhere) + "\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+                                                                                                               +---------------+");
		System.out.println("|1 " + ownerCheck(land.get(1).getLandOwner(), land.get(1).getLandCnt()) + "|\t\t" + "\t\t"
				+ "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|23"
				+ ownerCheck(land.get(23).getLandOwner(), land.get(23).getLandCnt()) + "|");
		System.out.println("|안암동" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|" + "수서동\t\t|");
		System.out.println("|" + go1(userWhere, pcWhere) + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
				+ "\t\t|" + go23(userWhere, pcWhere) + "\t\t|");
		System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

		System.out.println(
				"+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
		System.out.println("|0\t\t|31" + ownerCheck(land.get(31).getLandOwner(), land.get(31).getLandCnt()) + "|30"
				+ ownerCheck(land.get(30).getLandOwner(), land.get(30).getLandCnt()) + "|29"
				+ ownerCheck(land.get(29).getLandOwner(), land.get(29).getLandCnt()) + "|28"
				+ ownerCheck(land.get(28).getLandOwner(), land.get(28).getLandCnt()) + "|27\t\t|26"
				+ ownerCheck(land.get(26).getLandOwner(), land.get(26).getLandCnt()) + "|25"
				+ ownerCheck(land.get(25).getLandOwner(), land.get(25).getLandCnt()) + "|24\t\t|");
		System.out.println("|출발\t\t|압구정동\t|청담동\t\t|개포동\t\t|잠원동\t\t|보너스\t\t|잠실동\t\t|대치동\t\t|서울여행\t|");
		System.out.println("|" + go0(userWhere, pcWhere) + "\t\t|" + go31(userWhere, pcWhere) + "\t\t|"
				+ go30(userWhere, pcWhere) + "\t\t|" + go29(userWhere, pcWhere) + "\t\t|" + go28(userWhere, pcWhere)
				+ "\t\t|" + go27(userWhere, pcWhere) + "\t\t|" + go26(userWhere, pcWhere) + "\t\t|"
				+ go25(userWhere, pcWhere) + "\t\t|" + go24(userWhere, pcWhere) + "\t\t|");
		System.out.println("|\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|");
		System.out.println(
				"+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

	}

	public String ownerCheck(int landOwner, int landCnt) {
		String exp = "";
		if (landOwner == 0) {
			exp = "";
		} else if (landOwner == 1) {
			if (landCnt == 1) {
				exp = "   #";
			} else if (landCnt == 2) {
				exp = "  ##";
			} else if (landCnt == 3) {
				exp = " ###";
			}
		} else if (landOwner == 2) {
			if (landCnt == 1) {
				exp = "   @";
			} else if (landCnt == 2) {
				exp = "  @@";
			} else if (landCnt == 3) {
				exp = " @@@";
			}
		}
		return exp;
	}

	public String ownerCheck(int landOwner) {
		String exp = "";
		if (landOwner == 0) {

		} else if (landOwner == 1) {
			exp += "[☆]";
		} else if (landOwner == 2) {
			exp += "[★]";
		}
		return exp;
	}

	public String go0(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 0 && pcWhere == 0) {
			place += "[○][●]";
		} else if (userWhere == 0) {
			place += "[○]    ";
		} else if (pcWhere == 0) {
			place += "[●]    ";
		}
		return place;
	}

	public String go1(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 1 && pcWhere == 1) {
			place += "[○][●]";
		} else if (userWhere == 1) {
			place += "[○]    ";
		} else if (pcWhere == 1) {
			place += "[●]    ";
		}
//		if (userWhere == 1) {
//			place += "[○]";
//		}
//		if (pcWhere == 1) {
//			place += "[●]";
//		}
		return place;
	}

	public String go2(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 2 && pcWhere == 2) {
			place += "[○][●]";
		} else if (userWhere == 2) {
			place += "[○]    ";
		} else if (pcWhere == 2) {
			place += "[●]    ";
		}
//		if (userWhere == 2) {
//			place += "[○]";
//		}
//		if (pcWhere == 2) {
//			place += "[●]";
//		}
		return place;
	}

	public String go3(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 3 && pcWhere == 3) {
			place += "[○][●]";
		} else if (userWhere == 3) {
			place += "[○]    ";
		} else if (pcWhere == 3) {
			place += "[●]    ";
		}
//		if (userWhere == 3) {
//			place += "[○]";
//		}
//		if (pcWhere == 3) {
//			place += "[●]";
//		}
		return place;
	}

	public String go4(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 4 && pcWhere == 4) {
			place += "[○][●]";
		} else if (userWhere == 4) {
			place += "[○]    ";
		} else if (pcWhere == 4) {
			place += "[●]    ";
		}
//		if (userWhere == 4) {
//			place += "[○]";
//		}
//		if (pcWhere == 4) {
//			place += "[●]";
//		}
		return place;
	}

	public String go5(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 5 && pcWhere == 5) {
			place += "[○][●]";
		} else if (userWhere == 5) {
			place += "[○]    ";
		} else if (pcWhere == 5) {
			place += "[●]    ";
		}
//		if (userWhere == 5) {
//			place += "[○]";
//		}
//		if (pcWhere == 5) {
//			place += "[●]";
//		}
		return place;
	}

	public String go6(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 6 && pcWhere == 6) {
			place += "[○][●]";
		} else if (userWhere == 6) {
			place += "[○]    ";
		} else if (pcWhere == 6) {
			place += "[●]    ";
		}
//		if (userWhere == 6) {
//			place += "[○]";
//		}
//		if (pcWhere == 6) {
//			place += "[●]";
//		}
		return place;
	}

	public String go7(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 7 && pcWhere == 7) {
			place += "[○][●]";
		} else if (userWhere == 7) {
			place += "[○]    ";
		} else if (pcWhere == 7) {
			place += "[●]    ";
		}
//		if (userWhere == 7) {
//			place += "[○]";
//		}
//		if (pcWhere == 7) {
//			place += "[●]";
//		}
		return place;
	}

	public String go8(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 8 && pcWhere == 8) {
			place += "[○][●]";
		} else if (userWhere == 8) {
			place += "[○]    ";
		} else if (pcWhere == 8) {
			place += "[●]    ";
		}
//		if (userWhere == 8) {
//			place += "[○]";
//		}
//		if (pcWhere == 8) {
//			place += "[●]";
//		}
		return place;
	}

	public String go9(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 9) {
			place += "[○]";
		}
		if (pcWhere == 9) {
			place += "[●]";
		}
		return place;
	}

	public String go10(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 10) {
			place += "[○]";
		}
		if (pcWhere == 10) {
			place += "[●]";
		}
		return place;
	}

	public String go11(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 11) {
			place += "[○]";
		}
		if (pcWhere == 11) {
			place += "[●]";
		}
		return place;
	}

	public String go12(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 12) {
			place += "[○]";
		}
		if (pcWhere == 12) {
			place += "[●]";
		}
		return place;
	}

	public String go13(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 13) {
			place += "[○]";
		}
		if (pcWhere == 13) {
			place += "[●]";
		}
		return place;
	}

	public String go14(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 14) {
			place += "[○]";
		}
		if (pcWhere == 14) {
			place += "[●]";
		}
		return place;
	}

	public String go15(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 15) {
			place += "[○]";
		}
		if (pcWhere == 15) {
			place += "[●]";
		}
		return place;
	}

	public String go16(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 16) {
			place += "[○]";
		}
		if (pcWhere == 16) {
			place += "[●]";
		}
		return place;
	}

	public String go17(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 17) {
			place += "[○]";
		}
		if (pcWhere == 17) {
			place += "[●]";
		}
		return place;
	}

	public String go18(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 18) {
			place += "[○]";
		}
		if (pcWhere == 18) {
			place += "[●]";
		}
		return place;
	}

	public String go19(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 19) {
			place += "[○]";
		}
		if (pcWhere == 19) {
			place += "[●]";
		}
		return place;
	}

	public String go20(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 20) {
			place += "[○]";
		}
		if (pcWhere == 20) {
			place += "[●]";
		}
		return place;
	}

	public String go21(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 21) {
			place += "[○]";
		}
		if (pcWhere == 21) {
			place += "[●]";
		}
		return place;
	}

	public String go22(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 22) {
			place += "[○]";
		}
		if (pcWhere == 22) {
			place += "[●]";
		}
		return place;
	}

	public String go23(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 23) {
			place += "[○]";
		}
		if (pcWhere == 23) {
			place += "[●]";
		}
		return place;
	}

	public String go24(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 24) {
			place += "[○]";
		}
		if (pcWhere == 24) {
			place += "[●]";
		}
		return place;
	}

	public String go25(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 25) {
			place += "[○]";
		}
		if (pcWhere == 25) {
			place += "[●]";
		}
		return place;
	}

	public String go26(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 26) {
			place += "[○]";
		}
		if (pcWhere == 26) {
			place += "[●]";
		}
		return place;
	}

	public String go27(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 27) {
			place += "[○]";
		}
		if (pcWhere == 27) {
			place += "[●]";
		}
		return place;
	}

	public String go28(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 28) {
			place += "[○]";
		}
		if (pcWhere == 28) {
			place += "[●]";
		}
		return place;
	}

	public String go29(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 29) {
			place += "[○]";
		}
		if (pcWhere == 29) {
			place += "[●]";
		}
		return place;
	}

	public String go30(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 30) {
			place += "[○]";
		}
		if (pcWhere == 30) {
			place += "[●]";
		}
		return place;
	}

	public String go31(int userWhere, int pcWhere) {
		String place = "";
		if (userWhere == 31) {
			place += "[○]";
		}
		if (pcWhere == 31) {
			place += "[●]";
		}
		return place;
	}

}

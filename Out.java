
import java.util.ArrayList;

public class Out {

//   ArrayList<LandDTO> land = dao.selectAll();

   public void outPrint(int userWhere, int pcWhere, ArrayList<LandDTO> land) {

//      land.get(1).getLandOwner();

//      LandDTO m = land.get(i);
//      System.out.println("test : "+land.get(1).getLandOwner()+land.get(2).getLandOwner()+land.get(3).getLandOwner()+land.get(5).getLandOwner()+land.get(6).getLandOwner()+land.get(7).getLandOwner());

      System.out.println(
            "+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
      System.out.println("|8\t\t" + "|9" + ownerCheck(land.get(9).getLandOwner(), land.get(9).getLandCnt()) + "|10"
            + ownerCheck(land.get(10).getLandOwner(), land.get(10).getLandCnt()) + "|11"
            + ownerCheck(land.get(11).getLandOwner(), land.get(11).getLandCnt()) + "|12"
            + ownerCheck(land.get(12).getLandOwner(), land.get(12).getLandCnt()) + "|13\t\t|14"
            + ownerCheck(land.get(14).getLandOwner(), land.get(14).getLandCnt()) + "|15"
            + ownerCheck(land.get(15).getLandOwner(), land.get(15).getLandCnt()) + "|16\t\t|");
      System.out.println("|병원\t\t|자곡동\t\t|대방동\t\t|논현동\t\t|서초동\t\t|보너스\t\t|아현동\t\t|교북동\t\t|세무서\t\t|");
      System.out.println("|" + go8(userWhere, pcWhere) + "\t|" + go9(userWhere, pcWhere) + "\t|"
            + go10(userWhere, pcWhere) + "\t|" + go11(userWhere, pcWhere) + "\t|" + go12(userWhere, pcWhere) + "\t|"
            + go13(userWhere, pcWhere) + "\t|" + go14(userWhere, pcWhere) + "\t|" + go15(userWhere, pcWhere) + "\t|"
            + go16(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|");
      System.out.println(
            "+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");
      System.out.println("|7 " + ownerCheck(land.get(7).getLandOwner(), land.get(7).getLandCnt()) + "|"
            + "당신의 말 : [○]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|17"
            + ownerCheck(land.get(17).getLandOwner(), land.get(17).getLandCnt()) + "|");
      System.out.println(
            "|사당동\t\t|" + "당신의 땅 : [@]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|성수동\t\t|");
      System.out.println("|" + go7(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go17(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

      System.out.println(
            "+---------------+                                                                                                               +---------------+");
      System.out.println("|6 " + ownerCheck(land.get(6).getLandOwner(), land.get(6).getLandCnt()) + "|"
            + "PBK의 말 : [●]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|18"
            + ownerCheck(land.get(18).getLandOwner(), land.get(18).getLandCnt()) + "|");
      System.out.println(
            "|신당동\t\t|" + "PBK의 땅 : [#]" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t|수유동\t\t|");
      System.out.println("|" + go6(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go18(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

      System.out.println(
            "+---------------+                                                                                                               +---------------+");
      System.out.println("|5 " + ownerCheck(land.get(5).getLandOwner(), land.get(5).getLandCnt()) + "|\t\t" + "\t\t"
            + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|19"
            + ownerCheck(land.get(19).getLandOwner(), land.get(19).getLandCnt()) + "|");
      System.out.println("|도곡동" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|반포동\t\t|");
      System.out.println("|" + go5(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go19(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

      System.out.println(
            "+---------------+                                                                                                               +---------------+");
      System.out.println("|4 " + ownerCheck(land.get(4).getLandOwner(), land.get(4).getLandCnt()) + "|\t\t" + "\t\t"
            + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|20"
            + ownerCheck(land.get(20).getLandOwner(), land.get(20).getLandCnt()) + "|");
      System.out.println("|보너스" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|삼성동" + "\t\t|");
      System.out.println("|" + go4(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go20(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

      System.out.println(
            "+---------------+                                                                                                               +---------------+");
      System.out.println("|3 " + ownerCheck(land.get(3).getLandOwner(), land.get(3).getLandCnt()) + "|\t\t" + "\t\t"
            + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|21"
            + ownerCheck(land.get(21).getLandOwner(), land.get(21).getLandCnt()) + "|");
      System.out.println("|노량진동" + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|신계동\t\t|");
      System.out.println("|" + go3(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go21(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

      System.out.println(
            "+---------------+                                                                                                               +---------------+");
      System.out.println("|2 " + ownerCheck(land.get(2).getLandOwner(), land.get(2).getLandCnt()) + "|\t\t" + "\t\t"
            + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|22" + "\t\t|");
      System.out.println("|방배동" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|" + "보너스\t\t|");
      System.out.println("|" + go2(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go22(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "|\t\t|");

      System.out.println(
            "+---------------+                                                                                                               +---------------+");
      System.out.println("|1 " + ownerCheck(land.get(1).getLandOwner(), land.get(1).getLandCnt()) + "|\t\t" + "\t\t"
            + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|23"
            + ownerCheck(land.get(23).getLandOwner(), land.get(23).getLandCnt()) + "|");
      System.out.println("|안암동" + "\t\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t|" + "수서동\t\t|");
      System.out.println("|" + go1(userWhere, pcWhere) + "\t|\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t" + "\t\t"
            + "\t\t|" + go23(userWhere, pcWhere) + "\t|");
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
      System.out.println("|" + go0(userWhere, pcWhere) + "\t|" + go31(userWhere, pcWhere) + "\t|"
            + go30(userWhere, pcWhere) + "\t|" + go29(userWhere, pcWhere) + "\t|" + go28(userWhere, pcWhere) + "\t|"
            + go27(userWhere, pcWhere) + "\t|" + go26(userWhere, pcWhere) + "\t|" + go25(userWhere, pcWhere) + "\t|"
            + go24(userWhere, pcWhere) + "\t|");
      System.out.println("|\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|" + "\t\t|");
      System.out.println(
            "+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+---------------+");

   }

   public String ownerCheck(int landOwner, int landCnt) {
      String exp = "";
      if (landOwner == 0) {
         exp += "\t\t";
      } else if (landOwner == 1) {
         if (landCnt == 1) {
            exp += "@\t\t";
         } else if (landCnt == 2) {
            exp += "@@\t\t";
         } else if (landCnt == 3) {
            exp += "@@@\t\t";
         }
      } else if (landOwner == 2) {
         if (landCnt == 1) {
            exp += "#\t\t";
         } else if (landCnt == 2) {
            exp += "##\t\t";
         } else if (landCnt == 3) {
            exp += "###\t\t";
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
   // go 옆에 탭 떼고 기본 장소에 탭부여

   public String go0(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 0 && pcWhere == 0) {
         place = "[○][●]";
      } else if (userWhere == 0) {
         place += "[○]";
      } else if (pcWhere == 0) {
         place += "[●]";
      }
//      if( userWhere == 0 && pcWhere == 0) {
//         place += "[○][●]";
//      } else if (userWhere == 0) {
//         place += "[○]    ";
//      } else if (pcWhere == 0) {
//         place += "[●]    ";
//      }
      return place;
   }

   public String go1(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 1 && pcWhere == 1) {
         place = "[○][●]";
      } else if (userWhere == 1) {
         place += "[○]";
      } else if (pcWhere == 1) {
         place += "[●]";
      }
//      if (userWhere == 1) {
//         place += "[○]";
//      }
//      if (pcWhere == 1) {
//         place += "[●]";
//      }
      return place;
   }

   public String go2(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 2 && pcWhere == 2) {
         place = "[○][●]";
      } else if (userWhere == 2) {
         place += "[○]";
      } else if (pcWhere == 2) {
         place += "[●]";
      }
//      if (userWhere == 2) {
//         place += "[○]";
//      }
//      if (pcWhere == 2) {
//         place += "[●]";
//      }
      return place;
   }

   public String go3(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 3 && pcWhere == 3) {
         place = "[○][●]";
      } else if (userWhere == 3) {
         place += "[○]";
      } else if (pcWhere == 3) {
         place += "[●]";
      }
//      if (userWhere == 3) {
//         place += "[○]";
//      }
//      if (pcWhere == 3) {
//         place += "[●]";
//      }
      return place;
   }

   public String go4(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 4 && pcWhere == 4) {
         place = "[○][●]";
      } else if (userWhere == 4) {
         place += "[○]";
      } else if (pcWhere == 4) {
         place += "[●]";
      }
//      if (userWhere == 4) {
//         place += "[○]";
//      }
//      if (pcWhere == 4) {
//         place += "[●]";
//      }
      return place;
   }

   public String go5(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 5 && pcWhere == 5) {
         place = "[○][●]";
      } else if (userWhere == 5) {
         place += "[○]";
      } else if (pcWhere == 5) {
         place += "[●]";
      }
//      if (userWhere == 5) {
//         place += "[○]";
//      }
//      if (pcWhere == 5) {
//         place += "[●]";
//      }
      return place;
   }

   public String go6(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 6 && pcWhere == 6) {
         place = "[○][●]";
      } else if (userWhere == 6) {
         place += "[○]";
      } else if (pcWhere == 6) {
         place += "[●]";
      }
//      if (userWhere == 6) {
//         place += "[○]";
//      }
//      if (pcWhere == 6) {
//         place += "[●]";
//      }
      return place;
   }

   public String go7(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 7 && pcWhere == 7) {
         place = "[○][●]";
      } else if (userWhere == 7) {
         place += "[○]";
      } else if (pcWhere == 7) {
         place += "[●]";
      }
//      if (userWhere == 7) {
//         place += "[○]";
//      }
//      if (pcWhere == 7) {
//         place += "[●]";
//      }
      return place;
   }

   public String go8(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 8 && pcWhere == 8) {
         place = "[○][●]";
      } else if (userWhere == 8) {
         place += "[○]";
      } else if (pcWhere == 8) {
         place += "[●]";
      }
//      if (userWhere == 8) {
//         place += "[○]";
//      }
//      if (pcWhere == 8) {
//         place += "[●]";
//      }
      return place;
   }

   public String go9(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 9 && pcWhere == 9) {
         place = "[○][●]";
      } else if (userWhere == 9) {
         place += "[○]";
      } else if (pcWhere == 9) {
         place += "[●]";
      }
      return place;
   }

   public String go10(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 10 && pcWhere == 10) {
         place = "[○][●]";
      } else if (userWhere == 10) {
         place += "[○]";
      } else if (pcWhere == 10) {
         place += "[●]";
      }
      return place;
   }

   public String go11(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 11 && pcWhere == 11) {
         place = "[○][●]";
      } else if (userWhere == 11) {
         place += "[○]";
      } else if (pcWhere == 11) {
         place += "[●]";
      }
      return place;
   }

   public String go12(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 12 && pcWhere == 12) {
         place = "[○][●]";
      } else if (userWhere == 12) {
         place += "[○]";
      } else if (pcWhere == 12) {
         place += "[●]";
      }
      return place;
   }

   public String go13(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 13 && pcWhere == 13) {
         place = "[○][●]";
      } else if (userWhere == 13) {
         place += "[○]";
      } else if (pcWhere == 13) {
         place += "[●]";
      }
      return place;
   }

   public String go14(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 14 && pcWhere == 14) {
         place = "[○][●]";
      } else if (userWhere == 14) {
         place += "[○]";
      } else if (pcWhere == 14) {
         place += "[●]";
      }
      return place;
   }

   public String go15(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 15 && pcWhere == 15) {
         place = "[○][●]";
      } else if (userWhere == 15) {
         place += "[○]";
      } else if (pcWhere == 15) {
         place += "[●]";
      }
      return place;
   }

   public String go16(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 16 && pcWhere == 16) {
         place = "[○][●]";
      } else if (userWhere == 16) {
         place += "[○]";
      } else if (pcWhere == 16) {
         place += "[●]";
      }
      return place;
   }

   public String go17(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 17 && pcWhere == 17) {
         place = "[○][●]";
      } else if (userWhere == 17) {
         place += "[○]";
      } else if (pcWhere == 17) {
         place += "[●]";
      }
      return place;
   }

   public String go18(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 18 && pcWhere == 18) {
         place = "[○][●]";
      } else if (userWhere == 18) {
         place += "[○]";
      } else if (pcWhere == 18) {
         place += "[●]";
      }
      return place;
   }

   public String go19(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 19 && pcWhere == 19) {
         place = "[○][●]";
      } else if (userWhere == 19) {
         place += "[○]";
      } else if (pcWhere == 19) {
         place += "[●]";
      }
      return place;
   }

   public String go20(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 20 && pcWhere == 20) {
         place = "[○][●]";
      } else if (userWhere == 20) {
         place += "[○]";
      } else if (pcWhere == 20) {
         place += "[●]";
      }
      return place;
   }

   public String go21(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 21 && pcWhere == 21) {
         place = "[○][●]";
      } else if (userWhere == 21) {
         place += "[○]";
      } else if (pcWhere == 21) {
         place += "[●]";
      }
      return place;
   }

   public String go22(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 22 && pcWhere == 22) {
         place = "[○][●]";
      } else if (userWhere == 22) {
         place += "[○]";
      } else if (pcWhere == 22) {
         place += "[●]";
      }
      return place;
   }

   public String go23(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 23 && pcWhere == 23) {
         place = "[○][●]";
      } else if (userWhere == 23) {
         place += "[○]";
      } else if (pcWhere == 23) {
         place += "[●]";
      }
      return place;
   }

   public String go24(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 24 && pcWhere == 24) {
         place = "[○][●]";
      } else if (userWhere == 24) {
         place += "[○]";
      } else if (pcWhere == 24) {
         place += "[●]";
      }
      return place;
   }

   public String go25(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 25 && pcWhere == 25) {
         place = "[○][●]";
      } else if (userWhere == 25) {
         place += "[○]";
      } else if (pcWhere == 25) {
         place += "[●]";
      }
      return place;
   }

   public String go26(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 26 && pcWhere == 26) {
         place = "[○][●]";
      } else if (userWhere == 26) {
         place += "[○]";
      } else if (pcWhere == 26) {
         place += "[●]";
      }
      return place;
   }

   public String go27(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 27 && pcWhere == 27) {
         place = "[○][●]";
      } else if (userWhere == 27) {
         place += "[○]";
      } else if (pcWhere == 27) {
         place += "[●]";
      }
      return place;
   }

   public String go28(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 28 && pcWhere == 28) {
         place = "[○][●]";
      } else if (userWhere == 28) {
         place += "[○]";
      } else if (pcWhere == 28) {
         place += "[●]";
      }
      return place;
   }

   public String go29(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 29 && pcWhere == 29) {
         place = "[○][●]";
      } else if (userWhere == 29) {
         place += "[○]";
      } else if (pcWhere == 29) {
         place += "[●]";
      }
      return place;
   }

   public String go30(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 30 && pcWhere == 30) {
         place = "[○][●]";
      } else if (userWhere == 30) {
         place += "[○]";
      } else if (pcWhere == 30) {
         place += "[●]";
      }
      return place;
   }

   public String go31(int userWhere, int pcWhere) {
      String place = "\t";
      if (userWhere == 31 && pcWhere == 31) {
         place = "[○][●]";
      } else if (userWhere == 31) {
         place += "[○]";
      } else if (pcWhere == 31) {
         place += "[●]";
      }
      return place;
   }

}
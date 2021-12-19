import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class LandMemberDAO {

   private Connection conn;
   private PreparedStatement psmt;
   private ResultSet rs;
   Scanner sc = new Scanner(System.in);

   // 데이터 베이스에 연결시키는 기능

   private void getConnection() {

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
         String db_id = "campus_f_3_1209";
         String db_pw = "smhrd3";
         conn = DriverManager.getConnection(db_url, db_id, db_pw);
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   private void close() {
      try {
         if (psmt != null) {
            psmt.close();
         }
         if (conn != null) {
            conn.close();
         }
         if (rs != null) {
            rs.close();
         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   // 로그인 기능
   public String login(String id, String pw) {
      String nick = null;
      getConnection();
      try {
         String sql = "select * from LandMember where id = ? and pw = ?";
         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pw);

         rs = psmt.executeQuery();

         if (rs.next()) {
            nick = rs.getString("nick");
         } else {
            nick = null;
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return nick;
   }

   public int join(String id, String pw, String nick) {
      getConnection();
      int cnt = 0;
      try {
         String sql = "select * from LandMember where id= ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);

         rs = psmt.executeQuery();

         if (rs.next()) {
            cnt = -1;
         } else {
            sql = "insert into LandMember(id, pw, nick ) values(?,?,?)";
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, id);
            psmt.setString(2, pw);
            psmt.setString(3, nick);

            cnt = psmt.executeUpdate();

         }
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;
   }

   public int update(String id, String pw, String new_nick, String new_pw) {
      int cnt = 0;
      getConnection();
      try {

         // 3. SQL문 작성 및 실행
         String sql = "update LandMember set nick = ?, pw =? where id =? and pw = ?";
         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql);

         psmt.setString(1, new_nick);
         psmt.setString(2, new_pw);
         psmt.setString(3, id);
         psmt.setString(4, pw);
         cnt = psmt.executeUpdate();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;
   }

   public ArrayList<LandMemberDTO> selectAll() {
      ArrayList<LandMemberDTO> list = new ArrayList<LandMemberDTO>();
      getConnection();

      try {
         String sql = "select * from LandMember order by score desc";
         psmt = conn.prepareStatement(sql);
         rs = psmt.executeQuery();

         while (rs.next()) {
            String id = rs.getString("id");
            String pw = rs.getString("pw");
            String nick = rs.getString("nick");
            int win = rs.getInt("win");
            int lose = rs.getInt("lose");
            int score = rs.getInt("score");
            int total = rs.getInt("total");
            LandMemberDTO m = new LandMemberDTO(id, pw, nick, win, lose, score, total);
            list.add(m);
         }

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return list;
   }

   public int delete(String id, String pw) {
      int cnt = 0;
      getConnection();

      try {
         String sql = "delete from LandMember where id= ? and pw = ?";
         psmt = conn.prepareStatement(sql);

         psmt.setString(1, id);
         psmt.setString(2, pw);

         cnt = psmt.executeUpdate();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;
   }

   public int adminUpdate(String change_id, String change_nick) {
      getConnection();
      int cnt = 0;

      try {

         String sql = "update landMember set nick = ? where id =?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, change_nick);
         psmt.setString(2, change_id);
         cnt = psmt.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;
   }

   public int deleteId(String id) {
      int cnt = 0;
      getConnection();
      try {
         String sql = "delete from LandMember where id= ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         cnt = psmt.executeUpdate();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;
   }

   public boolean check(String removeId) {
      ArrayList<LandMemberDTO> list = new ArrayList<LandMemberDTO>();
      getConnection();
      boolean exist = false;

      try {
         String sql = "select * from LandMember where id=?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, removeId);
         rs = psmt.executeQuery();
         exist = rs.next();

      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return exist;
   }

   public int winCheck(String nick) {
      int win = 0;
      getConnection();
      try {
         String sql = "select * from LandMember where nick = ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, nick);

         rs = psmt.executeQuery();

         if (rs.next()) {
            win = rs.getInt("win");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return win;
   }

   public int winOp(String nick) {
      int win = 0;
      int lose = 0;
      int cnt = 0;
      getConnection();
      try {

         String sql = "select * from LandMember where nick = ?";
         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, nick);

         rs = psmt.executeQuery();

         if (rs.next()) {
            lose = rs.getInt("lose");
            win = rs.getInt("win");
         }

         win += 1;
         lose -= 1;
         sql = "update LandMember set win =? where nick=?";

         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql);
         psmt.setInt(1, win);
         psmt.setString(2, nick);

         cnt = psmt.executeUpdate();
         sql = "update LandMember set lose =? where nick=?";
         psmt = conn.prepareStatement(sql);
         psmt.setInt(1, lose);
         psmt.setString(2, nick);
         cnt = psmt.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return win;
   }

   public int loseCheck(String nick) {
      int lose = 0;
      getConnection();
      try {
         String sql = "select * from LandMember where nick = ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, nick);

         rs = psmt.executeQuery();

         if (rs.next()) {
            lose = rs.getInt("lose");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return lose;
   }

   public int loseOp(String nick) {
      int lose = 0;
      getConnection();
      try {

         String sql = "select * from LandMember where nick = ?";
         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, nick);

         rs = psmt.executeQuery();

         if (rs.next()) {
            lose = rs.getInt("lose");
         }

         lose += 1;

         String sql2 = "update LandMember set lose =? where nick=?";
         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql2);
         psmt.setInt(1, lose);
         psmt.setString(2, nick);

         psmt.executeUpdate();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         close();
      }
      return lose;
   }

   public int total(String nick) {
      int total = 0;
      int lose = 0;
      int win = 0;
      getConnection();
      try {
         String sql = "select * from landmember where nick= ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, nick);
         rs = psmt.executeQuery();
         if (rs.next()) {
            lose = rs.getInt("win");
            win = rs.getInt("lose");
            total = rs.getInt("total");
         } else {
            total = 0;
         }
         String sql2 = "update landmember set total = ? where nick = ?";
         psmt = conn.prepareStatement(sql2);
         total = win + lose;
         psmt.setInt(1, total);
         psmt.setString(2, nick);
         psmt.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return total;
   }

   public int score(String nick) {
      int score = 0;
      int lose = 0;
      int win = 0;
      getConnection();
      try {
         String sql = "select * from landmember where nick= ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, nick);
         rs = psmt.executeQuery();
         if (rs.next()) {
            win = rs.getInt("win");
            lose = rs.getInt("lose");
            score = rs.getInt("score");
         } else {
            score = 1000;
         }
         score = 1000 + (win * 200) + (lose * -100);
         String sql2 = "update landmember set score =? where nick=?";
         psmt = conn.prepareStatement(sql2);
         psmt.setInt(1, score);
         psmt.setString(2, nick);
         psmt.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }

      return score;

   }

   public void totalOP(String nick, int total) {
      int cnt = 0;
      getConnection();
      try {
         total += 1;
         String sql2 = "update landmember set total = ? where nick = ?";
         // PreparedStatement 스트링 안에 ?를 채워줄 수 있음
         psmt = conn.prepareStatement(sql2);
         psmt.setInt(1, total);
         psmt.setString(2, nick);
         cnt = psmt.executeUpdate();

      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
   }

}
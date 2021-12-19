import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class LandDAO {

	// DAO -> DataBase Access Object
	// 데이터 베이스에 접근하기 위한 객체를 만들 수 있는 클래스
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// 드라이버 로딩과 커넥션 객체를 가져오는 메소드
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_3_1209";
			String db_pw = "smhrd3";
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// DataBase와 연결을 끊어주는 메소드
	private void close() {
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
				if (rs != null) {
					rs.close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<LandDTO> selectAll() {
		ArrayList<LandDTO> list = new ArrayList<LandDTO>();

		getConnection();

		try {
			String sql = "select * from Land";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String landName = rs.getString("landName");
				int price = rs.getInt("price");
				int building = rs.getInt("building");
				int hotel = rs.getInt("hotel");
				int pass = rs.getInt("pass");
				int passBuilding = rs.getInt("passBuilding");
				int passHotel = rs.getInt("passHotel");
				int interceptPrice = rs.getInt("interceptPrice");
				int interceptPrice2 = rs.getInt("interceptPrice2");
				int interceptPrice3 = rs.getInt("interceptPrice3");
				int landOwner = rs.getInt("landowner");
				int landCnt = rs.getInt("landcnt");
				int landNumber = rs.getInt("landnumber");

//				System.out.println("landOwnerDAO"+landOwner);

				LandDTO m = new LandDTO(landName, price, building, hotel, pass, passBuilding, passHotel, interceptPrice,
						interceptPrice2, interceptPrice3, landOwner, landCnt, landNumber);
				list.add(m);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;

	}

}
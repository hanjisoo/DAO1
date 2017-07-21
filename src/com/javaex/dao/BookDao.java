package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.javaex.vo.BookVo;


public class BookDao {
	public int insert(BookVo bookVo) {//클래스불르고 별명지음
		int count=-1;//insert실패하면 -1줘
		
		String title =bookVo.getTitle();
		String pubs=bookVo.getPubs();
		String date=bookVo.getDate();
		int authorId=bookVo.getAuthorId();

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			System.out.println("접속성공");

			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "INSERT INTO book VALUES(seq_book_id.nextval,?,?,?,?)";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, title);
			pstmt.setString(2, pubs);
			pstmt.setString(3, date);
			pstmt.setInt(4, authorId);
			count = pstmt.executeUpdate();

			// 4.결과처리
			System.out.println(count + "건 정리");
		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패-" + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			// 5. 자원정리
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		return count;
	}
}

package org.work.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

	@Test
	public void tstConnect() throws Exception {

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // localhost占쏙옙占� ip占쌍소곤옙 占쏙옙載ο옙占쏙옙占�
		String id = "bit03";
		String pw = "bit03";

		Class.forName("oracle.jdbc.driver.OracleDriver");

		long start = System.currentTimeMillis();
		log.info("====================1");
		log.info("====================2");

		for (int i = 0; i < 30; i++) {
			Connection con = DriverManager.getConnection(url, id, pw);

			log.info(con);

			con.close();
		}
		long end = System.currentTimeMillis();
		log.info("====================3");
		log.info("====================4");
		log.info("Total" + (end - start));

	}

}

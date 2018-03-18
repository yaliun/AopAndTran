package net.yaliun.aop.support;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysqlConnectionTest {
	private static final Logger logger = LoggerFactory.getLogger(MysqlConnectionTest.class);
	
//	private static final String DRIVER = "com.mysql.jbdc.Driver";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";  //Mysql Driver 6.0	
	private static final String URL = "jdbc:mysql://localhost:3306/sample";
	private static final String USER = "yaliun";
	private static final String PW = "yaliun";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			assertNotNull(con);
			logger.debug("Connection : {}", con);
		}catch (Exception e) {
			fail();
			e.printStackTrace();			
		}
	}
}

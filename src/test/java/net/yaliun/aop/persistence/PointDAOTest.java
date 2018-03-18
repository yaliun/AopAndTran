package net.yaliun.aop.persistence;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class PointDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(PointDAOTest.class);
	
	@Inject
	private PointDAO dao;
	
	@Test
	public void testupdatePoint() throws Exception{
		
		dao.updatePoint("yaliun", 100);
	}
}

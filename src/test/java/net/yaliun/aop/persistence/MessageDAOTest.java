package net.yaliun.aop.persistence;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.yaliun.aop.domain.MessageVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MessageDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(MessageDAOTest.class);
	
	@Inject
	private MessageDAO dao;
	
	@Test
	public void testCreate() throws Exception {
		MessageVO msg = new MessageVO();
		msg.setTargetid("test1");
		msg.setSender("sender");
		msg.setMessage("테스트 메세지");		
		
		dao.create(msg);
	}

	@Test
	public void testreadMessage() throws Exception{
		logger.info(dao.readMessage(1).toString());
	}
	
	@Test
	public void testupdateState() throws Exception{
		
		dao.updateState(1);
	}
	
	@Test
	public void testDelete() throws Exception{
		dao.deleteMessage(1);
	}	
}

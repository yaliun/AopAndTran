package net.yaliun.aop.persistence;

import net.yaliun.aop.domain.MessageVO;

public interface MessageDAO {
	public void create(MessageVO vo) throws Exception;
	public MessageVO readMessage(Integer mid) throws Exception;
	public void updateState(Integer mid) throws Exception;
	public void deleteMessage(Integer mid) throws Exception;
}
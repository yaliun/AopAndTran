package net.yaliun.aop.service;

import net.yaliun.aop.domain.MessageVO;

public interface MessageService {

	public void addMessage(MessageVO vo) throws Exception;
	public MessageVO readMessage(String uid, Integer mid) throws Exception;
}

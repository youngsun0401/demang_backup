package org.pro.demang.service;

import java.util.Map;

import org.pro.demang.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	private PostMapper mapper;

	@Override
	public void postInsert(String p_content, byte[] bytes) {
		
		mapper.postInsert(p_content, bytes);
		
	}


	
	
}

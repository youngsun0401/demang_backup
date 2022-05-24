package org.pro.demang.service;

import org.pro.demang.mapper.PagingMapper;
import org.pro.demang.model.ContactUsDTO;
import org.pro.demang.model.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PagingServiceImpl {

	@Autowired
	private PagingMapper mapper;

	
	public Page<ContactUsDTO> getUserList(int pageNo) throws Exception {
        PageHelper.startPage(pageNo, 10);
        return mapper.findUser();
    }

}
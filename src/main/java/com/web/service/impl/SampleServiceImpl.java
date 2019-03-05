package com.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mapper.SampleMapper;
import com.web.service.SampleService;

@Service("SampleService")
public class SampleServiceImpl implements SampleService{
	
	@Autowired
	SampleMapper sample;
	
	@Override
	public String sampleSysdate() throws Exception {
		return sample.sampleSysdate();
	}
}

package com.web.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
	public String sampleSysdate() throws Exception;
}

package com.lcm.service;

import com.lcm.pojo.Filename;

public interface FilenameService {



    int deleteByPrimaryKey(Integer fileId);

    int insert(Filename record);

    int insertSelective(Filename record);

    Filename selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(Filename record);

    int updateByPrimaryKey(Filename record);

}

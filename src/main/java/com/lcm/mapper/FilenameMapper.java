package com.lcm.mapper;

import com.lcm.pojo.Filename;

public interface FilenameMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(Filename record);

    int insertSelective(Filename record);

    Filename selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(Filename record);

    int updateByPrimaryKey(Filename record);
}
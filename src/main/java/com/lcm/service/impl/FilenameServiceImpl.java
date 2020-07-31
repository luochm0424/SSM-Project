package com.lcm.service.impl;

import com.lcm.mapper.FilenameMapper;
import com.lcm.pojo.Filename;
import com.lcm.service.FilenameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilenameServiceImpl implements FilenameService {

    @Autowired
    FilenameMapper mapper;

    @Override
    public int deleteByPrimaryKey(Integer fileId) {
        return mapper.deleteByPrimaryKey(fileId);
    }

    @Override
    public int insert(Filename record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Filename record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Filename selectByPrimaryKey(Integer fileId) {
        return mapper.selectByPrimaryKey(fileId);
    }

    @Override
    public int updateByPrimaryKeySelective(Filename record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Filename record) {
        return mapper.updateByPrimaryKey(record);
    }
}

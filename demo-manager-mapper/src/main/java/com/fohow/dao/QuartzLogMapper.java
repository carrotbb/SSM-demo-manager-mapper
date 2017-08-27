package com.fohow.dao;

import com.fohow.entity.QuartzLog;
import com.fohow.entity.QuartzLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuartzLogMapper {
    int countByExample(QuartzLogExample example);

    int deleteByExample(QuartzLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(QuartzLog record);

    int insertSelective(QuartzLog record);

    List<QuartzLog> selectByExample(QuartzLogExample example);

    QuartzLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QuartzLog record, @Param("example") QuartzLogExample example);

    int updateByExample(@Param("record") QuartzLog record, @Param("example") QuartzLogExample example);

    int updateByPrimaryKeySelective(QuartzLog record);

    int updateByPrimaryKey(QuartzLog record);
}
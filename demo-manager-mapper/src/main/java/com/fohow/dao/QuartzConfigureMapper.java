package com.fohow.dao;

import com.fohow.entity.QuartzConfigure;
import com.fohow.entity.QuartzConfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuartzConfigureMapper {
    int countByExample(QuartzConfigureExample example);

    int deleteByExample(QuartzConfigureExample example);

    int deleteByPrimaryKey(String id);

    int insert(QuartzConfigure record);

    int insertSelective(QuartzConfigure record);

    List<QuartzConfigure> selectByExample(QuartzConfigureExample example);

    QuartzConfigure selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") QuartzConfigure record, @Param("example") QuartzConfigureExample example);

    int updateByExample(@Param("record") QuartzConfigure record, @Param("example") QuartzConfigureExample example);

    int updateByPrimaryKeySelective(QuartzConfigure record);

    int updateByPrimaryKey(QuartzConfigure record);
}
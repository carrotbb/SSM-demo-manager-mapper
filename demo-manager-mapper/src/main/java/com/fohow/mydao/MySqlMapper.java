package com.fohow.mydao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MySqlMapper {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	private static String namespace="mysql.";
	
	/**
	 * �@ȡȫ���W���ķ֔�
	 * @return
	 */
	public List<Map<String,Object>> getlist(){
		return sqlSessionTemplate.selectList(namespace+"selectAllStudentAndScore");
	}
}

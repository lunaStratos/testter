package com.testter.myapp.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testter.myapp.Mapper.accountMapper;
import com.testter.myapp.vo.loginVO;

@Repository
public class accountDAO {
	
	@Autowired
	SqlSession sqlsession;
	
	public loginVO login(loginVO login) {
		accountMapper mapper = sqlsession.getMapper(accountMapper.class);
		loginVO result = mapper.login(login);
		
		return result;

	}

}

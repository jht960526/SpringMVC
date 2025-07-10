package com.example.springBoard.dao;

import com.example.springBoard.annotation.LogException;
import com.example.springBoard.dto.UserVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
    private static final String NAMESPACE = "mappers.user.UserSQLMapper";

    @Autowired
    private SqlSession sqlSession;

    // 회원가입
    @Override
    @LogException
    public void insertUser(UserVo param){
        sqlSession.insert(NAMESPACE+".insertUser",param);
    }
}

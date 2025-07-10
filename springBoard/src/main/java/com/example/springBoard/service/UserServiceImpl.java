package com.example.springBoard.service;

import com.example.springBoard.annotation.LogException;
import com.example.springBoard.dao.UserDAO;
import com.example.springBoard.dto.UserVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDAO userDAO;

    @Autowired
    SqlSession sqlSession;

    // 문자열
    private static final String NAMESPACE = "mappers.user.UserSQLMapper";

    // 회원가입
    @Override
    @LogException
    public void insertUser(UserVo param){
        userDAO.insertUser(param);
    }

    // 번호 중복값 체크
    public boolean isPhoneDuplicate(String phone) {
        return sqlSession.selectOne(NAMESPACE + ".isPhoneDuplicate", phone) != null;
    }

}

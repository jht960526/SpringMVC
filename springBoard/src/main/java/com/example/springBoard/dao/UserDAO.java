package com.example.springBoard.dao;

import com.example.springBoard.dto.UserVo;

public interface UserDAO {
    // 회원가입
    public void insertUser(UserVo param);
}

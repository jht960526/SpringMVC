package com.example.springBoard.service;

import com.example.springBoard.dto.UserVo;

public interface UserService {
    //회원가입
    public void insertUser(UserVo param);

    // 번호 중복값 체크
    public boolean isPhoneDuplicate(String phone);
}

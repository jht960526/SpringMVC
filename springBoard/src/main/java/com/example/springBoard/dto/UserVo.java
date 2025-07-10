package com.example.springBoard.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class UserVo {
    private final String user_id; // 유저 아이디
    private final String user_name; // 유저 이름
    private final String user_pw; // 유저 비밀번호
    private final String user_nickname; // 유저 닉네임
    private final String user_image; // 프로필 이미지
    private final String user_gender; // 유저 성별
    private Date user_birth; // 유저 생년월일
    private String user_phone; // 유저 휴대폰 번호
    private String user_email; // 유저 이메일
    private String user_status; // 유저 상태
    private Date user_join_date; // 유저 가입 일자
    private Date user_last_login_date; // 최종 로그인 일자

    public UserVo(String user_id, String user_name, String user_pw, String user_nickname, String user_gender,
                  Date user_birth, String user_phone, String user_email) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pw = user_pw;
        this.user_nickname = user_nickname;
        this.user_gender = user_gender;
        this.user_birth = user_birth;
        this.user_phone = user_phone;
        this.user_email = user_email;
        this.user_image = "default-user-image.jpg";
        this.user_status = "active";
        this.user_join_date = new Date(); // now
        this.user_last_login_date = new Date(); // now
    }
}

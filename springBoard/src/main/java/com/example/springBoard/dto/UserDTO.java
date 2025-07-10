package com.example.springBoard.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter @Setter
public class UserDTO {
    private String user_id; // 유저 아이디
    private String user_name; // 유저 이름
    private String user_pw; // 유저 비밀번호
    private String user_nickname; // 유저 닉네임
    private String user_image; // 프로필 이미지
    private String user_gender; // 유저 성별
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date user_birth; // 유저 생년월일
    private String user_phone; // 유저 휴대폰 번호
    private String user_email; // 유저 이메일
    private String user_status; // 유저 상태
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date user_join_date; // 유저 가입 일자
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date user_last_login_date; // 최종 로그인 일자
}

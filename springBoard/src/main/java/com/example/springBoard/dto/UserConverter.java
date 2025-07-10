package com.example.springBoard.dto;

public class UserConverter {
    public static UserVo toVO(UserDTO dto){
        return new UserVo(
                dto.getUser_id(),
                dto.getUser_name(),
                dto.getUser_pw(),
                dto.getUser_nickname(),
                dto.getUser_gender(),
                dto.getUser_birth(),
                dto.getUser_phone(),
                dto.getUser_email()
        );
    }
}

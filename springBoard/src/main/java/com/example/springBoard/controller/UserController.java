package com.example.springBoard.controller;

import com.example.springBoard.annotation.LogException;
import com.example.springBoard.dto.UserConverter;
import com.example.springBoard.dto.UserDTO;
import com.example.springBoard.dto.UserVo;
import com.example.springBoard.service.UserService;
import org.checkerframework.checker.units.qual.C;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user/*")
public class UserController {
    @Autowired
    UserService userService;

    // 회원가입 페이지
    @GetMapping(value = "register")
    @LogException
    public String registerPage() {
        return "user/register";
    }

    // 회원가입 프로세스
    @PostMapping(value = "insertUserProcess")
    @LogException
    public String insertUserProcess(@ModelAttribute UserDTO userDTO, Model model) {
        if (userService.isPhoneDuplicate(userDTO.getUser_phone())) {
            // 중복 처리
            model.addAttribute("error", "이미 등록된 휴대폰 번호입니다.");
            return "user/register";
        }


        // DTO에서 먼저 비밀번호 암호화
        String hashPw = BCrypt.hashpw(userDTO.getUser_pw(), BCrypt.gensalt());
        userDTO.setUser_pw(hashPw);

        // 변환 후 VO에는 암호화된 값이 들어감
        UserVo userVo = UserConverter.toVO(userDTO);

        userService.insertUser(userVo);

        return "redirect:../";
    }

}

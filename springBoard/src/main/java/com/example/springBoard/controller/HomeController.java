package com.example.springBoard.controller;
import com.example.springBoard.annotation.LogException;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    @LogException
    public String home(Locale locale, Model model) {
        //log.info("Welcome home! The client locale is {}.", locale);
        log.info("Welcome home! The client locale is .");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        System.out.println("Controller loaded");
        return "home";
    }

    @GetMapping("/makeException")
    @LogException
    public String makeException() throws Exception {
        throw new NullPointerException();
    }
}

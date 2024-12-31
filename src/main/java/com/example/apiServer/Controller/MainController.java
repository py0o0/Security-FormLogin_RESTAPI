package com.example.apiServer.Controller;

import com.example.apiServer.Entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/do")
    public String dog() {
        return "do";
    }


    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest req, HttpServletResponse res) {
        HttpSession session = req.getSession();
        session.invalidate();
        return "logout";
    }

}

package com.freshvotes.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.freshvotes.domain.User;
import com.freshvotes.service.UserService;

@Controller
public class LoginController {

  @Autowired
  private UserService userService;

  // this controller uses the GetMapping annotation to identify the URL
  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @GetMapping("/register")
  public String register(ModelMap model) {
    model.put("user", new User());
    return "register";
  }

  // this controller uses the GetMapping annotation to post the registration page
  @PostMapping("/register")
  public String registerPost(User user) {
    userService.save(user);
    return "redirect:/login";
  }

}

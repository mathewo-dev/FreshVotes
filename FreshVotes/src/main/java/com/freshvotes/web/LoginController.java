package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  // this controller uses the GetMapping annotation to identify the URL
  @GetMapping("/login")
  public String login() {
    return "login";
  }

}

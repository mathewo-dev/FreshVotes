package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

  // this controller uses the GetMapping annotation to identify the URL
  @GetMapping("/")
  public String rootView() {
    return "index";
  }

  @GetMapping("/dashboard")
  public String dashboard() {
    return "dashboard";
  }

}

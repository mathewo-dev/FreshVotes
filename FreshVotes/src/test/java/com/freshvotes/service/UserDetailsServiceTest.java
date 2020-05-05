package com.freshvotes.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServiceTest {

  @Test
  void generate_encrypted_password() {
    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String rawPassword = "password123";
    String encodedPassword = encoder.encode(rawPassword);

    System.out.println(encodedPassword);

    // assertThat(rawPassword, not(encodedPassword));
    assertThat(rawPassword, not(encodedPassword));
  }

}

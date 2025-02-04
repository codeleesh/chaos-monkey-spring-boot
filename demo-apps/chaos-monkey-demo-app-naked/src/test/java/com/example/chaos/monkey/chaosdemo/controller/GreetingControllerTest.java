package com.example.chaos.monkey.chaosdemo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

/** @author Benjamin Wilms */
@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {

  @Autowired private MockMvc mockMvc;

  @Test
  public void shouldReturnHello() throws Exception {

    this.mockMvc
        .perform(get("/helloagain"))
        .andExpect(status().isOk())
        .andExpect(content().string("Again hello!"));
  }
}

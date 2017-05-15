package com.greenfox.groot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import com.greenfox.groot.GrootApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void withParamStatusOK() throws Exception {
    mockMvc.perform(get("/groot?message=somemessage"))
        .andExpect(status().isOk());
  }

  @Test
  public void responseSameAsExpected() throws Exception {
    mockMvc.perform(get("/groot?message=hello"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received").value("hello"))
        .andExpect(jsonPath("$.translated").value("I am Groot"));
  }

  @Test
  public void withoutParamStatusNotOk() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void errorSameAsExpected() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(jsonPath("error").value("I am Groot"));
  }

}
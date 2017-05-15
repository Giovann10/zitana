package com.greenfox.groot.controller;

import static org.junit.Assert.*;
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
public class ArrowControllerTest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void withParamStatusOK() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(status().isOk());
  }

  @Test
  public void responseSameAsExpected() throws Exception {
    mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
        .andExpect(jsonPath("$.distance").value(100.0))
        .andExpect(jsonPath("$.time").value(10.0))
        .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void withoutParamStatusNotOk() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isOk());
  }

  @Test
  public void errorSameAsExpected() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(jsonPath("error").value("I am Groot"));
  }

}
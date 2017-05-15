package com.greenfox.groot.controller;

import org.junit.Test;

import com.greenfox.groot.GrootApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
public class CargoControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void shipStatusOK() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(status().isOk());
  }

  @Test
  public void shipstatusEmpty() throws Exception {
    mockMvc.perform(get("/rocket"))
        .andExpect(jsonPath("$.shipstatus").value("empty"));
  }

  @Test
  public void shipstatus40() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=5000"))
        .andExpect(jsonPath("$.shipstatus").value("40%"));
  }

  @Test
  public void shipstatusFull() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
        .andExpect(jsonPath("$.shipstatus").value("full"));
  }

  @Test
  public void shipstatusOverloaded() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=13000"))
        .andExpect(jsonPath("$.shipstatus").value("overloaded"));
  }

  @Test
  public void shipstatusFullAndReadyTrue() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=12500"))
        .andExpect(jsonPath("$.shipstatus").value("full"))
        .andExpect(jsonPath("$.ready").value(true));
  }

  @Test
  public void shipNotReady() throws Exception {
    mockMvc.perform(get("/rocket/fill?caliber=.50&amount=13000"))
        .andExpect(jsonPath("$.shipstatus").value("overloaded"))
        .andExpect(jsonPath("$.ready").value(false));
  }

  @Test
  public void withoutParamStatusNotOk() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void errorSameAsExpected() throws Exception {
    mockMvc.perform(get("/rocket/fill"))
        .andExpect(jsonPath("error").value("I am Groot"));
  }


}
package com.greenfoxacademy.calorie.controller;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static javax.management.Query.value;
import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
  import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
  import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
  import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainRestController.class)
@WebAppConfiguration
@EnableWebMvc
public class MainRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void getmMeals_getFirst_Bacon() throws Exception {
    mockMvc.perform(get("/getmeal")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
//        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$[0].type", value("Breakfast")))
        .andExpect(jsonPath("$[0].description", value("bacon")))
        .andExpect(jsonPath("$[3].type", value("Midnight Snack")));
  }

  @Test
  public void getStats() throws Exception {
  }

  @Test
  public void postMeal() throws Exception {
  }

  @Test
  public void updateMeal() throws Exception {
  }

  @Test
  public void deleteMeal() throws Exception {
  }

}
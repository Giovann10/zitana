package com.greenfox.groot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfox.groot.GrootApplication;
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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class CalorieControllerTest {

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
  public void POST_ResponseSameAsExpected() throws Exception {
    mockMvc.perform(post("/drax/add?name=pizza&amount=2&calories=2000"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.name").value("pizza"))
        .andExpect(jsonPath("$.amount").value(2))
        .andExpect(jsonPath("$.calorie").value(2000));
  }

  @Test
  public void PUT_ResponseSameAsExpected() throws Exception {
    mockMvc.perform(post("/drax/add?name=pizza&amount=2&calories=2000"));
    mockMvc.perform(put("/drax/change?name=pizza&change=3"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.name").value("pizza"))
        .andExpect(jsonPath("$.amount").value(3))
        .andExpect(jsonPath("$.calorie").value(2000));
  }

  @Test
  public void DELETE_ResponseSameAsExpected() throws Exception {
    mockMvc.perform(post("/drax/add?name=pizza&amount=2&calories=2000"));
    mockMvc.perform(delete("/drax/delete?name=pizza"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.name").value("pizza"))
        .andExpect(jsonPath("$.amount").value(2))
        .andExpect(jsonPath("$.calorie").value(2000));
  }

  @Test
  public void withoutParamStatusNotOk() throws Exception {
    mockMvc.perform(get("/drax/add"))
        .andExpect(status().isMethodNotAllowed());
  }

  @Test
  public void withWrongMethodStatusNotOk() throws Exception {
    mockMvc.perform(post("/drax/add"))
        .andExpect(status().isIAmATeapot());
  }

  @Test
  public void JSON_POST_ResponseSameAsExpected() throws Exception {
    mockMvc.perform(post("/drax/addJSON")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"name\": \"apple\", \"amount\": \"2\", \"calorie\": \"300\"}"))
        .andExpect(status().isOk())
//        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.name").value("apple"))
        .andExpect(jsonPath("$.amount").value(2))
        .andExpect(jsonPath("$.calorie").value(300));
  }

}
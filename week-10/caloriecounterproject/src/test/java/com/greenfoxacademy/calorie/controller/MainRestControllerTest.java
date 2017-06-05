package com.greenfoxacademy.calorie.controller;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.calorie.CaloriecounterApplication;
import com.greenfoxacademy.calorie.model.Meal;
import com.greenfoxacademy.calorie.repository.MealRepository;
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
@SpringBootTest(classes = CaloriecounterApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class MainRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

//  @Autowired
//  MealRepository mealRepository;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void getmMeals_First_Element_Type_Bacon() throws Exception {
    mockMvc.perform(get("/getmeal")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$[0].type", is("Breakfast")))
        .andExpect(jsonPath("$[0].description", is("bacon")))
        .andExpect(jsonPath("$[2].calories", is(650)))
        .andExpect(jsonPath("$[3].type", is("Midnight Snack")))
//        .andExpect(jsonPath("$[3].date", is("2017-06-05")));
  }
  @Test
  public void getStats_4_1200() throws Exception {
  mockMvc.perform(get("/getstats")
        .contentType(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(content().contentType(contentType))
      .andExpect(jsonPath("$.numberOfMeals", is(4)))
      .andExpect(jsonPath("$.calories", is(1200)));
  }

  @Test
  public void postMeal_Dinner_Cucumber_200() throws Exception {
    Meal meal = new Meal("Dinner", "cucumber", 200);
    ObjectMapper mapper = new ObjectMapper();
    String jsonInput = mapper.writeValueAsString(meal);

    mockMvc.perform(post("/meal")
        .contentType(contentType)
        .content(jsonInput))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.type", is("Dinner")))
        .andExpect(jsonPath("$.description", is("cucumber")))
        .andExpect(jsonPath("$.calories", is(200)));
  }

  @Test
  public void putMeal_Dinner_Cucumber_200() throws Exception {
    Meal meal = new Meal("Dinner", "cucumber", 200);
    ObjectMapper mapper = new ObjectMapper();
    String jsonInput = mapper.writeValueAsString(meal);

    mockMvc.perform(post("/meal")
        .contentType(contentType)
        .content(jsonInput))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.type", is("Dinner")))
        .andExpect(jsonPath("$.description", is("cucumber")))
        .andExpect(jsonPath("$.calories", is(200)));
  }

}
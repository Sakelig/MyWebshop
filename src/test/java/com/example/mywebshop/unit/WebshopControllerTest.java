package com.example.mywebshop.unit;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class WebshopControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void shouldReturnHelloWorld() throws Exception {
        mvc.perform(
                        MockMvcRequestBuilders.get("/hello")
                )
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string(containsString("Hello World!")));
    }

    @Test
    public void shouldReturn418Teapot() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/helloTeapot")
            )
                .andExpect(status().isIAmATeapot())
                .andExpect(content().string(containsString("I'm a teapot")));
    }

    @Test
    public void shouldReturn200() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/api/v1")
        )
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void shouldReturnItems() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders.get("/api/v1/items")
        )
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$", hasSize(4)));
    }






}

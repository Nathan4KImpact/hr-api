package com.openclassrooms.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeApiIntegrationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath("$[0].firstName", is("Laurent") )
                );
    }

    @Test
    public void testGetEmployee() throws Exception {
        mockMvc.perform(get("/employee/2"))
                .andExpect(status().isOk())
                .andExpect(
                        jsonPath("$.firstName", is("Sophie") )
                );
    }

}

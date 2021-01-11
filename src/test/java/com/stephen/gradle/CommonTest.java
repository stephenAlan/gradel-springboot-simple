package com.stephen.gradle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

/**
 * Created by ssc on 2021-01-11 18:01 .
 * Description:
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class CommonTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void mockTest() throws Exception {
        String result = mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andReturn().getResponse().getContentAsString();
        System.out.println(result);
    }

}

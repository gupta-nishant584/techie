package io.techie.jwt;


import io.techie.jwt.controller.BaseController;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(BaseController.class)
public class JwtApplicationTests {

    private MockMvc mockMvc;

    @InjectMocks
    private BaseController baseController;

    private static final String helloEndpoint = "/hello";

    @Before
    public  void setMockMvc(){
        mockMvc = MockMvcBuilders.standaloneSetup(baseController).build();
    }

    @Test
    public void helloTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get(helloEndpoint))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.TEXT_HTML_VALUE));
    }
}

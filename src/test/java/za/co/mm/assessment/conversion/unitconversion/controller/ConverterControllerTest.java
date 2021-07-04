package za.co.mm.assessment.conversion.unitconversion.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import org.springframework.web.context.WebApplicationContext;
import za.co.mm.assessment.conversion.unitconversion.UnitConversionApplication;
import za.co.mm.assessment.conversion.unitconversion.constant.TestData;

/**
 *
 * @author Nicky Mthembu
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.MOCK, classes={ UnitConversionApplication.class })
public class ConverterControllerTest {
    
    private MockMvc mockMvc;	
    @Autowired
    private WebApplicationContext webApplicationContext; 

    @Before
    public void setUp() {
             this.mockMvc = webAppContextSetup(webApplicationContext).build();                
    }

    @Test
    public void shouldReturnFahrenheit() throws Exception {         
        mockMvc.perform(post("/api/v1/celsiusfahrenheit")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.CELSIUS.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(113.0))
            .andReturn();
}   
    
    @Test
    public void shouldReturnCelsius() throws Exception {         
        mockMvc.perform(post("/api/v1/celsiusfahrenheit")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.FAHRENHEIT.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(45))
            .andReturn();
    }   
    
    @Test
    public void shouldReturnMile() throws Exception {         
        mockMvc.perform(post("/api/v1/kilometermile")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.KILOMETER.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(11.2))
            .andReturn();
    }  
    
    @Test
    public void shouldReturnKilometer() throws Exception {         
        mockMvc.perform(post("/api/v1/kilometermile")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.MILE.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(18))
            .andReturn();
    }      
    
    @Test
    public void shouldReturnGallons() throws Exception {         
        mockMvc.perform(post("/api/v1/litergallon")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.LITER.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(2.0))
            .andReturn().getResponse();               
    }      
    
    @Test
    public void shouldReturnLiter() throws Exception {         
        mockMvc.perform(post("/api/v1/litergallon")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.GALLON.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(9))
            .andReturn().getResponse();                
    }          
    @Test
    public void shouldReturnPound() throws Exception {         
        mockMvc.perform(post("/api/v1/kilogrampound")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.KILOGRAM.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(30.9))
            .andReturn().getResponse();
    }     
    
    @Test
    public void shouldReturnKilogram() throws Exception {         
        mockMvc.perform(post("/api/v1/kilogrampound")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.POUND.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(14.0))
            .andReturn().getResponse();
    }              
    
    @Test
    public void shouldReturnAcres() throws Exception {         
        mockMvc.perform(post("/api/v1/acreshectare")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.HECTARE.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(47.0))
            .andReturn().getResponse();
    }  
    
    @Test
    public void shouldReturnHectare() throws Exception {         
        mockMvc.perform(post("/api/v1/acreshectare")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestData.ACRES.getConsts())						
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.unitValue").value(19.0))
            .andReturn().getResponse();
    }                  
}

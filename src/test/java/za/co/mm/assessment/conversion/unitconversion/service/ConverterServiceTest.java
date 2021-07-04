/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mm.assessment.conversion.unitconversion.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.Matchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import za.co.mm.assessment.conversion.unitconversion.dto.InputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.dto.OutputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.service.impl.ConverterServiceImpl;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Nicky Mthembu
 */
@RunWith(MockitoJUnitRunner.class)
public class ConverterServiceTest {
    
   // @Autowired
    private ConverterService converterService;
    
    private OutputConverterDTO outputConverterDTO;
    private InputConverterDTO inputConverterDTO;    
    @Before
    public void init(){
        converterService = new ConverterServiceImpl();
    }
    @Test
    public void should_ReturnFahrenheit() throws Exception { 
        inputConverterDTO = new InputConverterDTO("CELSIUStoFAHRENHEIT",45); 
        outputConverterDTO = converterService.convertCelsiusFahrenheit(inputConverterDTO);
        assertThat(113.0,is(outputConverterDTO.getUnitValue()));
    }
    public void should_ReturnCelsius() throws Exception { 
        inputConverterDTO = new InputConverterDTO("FAHRENHEITtoCELSIUS",112.0); 
        outputConverterDTO = converterService.convertCelsiusFahrenheit(inputConverterDTO);
        assertThat(45,is(outputConverterDTO.getUnitValue()));
    }    
    public void should_ReturnKilometer() throws Exception { 
        inputConverterDTO = new InputConverterDTO("MILEtoKILOMETER",11.2); 
        outputConverterDTO = converterService.convertKilometerMile(inputConverterDTO);
        assertThat(18.0,is(outputConverterDTO.getUnitValue()));
    }
    public void should_ReturnMile() throws Exception { 
        inputConverterDTO = new InputConverterDTO("KILOMETERtoMILE",18.0); 
        outputConverterDTO = converterService.convertKilometerMile(inputConverterDTO);
        assertThat(11.2,is(outputConverterDTO.getUnitValue()));
    }
    public void should_ReturnLiter() throws Exception { 
        inputConverterDTO = new InputConverterDTO("GALLONtoLITER",40.9); 
        outputConverterDTO = converterService.convertLiterGallon(inputConverterDTO);
        assertThat(9.0,is(outputConverterDTO.getUnitValue()));
    }  
    public void should_ReturnGallon() throws Exception { 
        inputConverterDTO = new InputConverterDTO("LITERtoGALLON",9.0); 
        outputConverterDTO = converterService.convertLiterGallon(inputConverterDTO);
        assertThat(40.9,is(outputConverterDTO.getUnitValue()));
    } 
    public void should_ReturnPound() throws Exception { 
        inputConverterDTO = new InputConverterDTO("KILOGRAMtoPOUND",14.0); 
        outputConverterDTO = converterService.convertKilogramPound(inputConverterDTO);
        assertThat(30.9,is(outputConverterDTO.getUnitValue()));
    }  
    public void should_ReturnKilogram() throws Exception { 
        inputConverterDTO = new InputConverterDTO("POUNDtoKILOGRAM",30.9); 
        outputConverterDTO = converterService.convertKilogramPound(inputConverterDTO);
        assertThat(14.0,is(outputConverterDTO.getUnitValue()));
    }  
    public void should_ReturnAcres() throws Exception { 
        inputConverterDTO = new InputConverterDTO("HECTAREtoACRES",19.0); 
        outputConverterDTO = converterService.convertAcresHectare(inputConverterDTO);
        assertThat(47.0,is(outputConverterDTO.getUnitValue()));
    }  
    public void should_ReturnHectare() throws Exception { 
        inputConverterDTO = new InputConverterDTO("ACREStoHECTARE",47.0); 
        outputConverterDTO = converterService.convertAcresHectare(inputConverterDTO);
        assertThat(19.0,is(outputConverterDTO.getUnitValue()));
    }    
}

package za.co.mm.assessment.conversion.unitconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.mm.assessment.conversion.unitconversion.dto.InputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.dto.OutputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.service.ConverterService;

/**
 *
 * @author Nicky Mthembu
 * This class control request response
 */
@RestController
@RequestMapping("/api/v1")
public class ConverterController {
    @Autowired
    private ConverterService converterService;
    //this RequestResponse method Celsius Fahrenheit and vice versa    
    @RequestMapping(value="/celsiusfahrenheit", method = RequestMethod.POST)
    public ResponseEntity<OutputConverterDTO> getCelsiusFahrenheit(@RequestBody InputConverterDTO converterDTO){                   
        return new ResponseEntity<>(converterService.convertCelsiusFahrenheit(converterDTO),HttpStatus.OK);
    }
    //this RequestResponse method Acres Hectare and vice versa    
    @RequestMapping(value="/acreshectare", method = RequestMethod.POST)
    public ResponseEntity<OutputConverterDTO> getAcresHectare(@RequestBody InputConverterDTO converterDTO){                   
        return new ResponseEntity<>(converterService.convertAcresHectare(converterDTO),HttpStatus.OK);
    }
    //this RequestResponse method Kilogram Pound and vice versa    
    @RequestMapping(value="/kilogrampound", method = RequestMethod.POST)
    public ResponseEntity<OutputConverterDTO> getKilogramPound(@RequestBody InputConverterDTO converterDTO){                   
        return new ResponseEntity<>(converterService.convertKilogramPound(converterDTO),HttpStatus.OK);
    }
    //this RequestResponse method Kilometer Mile and vice versa    
    @RequestMapping(value="/kilometermile", method = RequestMethod.POST)
    public ResponseEntity<OutputConverterDTO> getKilometerMile(@RequestBody InputConverterDTO converterDTO){                   
        return new ResponseEntity<>(converterService.convertKilometerMile(converterDTO),HttpStatus.OK);
    }
    //this RequestResponse method Liter Gallon and vice versa    
    @RequestMapping(value="/litergallon", method = RequestMethod.POST)
    public ResponseEntity<OutputConverterDTO> getLiterGallon(@RequestBody InputConverterDTO converterDTO){                   
        return new ResponseEntity<>(converterService.convertLiterGallon(converterDTO),HttpStatus.OK);
    }    

}

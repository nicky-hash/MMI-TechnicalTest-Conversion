package za.co.mm.assessment.conversion.unitconversion.service.impl;

import org.springframework.stereotype.Service;
import za.co.mm.assessment.conversion.unitconversion.constant.UnitNameConstant;
import za.co.mm.assessment.conversion.unitconversion.dto.InputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.dto.OutputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.formula.Formula;
import za.co.mm.assessment.conversion.unitconversion.service.ConverterService;

/**
 *
 * @author Nicky Mthembu
 * This class implements converter method
 */
@Service
public class ConverterServiceImpl implements ConverterService {
    private  OutputConverterDTO outputConverterDTO;
 
    //this method convert Celsius Fahrenheit and vice versa
    @Override
    public OutputConverterDTO convertCelsiusFahrenheit(InputConverterDTO converterDTO) {
        double  celsiusFahrenheit = UnitNameConstant.CELSIUStoFAHRENHEIT.toString().equalsIgnoreCase(converterDTO.getUnitType())? 
                Formula.celsiusToFahrenheit.apply(converterDTO.getUnitValue()): Formula.fahrenheitToCelsius.apply(converterDTO.getUnitValue());
                outputConverterDTO = new OutputConverterDTO(converterDTO.getUnitType(),roundOff(celsiusFahrenheit));
        return outputConverterDTO;
    }
    //this method convert Acres Hectare and vice versa
    @Override
    public OutputConverterDTO convertAcresHectare(InputConverterDTO converterDTO) {
        double acresHectare = UnitNameConstant.ACREStoHECTARE.toString().equalsIgnoreCase(converterDTO.getUnitType())?
                Formula.acresToHectare.apply(converterDTO.getUnitValue()): Formula.hectareToAcres.apply(converterDTO.getUnitValue());
                outputConverterDTO = new OutputConverterDTO(converterDTO.getUnitType(),roundOff(acresHectare));                
        return outputConverterDTO;   
    }
    //this method convert Kilogram Pound and vice versa
    @Override
    public OutputConverterDTO convertKilogramPound(InputConverterDTO converterDTO) {
        double kilogramPound = UnitNameConstant.KILOGRAMtoPOUND.toString().equalsIgnoreCase(converterDTO.getUnitType())?
                Formula.kilogramToPound.apply(converterDTO.getUnitValue()): Formula.poundToKilogram.apply(converterDTO.getUnitValue());
                outputConverterDTO = new OutputConverterDTO(converterDTO.getUnitType(),roundOff(kilogramPound)); 
        return outputConverterDTO;   
    }
    //this method convert Kilometer Mile and vice versa
    @Override
    public OutputConverterDTO convertKilometerMile(InputConverterDTO converterDTO) {
        double kilometerMile = UnitNameConstant.KILOMETERtoMILE.toString().equalsIgnoreCase(converterDTO.getUnitType())?
                Formula.kilometerToMile.apply(converterDTO.getUnitValue()): Formula.mileToKilometer.apply(converterDTO.getUnitValue());
                outputConverterDTO = new OutputConverterDTO(converterDTO.getUnitType(),roundOff(kilometerMile));                
        return outputConverterDTO;   
    }
    //this method convert Liter Gallon and vice versa
    @Override
    public OutputConverterDTO convertLiterGallon(InputConverterDTO converterDTO) {
        double literGallon = UnitNameConstant.LITERtoGALLON.toString().equalsIgnoreCase(converterDTO.getUnitType())?
                Formula.literToGallon.apply(converterDTO.getUnitValue()): Formula.gallonToLiter.apply(converterDTO.getUnitValue());
                outputConverterDTO = new OutputConverterDTO(converterDTO.getUnitType(),roundOff(literGallon));                
                
        return outputConverterDTO; 
    } 
    
    private double roundOff(double input){
        return Math.round(input * 10.0) / 10.0;
    }
}
    


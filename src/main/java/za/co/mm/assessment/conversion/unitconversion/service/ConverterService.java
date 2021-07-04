package za.co.mm.assessment.conversion.unitconversion.service;

import za.co.mm.assessment.conversion.unitconversion.dto.InputConverterDTO;
import za.co.mm.assessment.conversion.unitconversion.dto.OutputConverterDTO;

/**
 *
 * @author Nicky Mthembu
 */
public interface ConverterService {
    public OutputConverterDTO convertAcresHectare(InputConverterDTO converterDTO);
    public OutputConverterDTO convertCelsiusFahrenheit(InputConverterDTO converterDTO);
    public OutputConverterDTO convertKilogramPound(InputConverterDTO converterDTO);
    public OutputConverterDTO convertKilometerMile(InputConverterDTO converterDTO);
    public OutputConverterDTO convertLiterGallon(InputConverterDTO converterDTO);
}

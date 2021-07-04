package za.co.mm.assessment.conversion.unitconversion.constant;

/**
 *
 * @author Nicky Mthembu
 * This class contains test data
 */
public enum TestData {
    CELSIUS("{ \"unitType\": \"CELSIUStoFAHRENHEIT\", \"unitValue\": 45 }"),
    FAHRENHEIT("{ \"unitType\": \"FAHRENHEITtoCELSIUS\", \"unitValue\": 113.0 }"),
    KILOMETER("{ \"unitType\": \"KILOMETERtoMILE\", \"unitValue\": 18 }"),
    MILE("{ \"unitType\": \"MILEtoKILOMETER\", \"unitValue\": 11.2 }"),
    GALLON("{ \"unitType\": \"GALLONtoLITER\", \"unitValue\": 2.0 }"),
    LITER("{ \"unitType\": \"LITERtoGALLON\", \"unitValue\": 9.0 }"),
    KILOGRAM("{ \"unitType\": \"KILOGRAMtoPOUND\", \"unitValue\": 14 }"),
    POUND("{ \"unitType\": \"POUNDtoKILOGRAM\", \"unitValue\": 30.9 }"),
    HECTARE("{ \"unitType\": \"HECTAREtoACRES\", \"unitValue\": 19.0 }"),
    ACRES("{ \"unitType\": \"ACREStoHECTARE\", \"unitValue\": 47.0 }");

    private final String consts;
    
    TestData(String consts){
        this.consts = consts;
    }
    public String getConsts() {
        return consts;
    }    
    
}

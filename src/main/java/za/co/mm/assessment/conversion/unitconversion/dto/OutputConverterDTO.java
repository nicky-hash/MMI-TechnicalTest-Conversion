package za.co.mm.assessment.conversion.unitconversion.dto;

/**
 *
 * @author Nicky Mthembu
 */
public class OutputConverterDTO {
    private String unitType;
    private double unitValue;

    public OutputConverterDTO() {
    }
    
    public OutputConverterDTO(String unitType, double unitValue) {
        this.unitType = unitType;
        this.unitValue = unitValue;
    }
    
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }   

    @Override
    public String toString() {
        return "OutputConverterDTO{" + "unitType=" + unitType + ", unitValue=" + unitValue + '}';
    }
    
}

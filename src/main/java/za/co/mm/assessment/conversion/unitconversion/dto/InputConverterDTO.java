package za.co.mm.assessment.conversion.unitconversion.dto;

/**
 *
 * @author Nicky Mthembu
 */
public class InputConverterDTO {
    private String unitType;
    private double unitValue;    

    public InputConverterDTO() {
    }
        
    public InputConverterDTO(String unitType, double unitValue) {
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
        return "InputConverterDTO{" + "unitType=" + unitType + ", unitValue=" + unitValue + '}';
    }
    
}

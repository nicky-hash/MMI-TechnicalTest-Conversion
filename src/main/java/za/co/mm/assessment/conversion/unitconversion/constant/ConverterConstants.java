package za.co.mm.assessment.conversion.unitconversion.constant;

/**
 *
 * @author Nicky Mthembu
 * 
 * This class contain contanst values for conversion calculation
 */

public enum ConverterConstants {    
    CELSIUSFAHRENHEIT(1.8),
    CELSIUSFAHRENHEIT32(32),
    KILOMETERMILE(0.62137),
    LITERGALLON(0.21997),
    KILOGRAMPOUND(2.2046),
    HECTAREACRES(2.4711);
    
    private final double consts;
    
    ConverterConstants(double consts){
        this.consts = consts;
    }
    public double getConsts() {
        return consts;
    }
}


package za.co.mm.assessment.conversion.unitconversion.formula;

import java.util.function.Function;
import za.co.mm.assessment.conversion.unitconversion.constant.ConverterConstants;

/**
 *
 * @author Nicky Mthembu
 * Converter Fotmulas
 */
public class Formula {   
    public static final Function<Double,Double> fahrenheitToCelsius = f -> (
            f - ConverterConstants.CELSIUSFAHRENHEIT32.getConsts()) / ConverterConstants.CELSIUSFAHRENHEIT.getConsts(); 
    public static final Function<Double,Double> celsiusToFahrenheit = c -> (
            c * ConverterConstants.CELSIUSFAHRENHEIT.getConsts() + ConverterConstants.CELSIUSFAHRENHEIT32.getConsts() );
    
    public static final Function<Double,Double> kilometerToMile = km -> (
            km * ConverterConstants.KILOMETERMILE.getConsts());    
    public static final Function<Double,Double> mileToKilometer = mi -> (
            mi / ConverterConstants.KILOMETERMILE.getConsts());

    public static final Function<Double,Double> kilogramToPound = kg -> (
            kg * ConverterConstants.KILOGRAMPOUND.getConsts());
    public static final Function<Double,Double> poundToKilogram = lb -> (
            lb / ConverterConstants.KILOGRAMPOUND.getConsts());

    public static final Function<Double,Double> literToGallon = l -> (
            l * ConverterConstants.LITERGALLON.getConsts());
    public static final Function<Double,Double> gallonToLiter = gal -> (
            gal / ConverterConstants.LITERGALLON.getConsts()); 
    
    public static final Function<Double,Double> acresToHectare = ac -> (
            ac / ConverterConstants.HECTAREACRES.getConsts());
    public static final Function<Double,Double> hectareToAcres = ha -> (
            ha * ConverterConstants.HECTAREACRES.getConsts());        
}

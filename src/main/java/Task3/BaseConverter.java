package Task3;

public class BaseConverter {
    public static double convert(double deg, String scale){
        double convertedDeg=0;
        if (scale.equals("F")){
            convertedDeg=(deg*1.8)+32;
        } else if (scale.equals("K")) {
            convertedDeg=deg+273.15;
        }
        return convertedDeg;
    }
}

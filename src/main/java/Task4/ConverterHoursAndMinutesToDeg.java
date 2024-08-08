package Task4;

public class ConverterHoursAndMinutesToDeg {
    public static double getDegrees(int hours,int minutes){
        double hoursDeg=0;
        double minutesDeg=0;

//        Перевод значения часов в градусы
        if (hours<=12){
            hoursDeg=hours*30+minutes/2.0;
        }else {
            hoursDeg=hours*30+minutes/2.0-360;
        }

//        Перевод значения минут в градусы
        minutesDeg=minutes*6;

//        Получение разницы
        double degDiff;
        if (minutesDeg>=hoursDeg){
            degDiff=minutesDeg-hoursDeg;
        } else {
            degDiff=minutesDeg+(360-hoursDeg);
        }

        return degDiff;
    }
}

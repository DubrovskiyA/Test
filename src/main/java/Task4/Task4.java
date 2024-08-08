package Task4;

import java.time.LocalTime;

public class Task4 {
    public static void main(String[] args) {
        int hours=LocalTime.now().getHour();
        int minutes=LocalTime.now().getMinute();
        System.out.println("Время сейчас: "+hours+":"+minutes);


//        Вызов метода для получения разницы в градусах между часовой и минутной стрелками
        double degreesBetweenArrows=ConverterHoursAndMinutesToDeg.getDegrees(hours,minutes);


        String deg=Double.toString(degreesBetweenArrows);
        int i=deg.indexOf('.');
        String cutDeg=deg.substring(0,i);

        if (deg.endsWith("5")){
            System.out.println("Угол между часовой и минутной стрелками часов сейчас составляет: "
                    +degreesBetweenArrows+" градуса по направлению движения стрелок");
        }else {
            if (cutDeg.endsWith("1")&&!cutDeg.equals("11")&&!cutDeg.equals("111")&&!cutDeg.equals("211")&&!cutDeg.equals("311")){
                System.out.println("Угол между часовой и минутной стрелками часов сейчас составляет: "
                        +degreesBetweenArrows+" градус по направлению движения стрелок");
            } else if (cutDeg.endsWith("2")&&!cutDeg.equals("12")&&!cutDeg.equals("112")&&!cutDeg.equals("212")&&!cutDeg.equals("312")) {
                System.out.println("Угол между часовой и минутной стрелками часов сейчас составляет: "
                        +degreesBetweenArrows+" градуса по направлению движения стрелок");
            }
            else if (cutDeg.endsWith("3")&&!cutDeg.equals("13")&&!cutDeg.equals("113")&&!cutDeg.equals("213")&&!cutDeg.equals("313")) {
                System.out.println("Угол между часовой и минутной стрелками часов сейчас составляет: "
                        +degreesBetweenArrows+" градуса по направлению движения стрелок");
            }
            else if (cutDeg.endsWith("4")&&!cutDeg.equals("14")&&!cutDeg.equals("114")&&!cutDeg.equals("214")&&!cutDeg.equals("314")) {
                System.out.println("Угол между часовой и минутной стрелками часов сейчас составляет: "
                        +degreesBetweenArrows+" градуса по направлению движения стрелок");
            }else {
                System.out.println("Угол между часовой и минутной стрелками часов сейчас составляет: "
                        +degreesBetweenArrows+" градусов по направлению движения стрелок");
            }
        }
    }
}


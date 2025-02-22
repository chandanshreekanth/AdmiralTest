package enums;

public class ExtractDays {

    public static void main(String[] args) {

        DaysofTheWeek d=DaysofTheWeek.MONDAY;
        if(d==DaysofTheWeek.MONDAY)
        System.out.println("it's monday");

        for (DaysofTheWeek day:DaysofTheWeek.values())
        {
            System.out.println(day);
        }
    }
}

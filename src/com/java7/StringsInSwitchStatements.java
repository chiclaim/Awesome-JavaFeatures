package com.java7;

/**
 * String 类型可以用在 switch case 语句中
 */
public class StringsInSwitchStatements {
    public static String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
        String typeOfDay;
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
        }
        return typeOfDay;
    }

    public static void main(String[] args) {
        String typeOfDay = getTypeOfDayWithSwitchStatement("Tuesday");
        System.out.println(typeOfDay);
    }
}

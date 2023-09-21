package lesson47_48.enum_game;

import java.util.Scanner;

public class DayOfWeekResolver {
    String userInput;
    DayOfWeek dayOfWeek;

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day of the week:");
        userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();

        return userInput;
    }

    private DayOfWeek userInputToEnum(String userInput) {

        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        switch (userInput) {
            case "monday":
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case "tuesday":
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case "wednesday":
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case "thursday":
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case "friday":
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case "saturday":
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            case "sunday":
                dayOfWeek = DayOfWeek.SUNDAY;
                break;
            default:
                System.out.println("Wrong answer");
                break;
        }

        return dayOfWeek;
    }

    private boolean isWeekend(DayOfWeek dayOfWeek) {
        if (dayOfWeek == DayOfWeek.SATURDAY | dayOfWeek == DayOfWeek.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }

    public void start() {
        String userInput = getUserInput();
            while (!userInput.equals("monday") && !userInput.equals("tuesday") &&
                    !userInput.equals("wednesday") && !userInput.equals("thursday") &&
                    !userInput.equals("friday") && !userInput.equals("saturday") &&
                    !userInput.equals("sunday")){
                System.out.println("You have entered something else.");
                userInput = getUserInput();
            }
        DayOfWeek dayOfWeek = userInputToEnum(userInput);
        boolean result = isWeekend(dayOfWeek);
        System.out.println(userInput + " is Weekend? " + result);
    }

}

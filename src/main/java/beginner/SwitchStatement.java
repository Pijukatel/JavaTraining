package beginner;

public class SwitchStatement {
    public static boolean isWorkday(String day){
        boolean isWorkday;
        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                isWorkday = true;
                break;
            case "Saturday":
            case "Sunday":
                isWorkday = false;
                break;
            default:
                throw new IllegalArgumentException("Not a valid day name.");
        }
        return isWorkday;
    }

    public static int fallThroughBreakReturn(int controlNumber) {
        int test_variable = 0;

        switch(controlNumber) {
            case 1:
                test_variable = 1;
            case 2:
                test_variable = 2;
                break;
            case 3:
                return 3;
            case 4:
                test_variable = 4;
                break;
        }

        return test_variable;

    }
}

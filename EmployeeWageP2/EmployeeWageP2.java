public class EmployeeWageP2 {

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;


    private static final int TOTAL_WORKING_DAYS = 20;
    private static final int TOTAL_WORKING_HOURS = 100;

    private static int employeeAttendence() {
        int employeeAttendence = (int) (Math.random() * 10 % 3); //type-casted
        return employeeAttendence;
    }

    private static int full_timeWage() {
        int full_timeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        return full_timeWage;

    }

    private static int part_timeWage() {
        int part_timeWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
        return part_timeWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to EmployeeWage Computation");

        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;
        while (dayCount <= TOTAL_WORKING_DAYS && workingHours <= TOTAL_WORKING_HOURS) {
            int employeeAttendence = employeeAttendence();
            switch (employeeAttendence) {
                case FULL_TIME:
                    System.out.println("Employee is working full time");
                    workingHours = workingHours + FULL_DAY_HOUR;
                    int full_timeWage = full_timeWage();
                    totalWage = totalWage + full_timeWage();
                    System.out.println("Daily Wage for day : " + dayCount + " is " + full_timeWage());
                    dayCount++;
                    break;
                case PART_TIME:
                    System.out.println("Employee is working part time");
                    workingHours = workingHours + HALF_DAY_HOUR;
                    int part_timeWage = part_timeWage();
                    totalWage = totalWage + part_timeWage();
                    System.out.println("Daily Wage for day : " + dayCount + " is " + part_timeWage());
                    dayCount++;
                    break;
                default:
                    System.out.println("Employee is Absent on day: " + dayCount);
                    dayCount++;
            }
            System.out.println("Total Days : " + (dayCount - 1));
            System.out.println("Total Working Hours : " + workingHours);
            System.out.println("Total wage for a month :" + totalWage);
        }
    }
}


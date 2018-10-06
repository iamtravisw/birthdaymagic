/*
Logic taken from Harvard Birthday calculator by mkerry:
http://people.fas.harvard.edu/~mkerry/s111/code/BirthDayCalculator.txt
*/

import java.util.Calendar;

public class NextBirthday {

    public int userNextBirthday;
    public int selectedDay;
    public int selectedMonth;

    public void setUserNextBirthday(int nextBirthday) {
        this.userNextBirthday = nextBirthday;
    }

    public int getUserNextBirthday() {
        return userNextBirthday;
    }

    public void setSelectedMonth(int selectedMonth) {
        this.selectedMonth = selectedMonth;
    }

    public int getSelectedMonth() {
        return selectedMonth;
    }

    public void setSelectedDay(int selectedDay) {
        this.selectedDay = selectedDay;
    }

    public int getSelectedDay() {
        return selectedDay;
    }

    public void main(String[] args) {

        System.out.println("--------------------------------------------------");
        System.out.println("Starting Next Birthday...");
        System.out.println("--------------------------------------------------");

        Calendar now = Calendar.getInstance();

        int currMonth, currDay, bDay, bMonth;

        // get current date
        currMonth = (now.get(Calendar.MONTH) + 1);
        currDay = (now.get(Calendar.DAY_OF_MONTH));

        // get birthday
        bMonth = getSelectedMonth();
        bDay = getSelectedDay();

        int currentDateCount = currDay;
        int bDateCount = bDay;

        for (int i = 1; i < currMonth; i++) {
            //jan, mar, may, july, aug, oct, dec
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                currentDateCount = currentDateCount + 31;
            }
            //feb
            if (i == 2) {
                currentDateCount = currentDateCount + 28;
            }
            //apr, jun, sept, nov
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                currentDateCount = currentDateCount + 30;
            }
        }

        // count the days between the birthday and the beginning of the year

        for (int i = 1; i < bMonth; i++) {
            //jan, mar, may, jul, aug, oct, dec
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                bDateCount = bDateCount + 31;
            }
            //feb
            if (i == 2) {
                bDateCount = bDateCount + 28;
            }
            //apr, jun, sept, nov
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                bDateCount = bDateCount + 30;
            }
        }

        int daysSinceBDay, daysUntilBDay;

        if (currentDateCount > bDateCount) {
            daysSinceBDay = currentDateCount - bDateCount;
            daysUntilBDay = 365 - daysSinceBDay;
        } else //currentDateCount is less than bDayCount
        {
            daysUntilBDay = bDateCount - currentDateCount;
            daysSinceBDay = 365 - daysUntilBDay;
        }

        System.out.println("It has been " + daysSinceBDay +
                " days since your last birthday.");
        System.out.println("There are " + daysUntilBDay +
                " more days until your next birthday.");
        setUserNextBirthday(daysUntilBDay);
    }
}

public class Zodiac {
    public String zodiac;
    public int selectedDay;
    public int selectedMonth;
    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }
    public String getZodiac() {
        return zodiac;
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
        System.out.println("Starting Zodiac...");
        System.out.println("--------------------------------------------------");
        if ((getSelectedMonth() == 3 && getSelectedDay() >= 21 && getSelectedDay() <= 31) || (getSelectedMonth() == 4 && getSelectedDay() >= 1 && getSelectedDay() <= 19)) {
            System.out.println("Aries, The Ram");
            setZodiac("Aries");
        }

        else if ((getSelectedMonth() == 4 && getSelectedDay() >= 20 && getSelectedDay() <= 31) || (getSelectedMonth() == 5 && getSelectedDay() >= 1 && getSelectedDay() <= 20))
        {
            System.out.println("Taurus");
            setZodiac("Taurus, The Bull");
        }
        else if ((getSelectedMonth() == 5 && getSelectedDay() >= 21 && getSelectedDay() <= 31) || (getSelectedMonth() == 6 && getSelectedDay() >= 1 && getSelectedDay() <= 20))
        {
            System.out.println("Gemini");
            setZodiac("Gemini: The Twins");
        } else if ((getSelectedMonth() == 6 && getSelectedDay() >= 21 && getSelectedDay() <= 31) || (getSelectedMonth() == 7 && getSelectedDay() >= 1 && getSelectedDay() <= 22))
        {
            System.out.println("Cancer");
            setZodiac("Cancer: The Crab");
        } else if ((getSelectedMonth() == 7 && getSelectedDay() >= 23 && getSelectedDay() <= 31) || (getSelectedMonth() == 8 && getSelectedDay() >= 1 && getSelectedDay() <= 22))
        {
            System.out.println("Leo");
            setZodiac("Leo: The Lion");
        } else if ((getSelectedMonth() == 8 && getSelectedDay() >= 23 && getSelectedDay() <= 31) || (getSelectedMonth() == 9 && getSelectedDay() >= 1 && getSelectedDay() <= 22))
        {
            System.out.println("Virgo");
            setZodiac("Virgo: The Virgin");
        } else if ((getSelectedMonth() == 9 && getSelectedDay() >= 23 && getSelectedDay() <= 31) || (getSelectedMonth() == 10 && getSelectedDay() >= 1 && getSelectedDay() <= 22))
        {
            System.out.println("Libra");
            setZodiac("Libra: The Scales");
        } else if ((getSelectedMonth() == 10 && getSelectedDay() >= 23 && getSelectedDay() <= 31) || (getSelectedMonth() == 11 && getSelectedDay() >= 1 && getSelectedDay() <= 21))
        {
            System.out.println("Scorpio");
            setZodiac("Scorpio: The Scorpion");
        } else if ((getSelectedMonth() == 11 && getSelectedDay() >= 22 && getSelectedDay() <= 31) || (getSelectedMonth() == 12 && getSelectedDay() >= 1 && getSelectedDay() <= 21))
        {
            System.out.println("Sagittarius");
            setZodiac("Sagittarius: The Archer");
        } else if ((getSelectedMonth() == 12 && getSelectedDay() >= 22 && getSelectedDay() <= 31) || (getSelectedMonth() == 1 && getSelectedDay() >= 1 && getSelectedDay() <= 19))
        {
            System.out.println("Capricorn");
            setZodiac("Capricorn: The Goat");
        } else if ((getSelectedMonth() == 1 && getSelectedDay() >= 20 && getSelectedDay() <= 31) || (getSelectedMonth() == 2 && getSelectedDay() >= 1 && getSelectedDay() <= 22))
        {
            System.out.println("Aquarius");
            setZodiac("Aquarius: The Water Bearer");
        } else if ((getSelectedMonth() == 2 && getSelectedDay() >= 20 && getSelectedDay() <= 31) || (getSelectedMonth() == 3 && getSelectedDay() >= 1 && getSelectedDay() <= 20))
        {
            System.out.println("Pisces");
            setZodiac("Pisces: The Fish");
        } else {
            System.out.println("Out of Zodiac Date Ranges...");
        }
        System.out.println("Date: " +getSelectedMonth()+ "/" +getSelectedDay());
    }
}

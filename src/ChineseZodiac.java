public class ChineseZodiac {
    public String chineseZodiac;
    public int selectedYear;
    // Start Getters and Setters
    public void setChineseZodiac(String chineseZodiac) {
        this.chineseZodiac = chineseZodiac;
    }
    public String getChineseZodiac() {
        return chineseZodiac;
    }
    public void setSelectedYear(int selectedYear) {
        this.selectedYear = selectedYear;
    }
    public int getSelectedYear() {
        return selectedYear;
    }
    // Stop Getters and Setters
    public void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Starting ChineseZodiac...");
        System.out.println("--------------------------------------------------");
        int year = getSelectedYear();
        String[] zodiac = {"Monkey ", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        setChineseZodiac(zodiac[year % 12]);
        System.out.println("Zodiac is: " +getChineseZodiac());
        //System.out.println(zodiac[year % 12]);
        System.out.println("Year: " +year);
    }
}
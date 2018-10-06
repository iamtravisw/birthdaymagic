public class Generation {
    public String generation;
    public int selectedYear;
    public void setGeneration(String generation) {
        this.generation = generation;
    }
    public String getGeneration() {
        return generation;
    }
    public void setSelectedYear(int selectedYear) {
        this.selectedYear = selectedYear;
    }
    public int getSelectedYear() {
        return selectedYear;
    }
    public void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Starting Zodiac...");
        System.out.println("--------------------------------------------------");
        if (getSelectedYear() >= 1901 && getSelectedYear() <= 1924) {
            System.out.println("GI Generation");
            setGeneration("GI Generation");
        }
        else if (getSelectedYear() >= 1925 && getSelectedYear() <= 1942) {
            System.out.println("Silent Generation");
            setGeneration("Silent Generation");
        }
        else if (getSelectedYear() >= 1943 && getSelectedYear() <= 1964) {
            System.out.println("Baby Boomers");
            setGeneration("Baby Boomers");
        }
        else if (getSelectedYear() >= 1965 && getSelectedYear() <= 1979) {
            System.out.println("Generation X");
            setGeneration("Generation X");
        }
        else if (getSelectedYear() >= 1980 && getSelectedYear() <= 2000) {
            System.out.println("Millennials");
            setGeneration("Millennials");
        }
        else if (getSelectedYear() >= 2001 && getSelectedYear() <= 2013) {
            System.out.println("Generation Z");
            setGeneration("Generation Z");
        }
        else if (getSelectedYear() >= 2014 && getSelectedYear() <= 2024) {
            System.out.println("Alpha Generation");
            setGeneration("Alpha Generation");
        }
        else if (getSelectedYear() >= 2025 && getSelectedYear() <= 9999999) {
            System.out.println("Out of Zodiac Date Ranges...");
            setGeneration("TBD");
        } else {
            System.out.println("Out of Zodiac Date Ranges...");
            setGeneration("Unknown");
        }
        System.out.println("Gen: " +getGeneration());
    }
}

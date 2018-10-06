import java.text.DecimalFormat;

public class AnimalYears {

    private double bearYears;
    private double catYears;
    private double dogYears;
    private double duckYears;
    private double elephantYears;
    private double mouseYears;
    private double snakeYears;
    private double lionYears;
    private double selectedYear;

    public void setBearYears(double bearYears) {
        this.bearYears = bearYears;
    }
    public double getBearYears() {
        return bearYears;
    }
    public void setCatYears(double catYears) {
        this.catYears = catYears;
    }
    public double getCatYears() {
        return catYears;
    }
    public void setDogYears(double dogYears) {
        this.dogYears = dogYears;
    }
    public double getDogYears() {
        return dogYears;
    }
    public void setDuckYears(double duckYears) {
        this.duckYears = duckYears;
    }
    public double getDuckYears() {
        return duckYears;
    }
    public void setElephantYears(double elephantYears) {
        this.elephantYears = elephantYears;
    }
    public double getElephantYears() {
        return elephantYears;
    }
    public void setMouseYears(double mouseYears) {
        this.mouseYears = mouseYears;
    }
    public double getMouseYears() {
        return mouseYears;
    }
    public void setSnakeYears(double snakeYears) {
        this.snakeYears = snakeYears;
    }
    public double getSnakeYears() {
        return snakeYears;
    }
    public void setLionYears(double lionYears) {
        this.lionYears = lionYears;
    }
    public double getLionYears() {
        return lionYears;
    }
    public void setSelectedYear(double selectedYear) {
        this.selectedYear = selectedYear;
    }
    public double getSelectedYear() {
        return selectedYear;
    }
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public void main(String[] args) {

        System.out.println("--------------------------------------------------");
        System.out.println("Starting Planets...");
        System.out.println("--------------------------------------------------");

        double humanDays = (getSelectedYear() * 365 );
        double humanYears = (humanDays / 365);

        double bearYears = (humanYears * 2);
        setBearYears(bearYears); // Set the value
        System.out.println(humanYears+ " / 88 is " +df2.format(getBearYears())+ " (Bear)");

        double catYears = (humanYears * 3.2);
        setCatYears(catYears); // Set the value
        System.out.println(humanYears+ " * 3.2 is " +df2.format(getCatYears())+ " (Cat)");

        double dogYears = (humanYears * 3.64);
        setDogYears(dogYears); // Set the value
        System.out.println(humanYears+ " * 3.64 is " +df2.format(getDogYears())+ " (Dog)");

        double duckYears = (humanYears * 4.21);
        setDuckYears(duckYears); // Set the value
        System.out.println(humanYears+ " * 4.21 is " +df2.format(getDuckYears())+ " (Duck)");

        double elephtantYears = (humanYears * 1.14);
        setElephantYears(elephtantYears); // Set the value
        System.out.println(humanYears+ " * (365 / 29.4) is " +df2.format(getElephantYears())+ " (Elephant)");

        double lionYears = (humanYears * 2.29);
        setLionYears(lionYears); // Set the value
        System.out.println(humanYears+ " * 2.29 is " +df2.format(getLionYears())+ " (Lion)");

        double mouseYears = (humanYears * 20);
        setMouseYears(mouseYears); // Set the value
        System.out.println(humanYears+ " * 20 is " +df2.format(getMouseYears())+ " (Mouse)");

        double snakeYears = (humanYears * 18);
        setSnakeYears(snakeYears); // Set the value
        System.out.println(humanYears+ " * 18 is " +df2.format(getSnakeYears())+ " (Snake)");
        System.out.println("Human days: " +humanDays+ ". Human years: " +humanYears);
    }
}

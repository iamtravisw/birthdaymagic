import java.text.DecimalFormat;

public class Planets {

    private double mercuryYears;
    private double vernusYears;
    private double marsYears;
    private double jupiterYears;
    private double saturnYears;
    private double uranusYears;
    private double neptuneYears;
    private double plutoYears;
    private double selectedYear;

    public void setMercuryYears(double mercuryYears) {
        this.mercuryYears = mercuryYears;
    }
    public double getMercuryYears() {
        return mercuryYears;
    }
    public void setVernusYears(double vernusYears) {
        this.vernusYears = vernusYears;
    }
    public double getVernusYears() {
        return vernusYears;
    }
    public void setMarsYears(double marsYears) {
        this.marsYears = marsYears;
    }
    public double getMarsYears() {
        return marsYears;
    }
    public void setJupiterYears(double jupiterYears) {
        this.jupiterYears = jupiterYears;
    }
    public double getJupiterYears() {
        return jupiterYears;
    }
    public void setSaturnYears(double saturnYears) {
        this.saturnYears = saturnYears;
    }
    public double getSaturnYears() {
        return saturnYears;
    }
    public void setUranusYears(double uranusYears) {
        this.uranusYears = uranusYears;
    }
    public double getUranusYears() {
        return uranusYears;
    }
    public void setNeptuneYears(double neptuneYears) {
        this.neptuneYears = neptuneYears;
    }
    public double getNeptuneYears() {
        return neptuneYears;
    }
    public void setPlutoYears(double plutoYears) {
        this.plutoYears = plutoYears;
    }
    public double getPlutoYears() {
        return plutoYears;
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

        double earthDays = (getSelectedYear() * 365 );

        double mercuryYears = (earthDays / 88);
        setMercuryYears(mercuryYears); // Set the value
        System.out.println(earthDays+ " / 88 is " +df2.format(getMercuryYears())+ " (Mercury)");

        double venusYears = (earthDays / 225);
        setVernusYears(venusYears); // Set the value
        System.out.println(earthDays+ " / 225 is " +df2.format(getVernusYears())+ " (Venus)");

        double marsYears = (earthDays / 678);
        setMarsYears(marsYears); // Set the value
        System.out.println(earthDays+ " / 678 is " +df2.format(getMarsYears())+ " (Mars)");

        double jupiterYears = (earthDays / (11.8 * 365));
        setJupiterYears(jupiterYears); // Set the value
        System.out.println(earthDays+ " * (365 / 11.8) is " +df2.format(getJupiterYears())+ " (Jupiter)");

        double saturnYears = (earthDays / (29.4  * 365));
        setSaturnYears(saturnYears); // Set the value
        System.out.println(earthDays+ " * (365 / 29.4) is " +df2.format(getSaturnYears())+ " (Saturn)");

        double uranusYears = (earthDays / (84 * 365));
        setUranusYears(uranusYears); // Set the value
        System.out.println(earthDays+ " * (365 / 84) is " +df2.format(getUranusYears())+ " (Uranus)");

        double neptuneYears = (earthDays / (164 * 365));
        setNeptuneYears(neptuneYears); // Set the value
        System.out.println(earthDays+ " * (365 / 164) is " +df2.format(getNeptuneYears())+ " (Neptune)");

        double plutoYears = (earthDays / (248 * 365));
        setPlutoYears(plutoYears); // Set the value
        System.out.println(earthDays+ " * (365 / 248) is " +df2.format(getPlutoYears())+ " (Pluto)");

        System.out.println("Earth days: " +earthDays);
    }
}

// Import libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Main extends JFrame {

    public Main() { // Constructor
        frame();            // Method
    }
    public void frame() { // Method for JFrame

        // Created @ CSU-Global, Programming II, Module 2.
        final JFrame frame = new JFrame(); // Create the JFrame (Window) and name it
        final JPanel panel = new JPanel(); // Create the Area within the Window
        frame.getContentPane().add(panel); // Add the panel as content pane
        final Integer[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // Options for Month
        final JComboBox myMonth  = new JComboBox(months); // Create a Combobox for Months
        final JLabel monthText = new JLabel("Month:"); // Create a label for the Months
        final Integer[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}; // Option for Day
        final JComboBox myDays = new JComboBox(days); // Create a Combobox for Days
        final JLabel daysText = new JLabel("Day:"); // Create a label for the Days
        final JTextField year = new JTextField(); // Year textField
        year.setPreferredSize(new Dimension(50, 24)); // Set the size of the year textField
        final JLabel yearText = new JLabel("Year:"); // Create a label for the year
        final JLabel results = new JLabel(""); // Create a blank label for the results, we will replace this blank space with data later

        // Created after the fact for additional portfolio work
        final ChineseZodiac chinese = new ChineseZodiac();
        final Zodiac zodiac = new Zodiac();
        final Birthstone birthstone = new Birthstone();
        final Flower flower = new Flower();
        final Generation generation = new Generation();
        final Planets planets = new Planets();
        final NextBirthday nextBirthday = new NextBirthday();
        final AnimalYears animalYears = new AnimalYears();
        final JLabel chineseZodiac = new JLabel("");
        final JLabel zodiacLabel = new JLabel("");
        final JLabel nextLabel = new JLabel("");
        final JLabel gem = new JLabel("");
        final JLabel flowerLabel = new JLabel("");
        final JLabel genLabel = new JLabel("");
        final JLabel planetLabel = new JLabel("");
        final JLabel animalLabel = new JLabel("");

        // End additional labels
        JButton button = new JButton("Submit"); // Create a button for the user to calculate their results
        button.addActionListener(new ActionListener() { // Add ActionLister for the Submit Button
            @Override
            public void actionPerformed(ActionEvent e) {
                final int selectedMonth = (Integer) myMonth.getSelectedItem(); // Get Month
                final int selectedDay = (Integer)  myDays.getSelectedItem(); // Get Day
                final int selectedYear = Integer.parseInt(year.getText()); // Get Year
                // Next 3 lines are to calculate the difference between the users birthday and the current date
                final LocalDate birthday = LocalDate.of(selectedYear, selectedMonth, selectedDay);
                final LocalDate now = LocalDate.now();
                final Period period = Period.between(birthday, now);

                // Next line will present the results and replace the blank line 'results' from above
                results.setText("<html><center></br>"+
                        "Your birthday is " + selectedMonth + "/" + selectedDay + "/" + selectedYear + " which makes you exactly " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days old.<br/>");
                String[] args = {}; // create args

                // Chinese Zodiac
                chinese.setSelectedYear(selectedYear); // Send selectedYear to ChineseZodiac
                chinese.main(args); // pass args to chineseZodiac
                chineseZodiac.setText("<html><center><br/>" +
                        "--------------------------------------------------"+
                        "<br/>Eastern Zodiac<br/>"+
                        "--------------------------------------------------"+
                        "<br/> The " +chinese.getChineseZodiac()+ "</br>"); // Update GUI

                // Generation
                generation.setSelectedYear(selectedYear); // Send selectedMonth to Generation
                generation.main(args); // pass args to Generation
                genLabel.setText("<html><br/><center>" +
                        "--------------------------------------------------"+
                        "<br/>Which generation are you from?<br/>"+
                        "--------------------------------------------------"+
                        "<br/>" +generation.getGeneration()+ "<br/>"); // Update GUI

                // Zodiac (Western)
                zodiac.setSelectedMonth(selectedMonth); // Send selectedMonth to Zodiac
                zodiac.setSelectedDay(selectedDay); // Send selectedMonth to Zodiac
                zodiac.main(args); // pass args to Zodiac
                zodiacLabel.setText("<html><br/><center>" +
                        "--------------------------------------------------"+
                        "<br/>Western Zodiac<br/>"+
                        "--------------------------------------------------"+
                        "<br/>" +zodiac.getZodiac()+"<br/>"); // Update GUI

                // Birthstone/ Gemstone
                birthstone.setSelectedMonth(selectedMonth); // Send selectedMonth to Birthstone
                birthstone.main(args); // pass args to Birthstone
                gem.setText("<html><br/><center>" +
                        "--------------------------------------------------"+
                        "<br/>Birthstone<br/>"+
                        "--------------------------------------------------"+
                        "<br/>" +birthstone.getGemStone()+ "<br/>");

                // Flower
                flower.setSelectedMonth(selectedMonth); // Send selectedMonth to Flower
                flower.main(args); // pass args to Flower
                flowerLabel.setText("<html><br/><center>" +
                        "--------------------------------------------------"+
                        "<br/>Birthday Flower<br/>"+
                        "--------------------------------------------------"+
                        "<br/>" +flower.getFlower()+ "<br/>"); // Update GUI

                // Next Birthday
                nextBirthday.setSelectedMonth(selectedMonth); // Send selectedMonth to Zodiac
                nextBirthday.setSelectedDay(selectedDay); // Send selectedMonth to Zodiac
                nextBirthday.main(args); // pass args to Zodiac
                nextLabel.setText("<html><br/><center>" +
                        "--------------------------------------------------"+
                        "<br/>Birthday Countdown<br/>"+
                        "--------------------------------------------------"+
                        "<br/>" +nextBirthday.getUserNextBirthday()+" days<br/>"); // Update GUI

                // Planets
                planets.setSelectedYear(period.getYears()); // Send selectedYear to Planets
                planets.main(args); // pass args to Planets
                planetLabel.setText("<html><center><br/>" +
                        "--------------------------------------------------"+
                        "<br/>What's your age on other planets?<br/>"+
                        "--------------------------------------------------"+
                        "<br/>Mercury: " +df2.format(planets.getMercuryYears())+ " years old. <br/>Venus: " +df2.format(planets.getVernusYears())+ " years old. <br/>"+
                        "Mars: " +df2.format(planets.getMarsYears())+ " years old. <br/>Jupiter: " +df2.format(planets.getJupiterYears())+ " years old. <br/>"+
                        "Saturn: " +df2.format(planets.getSaturnYears())+ " years old. <br/>Uranus: " +df2.format(planets.getUranusYears())+ " years old. <br/>"+
                        "Neptune: " +df2.format(planets.getNeptuneYears())+ " years old. <br/>Pluto: " +df2.format(planets.getPlutoYears())+ " years old.");

                // Animal Years
                animalYears.setSelectedYear(period.getYears()); // Send selectedYear to Planets
                animalYears.main(args); // pass args to Planets
                animalLabel.setText("<html><center><br/>" +
                        "--------------------------------------------------"+
                        "<br/>Age if you were an animal?<br/>"+
                        "--------------------------------------------------"+
                        "<br/>Bear: " +df2.format(animalYears.getBearYears())+ " years old. <br/>Cat: " +df2.format(animalYears.getCatYears())+ " years old. <br/>"+
                        "Dog: " +df2.format(animalYears.getDogYears())+ " years old. <br/>Duck: " +df2.format(animalYears.getDuckYears())+ " years old. <br/>"+
                        "Elephant: " +df2.format(animalYears.getElephantYears())+ " years old. <br/>Lion: " +df2.format(animalYears.getLionYears())+ " years old. <br/>"+
                        "Mouse: " +df2.format(animalYears.getMouseYears())+ " years old. <br/>Snake: " +df2.format(animalYears.getSnakeYears())+ " years old.");
            }
        });
        // Add the fields in the order I want them displayed
        panel.add(monthText); // Text for Month
        panel.add(myMonth); // Dropdown for Month
        panel.add(daysText); // Text for Days
        panel.add(myDays); // Dropdown for Days
        panel.add(yearText); // Text for Year
        panel.add(year); // Textbox for Year
        panel.add(button); // Add the button to the panel
        panel.add(results); // Submit button
        panel.add(chineseZodiac);
        panel.add(zodiacLabel);
        panel.add(genLabel);
        panel.add(gem);
        panel.add(flowerLabel);
        panel.add(nextLabel);
        panel.add(planetLabel);
        panel.add(animalLabel);


        // This area wasn't required, but I found a cool tutorial on YouTube and wanted to try it out
        JMenuBar menu = new JMenuBar(); // Create object for MenuBar
        frame.setJMenuBar(menu); // Add MenuBar

        // Add File Menu item
        JMenu file = new JMenu("File");
        menu.add(file);

        // Make Exit sub menu item
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);

        // Make Exit close application
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
            }
        });

        // Add about Menu item
        JMenu about = new JMenu("About");
        menu.add(about);

        // Make creator sub menu item
        JMenuItem creator = new JMenuItem("Creator");
        about.add(creator);

        // Make creator sub menu bring up an informational dialog menu
        creator.addActionListener(new ActionListener() {
            @Override
            final public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Birthday Magic\nApp Version: 1.0" +
                        "\n\n--------------------------------------------------\n\n" +
                        "Created by: Travis Woodward\nNeed help? www.iamtravisw.com" +
                        "\n\n--------------------------------------------------\n\n" +
                        "Icon made by Freepik from www.flaticon.com \n\n");
            }
        });

        // Parameters for the JFrame
        final int F_WIDTH = 800; // Set width
        final int F_HEIGHT = 600; // Set height
        frame.setSize(F_WIDTH, F_HEIGHT); // finalize size
        frame.setTitle("What's your Birthday?"); // Rename/ name title for the frame/ window
        frame.setLocationRelativeTo(null); // makes application open in center of the screen.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // behavior on close
        frame.setVisible(true); // Make set visible as the last thing to do
    }
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {

        new Main(); // Call Birthday so the GUI will open

    }
}
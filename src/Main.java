// Import libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Period;

public class Main extends JFrame {

    public Main() { // Constructor
        frame();            // Method
    }
    public void frame() { // Method for JFrame

        // Created @ CSU-Global, Programming II, Module 2.
        final JFrame frame = new JFrame("What's your birthday?"); // Create the JFrame (Window) and name it
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
        final JLabel extra = new JLabel("");
        final JLabel chineseZodiac = new JLabel("");
        final JLabel zodiacLabel = new JLabel("");
        final JLabel gem = new JLabel("");
        final JLabel flowerLabel = new JLabel("");
        final JLabel genLabel = new JLabel("");


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
                results.setText("Your birthday is " + selectedMonth + "/" + selectedDay + "/" + selectedYear + " which makes you exactly " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days old.");
                extra.setText("Now time for some fun facts...");

                // Communicate with other objects/ modules
                String[] args = {}; // create args
                // Chinese Zodiac
                chinese.setSelectedYear(selectedYear); // Send selectedYear to ChineseZodiac
                chinese.main(args); // pass args to chineseZodiac
                chineseZodiac.setText("Your Chinese Zodiac is: " +chinese.getChineseZodiac()+ "."); // Update GUI
                // Zodiac (Western)
                zodiac.setSelectedMonth(selectedMonth); // Send selectedMonth to Zodiac
                zodiac.setSelectedDay(selectedDay); // Send selectedMonth to Zodiac
                zodiac.main(args); // pass args to Zodiac
                zodiacLabel.setText("Your Western Zodiac is: " +zodiac.getZodiac()+ "."); // Update GUI
                // Birthstone/ Gemstone
                birthstone.setSelectedMonth(selectedMonth); // Send selectedMonth to Birthstone
                birthstone.main(args); // pass args to Birthstone
                gem.setText("Your Birthstone is: " +birthstone.getGemStone()+ "."); // Update GUI
                // Flower
                flower.setSelectedMonth(selectedMonth); // Send selectedMonth to Flower
                flower.main(args); // pass args to Flower
                flowerLabel.setText("Your Flower is: " +flower.getFlower()+ "."); // Update GUI
                // Flower
                generation.setSelectedYear(selectedYear); // Send selectedMonth to Flower
                generation.main(args); // pass args to Flower
                genLabel.setText("Your Generation is the: " +generation.getGeneration()+ "."); // Update GUI

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
        panel.add(extra);
        panel.add(chineseZodiac);
        panel.add(zodiacLabel);
        panel.add(gem);
        panel.add(flowerLabel);
        panel.add(genLabel);

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
                        "Created by: Travis Woodward\nNeed something? www.iamtravisw.com" +
                        "\n\n--------------------------------------------------\n\n" +
                        "Have a wonderful day!\n\n");
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
    public static void main(String[] args) {

        new Main(); // Call Birthday so the GUI will open

    }
}
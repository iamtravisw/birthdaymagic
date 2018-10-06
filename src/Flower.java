public class Flower {
    public String flower;
    public int selectedMonth;

    public void setFlower(String flower) {
        this.flower = flower;
    }
    public String getFlower() {
        return flower;
    }
    public void setSelectedMonth(int selectedMonth) {
        this.selectedMonth = selectedMonth;
    }
    public int getSelectedMonth() {
        return selectedMonth;
    }
    public void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("Starting Birthstones");
        System.out.println("--------------------------------------------------");

        if (selectedMonth == 1)
        {
            System.out.println("Carnations");
            setFlower("Carnations");
        }
        else if (selectedMonth == 2)
        {
            System.out.println("Violets");
            setFlower("Violets");
        }
        else if (selectedMonth == 3)
        {
            System.out.println("Daffodils");
            setFlower("Daffodils");
        }
        else if (selectedMonth == 4)
        {
            System.out.println("Daisies");
            setFlower("Daisies");
        }
        else if (selectedMonth == 5)
        {
            System.out.println("Lily of the Valley");
            setFlower("Lily of the Valley");
        }
        else if (selectedMonth == 6)
        {
            System.out.println("Roses");
            setFlower("Roses");
        }
        else if (selectedMonth == 7)
        {
            System.out.println("Larkspur");
            setFlower("Larkspur");
        }
        else if (selectedMonth == 8)
        {
            System.out.println("Gladiolus");
            setFlower("Gladiolus");
        }
        else if (selectedMonth == 9)
        {
            System.out.println("Aster");
            setFlower("Aster");
        }
        else if (selectedMonth == 10)
        {
            System.out.println("Calendula");
            setFlower("Calendula");
        }
        else if (selectedMonth == 11)
        {
            System.out.println("Chrysanthemum");
            setFlower("Chrysanthemum");
        }
        else if (selectedMonth == 12)
        {
            System.out.println("Narcissus");
            setFlower("Narcissus");
        }
        else {
            System.out.println("No valid option.");
        }
    }
}
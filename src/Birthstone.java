public class Birthstone {
    public String gemStone;
    public int selectedMonth;

    public void setGemStone(String gemStone) {
        this.gemStone = gemStone;
    }
    public String getGemStone() {
        return gemStone;
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
            System.out.println("Garnet");
            setGemStone("Garnet");
        }
        else if (selectedMonth == 2)
        {
            System.out.println("Amethyst");
            setGemStone("Amethyst");
        }
        else if (selectedMonth == 3)
        {
            System.out.println("Aquamarine Bloodstone");
            setGemStone("Aquamarine Bloodstone");
        }

        else if (selectedMonth == 4)
        {
            System.out.println("Diamond");
            setGemStone("Diamond");
        }
        else if (selectedMonth == 5)
        {
            System.out.println("Emerald");
            setGemStone("Emerald");
        }
        else if (selectedMonth == 6)
        {
            System.out.println("Alexandrite Moonstone");
            setGemStone("Alexandrite Moonstone");
        }
        else if (selectedMonth == 7)
        {
            System.out.println("Ruby");
            setGemStone("Ruby");
        }
        else if (selectedMonth == 8)
        {
            System.out.println("Peridot Sardonyx Spinel");
            setGemStone("Peridot Sardonyx Spinel");
        }
        else if (selectedMonth == 9)
        {
            System.out.println("Sapphire");
            setGemStone("Sapphire");
        }
        else if (selectedMonth == 10)
        {
            System.out.println("Opal Tourmaline");
            setGemStone("Opal Tourmaline");
        }
        else if (selectedMonth == 11)
        {
            System.out.println("Topaz Citrine");
            setGemStone("Topaz Citrine");
        }
        else if (selectedMonth == 12)
        {
            System.out.println("Tanzanite Zircon Turquoise");
            setGemStone("Tanzanite Zircon Turquoise");
        }
        else {
            System.out.println("No valid option.");
        }
    }
}
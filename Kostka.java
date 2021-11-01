package CV_7;

public class Kostka {
    private int pocetSten;

    public Kostka(int pocetSten)
    {
        this.pocetSten = pocetSten;
    }
    public int hodKoskou()
    {
        return (int)((Math.random() * pocetSten) + 1);
    }

    @Override
    public String toString() {
        return "Kostka ma " + pocetSten + " sten a padlo " + hodKoskou();
    }
}

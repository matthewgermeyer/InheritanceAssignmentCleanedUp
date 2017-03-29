
public class Keepers extends SoccerPlayers{
    protected boolean veryTall;

    public Keepers (int age, String country, String foot, boolean veryTall) {
        super(age, country, foot);
        this.veryTall = veryTall;
    }
    //Methods
    public String talk(){
        return "..";
    }

    public boolean isVeryTall() {
        return veryTall;
    }

    public void setVeryTall(boolean veryTall) {
        this.veryTall = veryTall;
    }

    @Override
    public String toString() {
        return "Keeper{" +
                "veryTall=" + veryTall + super.toString() +
                '}';
    }
}
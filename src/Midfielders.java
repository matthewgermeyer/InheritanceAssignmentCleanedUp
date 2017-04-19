public final class Midfielders extends Outfielders{

    protected boolean Anchor;
    protected boolean BallPlaying;
    protected boolean BallWinner;
    protected boolean Finishing;
    protected boolean Playmaker;
    protected String GrowthPotential;


    //Constructor

    public Midfielders(int age, String country, String foot, boolean attackMinded, boolean anchor, boolean ballPlaying, boolean ballWinner, boolean finishing, boolean playmaker, String growthPotential) {
        super(age, country, foot, attackMinded);
        Anchor = anchor;
        BallPlaying = ballPlaying;
        BallWinner = ballWinner;
        Finishing = finishing;
        Playmaker = playmaker;
        GrowthPotential = growthPotential;
    }

    //Methods
    public String myAge(){
        System.out.println("My age is "+ age);
        return "" + age;
    }
    protected String intro(){
        String info = "I play midfield. I am " + getAge() + " years old. I am ";
        if (getFoot().equals("R")) {
            info += " right footed";
        } else {
            info += " left footed";
        }
        return info;
    }
    //GET SET
    public boolean isAnchor() {
        return Anchor;
    }

    public void setAnchor(boolean anchor) {
        Anchor = anchor;
    }

    public boolean isBallPlaying() {
        return BallPlaying;
    }

    public void setBallPlaying(boolean ballPlaying) {
        BallPlaying = ballPlaying;
    }

    public boolean isBallWinner() {
        return BallWinner;
    }

    public void setBallWinner(boolean ballWinner) {
        BallWinner = ballWinner;
    }

    public boolean isFinishing() {
        return Finishing;
    }

    public void setFinishing(boolean finishing) {
        Finishing = finishing;
    }

    public boolean isPlaymaker() {
        return Playmaker;
    }

    public void setPlaymaker(boolean playmaker) {
        Playmaker = playmaker;
    }

    public String getGrowthPotential() {
        return GrowthPotential;
    }

    public void setGrowthPotential(String growthPotential) {
        GrowthPotential = growthPotential;
    }


    //toString();

    @Override
    public String toString() {
        return "Midfielders{" +
                "Anchor=" + Anchor +
                ", BallPlaying=" + BallPlaying +
                ", BallWinner=" + BallWinner +
                ", Finishing=" + Finishing +
                ", Playmaker=" + Playmaker +
                ", GrowthPotential='" + GrowthPotential + super.toString() +
                '}';
    }
}

public final class Forwards extends Outfielders{
    protected boolean Pace;
    protected boolean Dribble;
    protected boolean HoldUp;
    protected boolean Power;
    protected boolean Cross;
    protected String FirstTouch;
    protected boolean Placement;
    protected boolean TakeOn;

    //Constructor
    public Forwards(int age, String country, String foot, boolean attackMinded, boolean pace, boolean dribble, boolean holdUp, boolean power, boolean cross, String firstTouch, boolean placement, boolean takeOn) {
        super(age, country, foot, attackMinded);
        Pace = pace;
        Dribble = dribble;
        HoldUp = holdUp;
        Power = power;
        Cross = cross;
        FirstTouch = firstTouch;
        Placement = placement;
        TakeOn = takeOn;
    }

    //Methods
    public String talk(){
        return "..";
    }



    //Get Set
    public boolean isPace() {
        return Pace;
    }

    public void setPace(boolean pace) {
        Pace = pace;
    }

    public boolean isDribble() {
        return Dribble;
    }

    public void setDribble(boolean dribble) {
        Dribble = dribble;
    }

    public boolean isHoldUp() {
        return HoldUp;
    }

    public void setHoldUp(boolean holdUp) {
        HoldUp = holdUp;
    }

    public boolean isPower() {
        return Power;
    }

    public void setPower(boolean power) {
        Power = power;
    }

    public boolean isCross() {
        return Cross;
    }

    public void setCross(boolean cross) {
        Cross = cross;
    }

    public String getFirstTouch() {
        return FirstTouch;
    }

    public void setFirstTouch(String firstTouch) {
        FirstTouch = firstTouch;
    }

    public boolean isPlacement() {
        return Placement;
    }

    public void setPlacement(boolean placement) {
        Placement = placement;
    }

    public boolean isTakeOn() {
        return TakeOn;
    }

    public void setTakeOn(boolean takeOn) {
        TakeOn = takeOn;
    }

    //toString()
    @Override
    public String toString() {
        return "Forwards{" +
                "Pace=" + Pace +
                ", Dribble=" + Dribble +
                ", HoldUp=" + HoldUp +
                ", Power=" + Power +
                ", Cross=" + Cross +
                ", FirstTouch='" + FirstTouch + '\'' +
                ", Placement=" + Placement +
                ", TakeOn=" + TakeOn + super.toString()+
                '}';
    }
}

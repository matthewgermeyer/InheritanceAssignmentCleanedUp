public final class Defenders extends Outfielders {
    protected boolean IsTall;
    protected boolean GetsForward;
    protected boolean LongBall;
    protected boolean Anchor;
    protected boolean Heading;
    protected boolean Marking;

    public Defenders(int age, String country, String foot, boolean attackMinded, boolean isTall, boolean getsForward, boolean longBall, boolean anchor, boolean heading, boolean marking) {
        super(age, country, foot, attackMinded);
        IsTall = isTall;
        GetsForward = getsForward;
        LongBall = longBall;
        Anchor = anchor;
        Heading = heading;
        Marking = marking;
    }


    //Methods
    public String talk() {
        return "..";
    }

    public String myAge() {
        System.out.println("My age is " + age);
        return "" + age;
    }

    public boolean isTall() {
        return IsTall;
    }

    public void setTall(boolean tall) {
        IsTall = tall;
    }

    public boolean isGetsForward() {
        return GetsForward;
    }

    public void setGetsForward(boolean getsForward) {
        GetsForward = getsForward;
    }

    public boolean isLongBall() {
        return LongBall;
    }

    public void setLongBall(boolean longBall) {
        LongBall = longBall;
    }

    public boolean isAnchor() {
        return Anchor;
    }

    public void setAnchor(boolean anchor) {
        Anchor = anchor;
    }

    public boolean isHeading() {
        return Heading;
    }

    public void setHeading(boolean heading) {
        Heading = heading;
    }

    public boolean isMarking() {
        return Marking;
    }

    public void setMarking(boolean marking) {
        Marking = marking;
    }

    @Override
    public String toString() {
        return "Defenders{" +
                "IsTall=" + IsTall +
                ", GetsForward=" + GetsForward +
                ", LongBall=" + LongBall +
                ", Anchor=" + Anchor +
                ", Heading=" + Heading +
                ", Marking=" + Marking + super.toString() +
                '}';
    }
}

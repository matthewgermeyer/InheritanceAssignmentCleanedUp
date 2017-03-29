public abstract class Outfielders extends SoccerPlayers {
    protected boolean AttackMinded;

    //Constructor
    public Outfielders(int age, String country, String foot, boolean attackMinded) {
        super(age, country, foot);
        AttackMinded = attackMinded;
    }


    //Methods
    public String talk(){
        return "..";
    }

    public boolean isAttackMinded() {
        return AttackMinded;
    }

    public void setAttackMinded(boolean attackMinded) {
        AttackMinded = attackMinded;
    }

    @Override
    public String toString() {
        return "Outfielders{" +
                "AttackMinded=" + AttackMinded + super.toString()+
                '}';
    }
}

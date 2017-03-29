public abstract class SoccerPlayers {
    protected int age;
    protected String country;
    protected String foot;

    //Constructor
    public SoccerPlayers(int age, String country, String foot) {
        this.age = age;
        this.country = country;
        this.foot = foot;
    }
    //Methods
    public String talk(){
        return "..";


    }

    //Get Set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "SoccerPlayers{" +
                "age=" + age +
                ", country='" + country + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }
}

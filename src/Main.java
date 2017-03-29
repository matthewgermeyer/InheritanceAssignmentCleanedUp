public class Main {

    public static void main(String[] args) {
	Defenders paco = new Defenders(11, "MEX", "R", false,
            true, false, false,
            true, true, true);

	Defenders luna = new Defenders(10, "USA", "L", false,
            false, true, true,
            false, true, true);

	Keepers manuel = new Keepers(11, "USA", "R", true);

    Forwards salah = new Forwards(12, "USA", "R", true, true,
            true, false, true, true, "Strong", true,
            true);

    Midfielders manny = new Midfielders(11, "USA", "R", false, false,
            true, true, true, false, "Significant");

        System.out.println(paco);
        System.out.println(luna);
        System.out.println(manuel);
        System.out.println(salah);
        System.out.println(manny);

        System.out.println("\n\n");

        System.out.println("Paco says " + paco.talk());
        System.out.println("Manny introduces himself " + manny.intro());

//        luna.talk();
//        manuel.talk();
//        salah.talk();
//        manny.talk();
//
    }
}


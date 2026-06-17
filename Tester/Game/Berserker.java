package Tester.Game;

public class Berserker extends Warrior {
    public Berserker(String name) {
        super(name, 220, 1, 20);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Road Rage Mode");
    }

    @Override
    public String getJobTitle() {
        return "Berserker";
    }
}

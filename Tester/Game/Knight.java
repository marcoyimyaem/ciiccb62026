package Tester.Game;

public class Knight extends Warrior implements CanAttack {

    public Knight(String name) {
        super(name, 200, 1, 80);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useSpecialMove() {
        System.out.println("Bowling Bash");
    }

    @Override
    public String getJobTitle() {
        return "Knight";
    }

    @Override
    public void attack(GameCharacter target) {
        }

    @Override
    public int getDamage() {
        return 0;
        }

}

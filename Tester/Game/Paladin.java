package Tester.Game;
public class Paladin extends Warrior implements CanHeal {

    public Paladin(String name) {
        super(name, 180, 1, 70);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void heal(GameCharacter target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'heal'");
    }

    @Override
    public int getHealAmount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHealAmount'");
    }

    @Override
    public void useSpecialMove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'useSpecialMove'");
    }

    @Override
    public String getJobTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJobTitle'");
    }

}

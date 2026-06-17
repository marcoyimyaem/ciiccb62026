package Tester.Game;

public class Wizard extends Mage implements CanAttack{

    public Wizard(String name ) {
        super(name, 100, 1, 200);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void attack(GameCharacter target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public int getDamage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDamage'");
    }

    @Override
    public void useMagic() {
    }

    @Override
    public String getJobTitle() {
        return "Wizard";
    }

}

package Tester.Game;

public class Priest extends Mage implements CanHeal {

    public Priest(String name) {
        super(name, 120, 1, 100);
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
    public void useMagic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'useMagic'");
    }

    @Override
    public String getJobTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJobTitle'");
    }

}

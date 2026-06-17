package Tester.Game;

public class GunSlinger extends Warrior implements CanShotGun {

    public GunSlinger(String name) {
        super(name, 100, 1, 30);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void rangeAttack(GameCharacter target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rangeAttack'");
    }

    @Override
    public int getRangeDamage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRangeDamage'");
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
